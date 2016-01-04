package desafio.geofusion.splashpage.services;

import desafio.geofusion.splashpage.dao.QuestionDao;
import desafio.geofusion.splashpage.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FeedbackService
{
    @Autowired
    private QuestionDao questionDao;

    public Collection<Question> readAllFeedbackQuestions()
    {
        Collection<Question> questions = questionDao.readAll();

        return questions;
    }

    public void saveFeedbackResponse()
    {

    }

}
