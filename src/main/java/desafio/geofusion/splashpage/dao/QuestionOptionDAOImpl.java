package desafio.geofusion.splashpage.dao;

import desafio.geofusion.splashpage.entities.QuestionOption;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class QuestionOptionDAOImpl extends GenericDAOImpl<QuestionOption, Integer> implements QuestionOptionDAO
{
}
