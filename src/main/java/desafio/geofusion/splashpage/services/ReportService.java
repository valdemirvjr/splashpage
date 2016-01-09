package desafio.geofusion.splashpage.services;

import desafio.geofusion.splashpage.dao.QuestionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService
{
    @Autowired
    private QuestionDAO questionDao;

}
