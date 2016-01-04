package desafio.geofusion.splashpage.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String questionText;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<QuestionOption> options;

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

    public List<QuestionOption> getOptions()
    {
        return options;
    }

    public void setOptions(List<QuestionOption> options)
    {
        this.options = options;
    }

    @Override
    public String toString()
    {
        return "Question{" +
                "id=" + id +
                ", questionText='" + questionText + '\'' +
                ", options=" + options +
                '}';
    }
}
