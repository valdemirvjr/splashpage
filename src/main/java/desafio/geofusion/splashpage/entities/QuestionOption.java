package desafio.geofusion.splashpage.entities;


import javax.persistence.*;

@Entity
public class QuestionOption
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String optionText;

    private Integer votes;

    @ManyToOne
    private Question question;

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

    public Question getQuestion()
    {
        return question;
    }

    public void setQuestion(Question question)
    {
        this.question = question;
    }

    @Override
    public String toString()
    {
        return "QuestionOption{" +
                "id=" + id +
                ", optionText='" + optionText + '\'' +
                ", votes=" + votes +
                ", question=" + question +
                '}';
    }
}
