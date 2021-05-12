import java.util.Random;

public class SoccerTeam 
{
    String name = "";
    int wins = 0;
    int losses = 0;
    int draws = 0;
    int score = 0;
    String newLine = System.getProperty("line.separator");

    SoccerTeam()
    {
        name = "Team Name";
        wins = 0;
        losses = 0;
        draws = 0;
        getScore();
    }

    SoccerTeam(String N)
    {
        name = N;
        wins = (int) new Random().nextInt(21);
        losses = (int) new Random().nextInt(21);
        draws = (int) new Random().nextInt(21);
        getScore();
    }

    SoccerTeam(String N, int W, int L, int D)
    {
        name = N;
        wins = W;
        losses = L;
        draws = D;
        getScore();
    }
    
    void getScore()
    {
        score = (wins * 3) + draws;
    }

    public void playAgainst(SoccerTeam other)
    {
        int myGoals = 0;
        int otherGoals = 0;
        int totalGoals = 0;

        while(totalGoals < 21)
        {
            int r = new Random().nextInt(101);
            if(r > 54)
            {
                myGoals++; 
                totalGoals++;
            }
            else
            {
                otherGoals++; 
                totalGoals++;
            }
        }
        
        if(otherGoals > myGoals)
        {
            other.wins++;
            this.losses++;

            other.getScore();
            this.getScore();
        }
        else if(myGoals > otherGoals)
        {
            this.wins++;
            other.losses++;

            other.getScore();
            this.getScore();
        }
        else if(myGoals == otherGoals)
        {
            other.draws++;
            this.draws++;

            System.out.println("Draw" + newLine);
            other.getScore();
            this.getScore();
        }

        System.out.println(this.toString() + newLine);
        System.out.println(other.toString() + newLine);
    }

    @Override
    public String toString()
    {
        String out = "---" + name + "---" + newLine + 
        "---Wins:" + wins + "---" + newLine +
        "---Losses:" + losses + "---" + newLine +
        "---Draws:" + draws + "---" + newLine +
        "---Score:" + score + "---";
        return out;
    }    
}