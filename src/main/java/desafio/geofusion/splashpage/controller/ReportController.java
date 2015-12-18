package desafio.geofusion.splashpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportController
{
    @RequestMapping("/report")
    public String report(Model model)
    {
        model.addAttribute("h1", "Relatorio");

        return "report";
    }
}
