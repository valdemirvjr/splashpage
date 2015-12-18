package desafio.geofusion.splashpage.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuestionOption
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String optionText;

    private Integer votes;

//    private Question question;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getOptionText()
    {
        return optionText;
    }

    public void setOptionText(String optionText)
    {
        this.optionText = optionText;
    }

    public Integer getVotes()
    {
        return votes;
    }

    public void setVotes(Integer votes)
    {
        this.votes = votes;
    }

//    public Question getQuestion()
//    {
//        return question;
//    }
//
//    public void setQuestion(Question question)
//    {
//        this.question = question;
//    }
}
