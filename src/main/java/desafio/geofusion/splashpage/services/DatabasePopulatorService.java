package desafio.geofusion.splashpage.services;

import desafio.geofusion.splashpage.dao.QuestionDao;
import desafio.geofusion.splashpage.entities.Question;
import desafio.geofusion.splashpage.entities.QuestionOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class DatabasePopulatorService
{
    private static final Logger LOGGER = LogManager.getLogger(DatabasePopulatorService.class);

    private static final String csvFile = "classpath:feedback-questions.csv";

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private QuestionDao questionDao;

    @PostConstruct
    public void populate()
    {
        for(Question question : getFeedbackQuestions())
        {
            questionDao.create(question);
        }

        LOGGER.info("Busca de todas as question na base");

        Collection<Question> questions = questionDao.readAll();

        for(Question question : questions)
        {
            LOGGER.info(question);
        }
    }

    private List<Question> getFeedbackQuestions()
    {
        List<Question> questions = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(getFile(csvFile)))
        {
            String line = "";
            while((line = bufferedReader.readLine()) != null)
            {
                Question question = new Question();
                List<QuestionOption> options = new ArrayList<>();

                String[] questionLine = line.split(";");

                question.setQuestionText(questionLine[0]);

                for(int i = 1; i < questionLine.length; i++)
                {
                    QuestionOption option = new QuestionOption();
                    option.setOptionText(questionLine[i]);

                    options.add(option);
                }

                question.setOptions(options);

                questions.add(question);
            }
        }
        catch (FileNotFoundException e)
        {
            LOGGER.error("Arquivo nao encontrado", e);
        }
        catch (IOException e)
        {
            LOGGER.error(e);
        }

        return questions;
    }

    private InputStreamReader getFile(String file) throws IOException
    {
        Resource resource = applicationContext.getResource(file);

        return new InputStreamReader(resource.getInputStream());
    }
}
