package desafio.geofusion.splashpage.controllers;

import desafio.geofusion.splashpage.dao.QuestionDAO;
import desafio.geofusion.splashpage.entities.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class ReportController
{
    private static final Logger LOGGER = LogManager.getLogger(ReportController.class);

    @Autowired
    private QuestionDAO questionDao;

    @RequestMapping("/report")
    public String report(Model model)
    {
        LOGGER.info("Buscando questoes e numero de votos para gerar o relatorio...");

        Collection<Question> questions = questionDao.readAll();

        model.addAttribute("questions", questions);

        return "report";
    }
}
