public class Tournament 
{
    static String newLine = System.getProperty("line.separator");
    public static void main(String[] args) 
    {
        SoccerTeam s1 = new SoccerTeam("Blue Team 1", 0, 0, 0);
        SoccerTeam s2 = new SoccerTeam("Red Team 2", 0, 0, 0);
        SoccerTeam s3 = new SoccerTeam("Yellow Team 3", 0, 0, 0);
        SoccerTeam s4 = new SoccerTeam("Green Team 4", 0, 0, 0);
        SoccerTeam s5 = new SoccerTeam("Purple Team 5", 0, 0, 0);
        SoccerTeam s6 = new SoccerTeam("Orange Team 6", 0, 0, 0);
        SoccerTeam s7 = new SoccerTeam("Black Team 7", 0, 0, 0);
        SoccerTeam s8 = new SoccerTeam("White Team 8", 0, 0, 0);

        playRound(s1, s2, s3, s4);
        playRound(s5, s6, s7, s8);

        playRound(checkWins(s1, s2), checkWins(s3, s4), checkWins(s5, s6), checkWins(s7, s8));

        outWinner(checkWins(checkWins(checkWins(s1, s2), checkWins(s3, s4)), checkWins(checkWins(s5, s6), checkWins(s7, s8))));
    }

    static void playRound(SoccerTeam one, SoccerTeam two, SoccerTeam three, SoccerTeam four)
    {
        one.playAgainst(two);
        three.playAgainst(four);
        System.out.println("---BREAK---" + newLine);
        checkWins(one, two).playAgainst(checkWins(three, four));
        System.out.println("---BREAK---" + newLine);
    }

    static SoccerTeam checkWins(SoccerTeam one, SoccerTeam two)
    {
        if(one.score > two.score)
            return one;
        else
            return two;
    }

    static void outWinner(SoccerTeam winner)
    {
        System.out.println("---Winner---");
        System.out.println(winner.toString());
        
    }
}
