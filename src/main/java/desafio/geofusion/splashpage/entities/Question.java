package desafio.geofusion.splashpage.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question
{
    @Id
    private Integer id;

    private String questionText;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getQuestionText()
    {
        return questionText;
    }

    public void setQuestionText(String questionText)
    {
        this.questionText = questionText;
    }
}
