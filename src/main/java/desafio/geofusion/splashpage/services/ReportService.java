package desafio.geofusion.splashpage.services;

import desafio.geofusion.splashpage.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService
{
    @Autowired
    private QuestionDao questionDao;

}
