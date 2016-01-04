package desafio.geofusion.splashpage.controllers;

import desafio.geofusion.splashpage.entities.Question;
import desafio.geofusion.splashpage.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class FeedbackController
{
    @Autowired
    private FeedbackService feedbackService;

    @RequestMapping("/feedback")
    public String feedback(Model model)
    {
        Collection<Question> feedbackQuestions = feedbackService.readAllFeedbackQuestions();

        model.addAttribute("greeting", "Seu feedback eh muito importante");
        model.addAttribute("feedbackQuestions", feedbackQuestions);

        return "feedback";
    }
}
