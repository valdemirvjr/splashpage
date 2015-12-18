package desafio.geofusion.splashpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FeedbackFormController
{
    @RequestMapping("/feedback")
    public String feedback(Model model)
    {
        model.addAttribute("greeting", "Seu feedback eh muito importante");

        return "feedbackform";
    }

}
