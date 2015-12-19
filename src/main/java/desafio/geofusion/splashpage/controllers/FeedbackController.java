package desafio.geofusion.splashpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FeedbackController
{
    @RequestMapping("/feedback")
    public String feedback(Model model)
    {
        model.addAttribute("greeting", "Seu feedback eh muito importante");

        return "feedback";
    }

}
