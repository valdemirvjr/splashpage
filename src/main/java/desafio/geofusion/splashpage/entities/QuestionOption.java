package desafio.geofusion.splashpage.entities;


import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = QuestionOption.ONE_MORE_VOTE, query = "UPDATE QuestionOption qo SET votes=votes+1 WHERE qo.id IN :list_id")
})
public class QuestionOption
{
    public static final String ONE_MORE_VOTE = "QuestionOption.OneMoreVote";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String optionText;

    private Integer votes;

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

    public void oneMoreVote()
    {
        if(this.votes == null)
        {
            this.votes = 1;
        }
        else
        {
            this.votes++;
        }
    }

    @Override
    public String toString()
    {
        return "QuestionOption{" +
                "id=" + id +
                ", optionText='" + optionText + '\'' +
                ", votes=" + votes +
                '}';
    }
}
