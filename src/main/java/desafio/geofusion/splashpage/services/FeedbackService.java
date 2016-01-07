package desafio.geofusion.splashpage.services;

import desafio.geofusion.splashpage.dao.QuestionDao;
import desafio.geofusion.splashpage.entities.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;

@Service
public class FeedbackService
{
    private static final Logger LOGGER = LogManager.getLogger(FeedbackService.class);
    @Autowired
    private QuestionDao questionDao;

    public Collection<Question> readAllFeedbackQuestions()
    {
        Collection<Question> questions = questionDao.readAll();

        return questions;
    }

    public void saveUserFeedback(Map<Integer, Integer> answeredQuestions)
    {

    }

}
