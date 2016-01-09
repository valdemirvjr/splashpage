package desafio.geofusion.splashpage.services;

import desafio.geofusion.splashpage.dao.QuestionDAO;
import desafio.geofusion.splashpage.dao.QuestionOptionDAO;
import desafio.geofusion.splashpage.entities.Question;
import desafio.geofusion.splashpage.entities.QuestionOption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

@Service
public class FeedbackService
{
    private static final Logger LOGGER = LogManager.getLogger(FeedbackService.class);

    @Autowired
    private QuestionDAO questionDao;

    @Autowired
    private QuestionOptionDAO optionDao;

    public Collection<Question> readAllFeedbackQuestions()
    {
        Collection<Question> questions = questionDao.readAll();

        return questions;
    }

    /**
     * Atualiza o numero de votos em cada questao respondida
     *
     * @param answeredQuestions
     */
    public void saveUserFeedback(Map<Integer, Integer> answeredQuestions)
    {
        LOGGER.info("Salvando feedback do usuario...");

        Collection<Integer> asignedOptions = answeredQuestions.values();

        Collection<QuestionOption> options = optionDao.readAll();

        for(QuestionOption option : options)
        {
            if(asignedOptions.contains(option.getId()))
            {
                option.oneMoreVote();

                optionDao.update(option);
            }
        }

        LOGGER.info("Nova contagem de votos:");

        Collection<Question> questions = readAllFeedbackQuestions();

        for(Question question : questions)
        {
            LOGGER.info(question);
        }
    }
}
