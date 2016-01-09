package desafio.geofusion.splashpage.controllers;

import desafio.geofusion.splashpage.dao.QuestionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportController
{
    @Autowired
    private QuestionDAO questionDao;

    @RequestMapping("/report")
    public String report(Model model)
    {
        model.addAttribute("h1", "Relatorio");

        return "report";
    }
}
