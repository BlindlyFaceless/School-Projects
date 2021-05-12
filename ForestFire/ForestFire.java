import java.util.Random;
import java.util.concurrent.TimeUnit;

class ForestFire
{
    /*
    🌲 = Tree, 
    🔥 = Burning, 
    b = Started burning (temp var),  
        = Empty, 
    e = just burnt (temp var)
    */
	static String[][] forest = 
    {
		{"🌲", "🌲", "🌲", "🌲", "🌲"},
		{"🌲", "🌲", "🌲", "🌲", "🌲"},
		{"🌲", "🌲", "🌲", "🌲", "🌲"},
		{"🌲", "🌲", "🌲", "🌲", "🌲"},
		{"🌲", "🌲", "🌲", "🌲", "🌲"}
    };
    public static void main(String[] args) 
    {
        int runTime = 0;
        while(runTime < 50)
        {
            burnNearBy();
            clearBurning();
            for(int row  = 0; row < forest.length; row++)
            {
                for(int col  = 0; col < forest[row].length; col++)
                {
                    lightingStrike(row, col);
                    seedGrow(row, col);
                }
            }
            System.out.print("Run number " + (runTime + 1) + System.lineSeparator());
            System.out.print(printAll());
            runTime++;
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.print("\033[H\033[2J");   
            System.out.flush();   
        }
    }

    //MUST RUN FIRST
    public static void burnNearBy()
    {
        String[][] temp = forest;
        for(int row = 0; row < temp.length; row++)
        {
            for(int col = 0; col < temp[row].length; col++)
            {
                if(checkAt(row, col))
                {
                    //check left side
                    if((col+1) < forest[row].length && checkAtForTree(row, col+1))
                    {
                        if((row+1) < forest.length && checkAtForTree(row+1, col+1)) 
                        {
                            temp[row+1][col+1] = "b";
                        }
                        if((row-1) >= 0 && checkAtForTree(row-1, col+1))
                        {
                            temp[row-1][col+1] = "b";
                        }
                        temp[row][col+1] = "b";
                    }
                    //check right side
                    if((col - 1) >= 0 && checkAtForTree(row, col-1))
                    {
                        if((row+1) < forest.length && checkAtForTree(row+1, col-1))
                        {
                            temp[row+1][col-1] = "b";
                        }
                        if((row-1) >= 0 && checkAtForTree(row-1, col-1))
                        {
                            temp[row-1][col-1] = "b";
                        }
                        temp[row][col-1] = "b";
                    }
                    //check top + bottom
                    if((row+1) < forest.length && checkAtForTree(row+1, col))
                    {
                        temp[row+1][col] = "b";
                    }
                    if((row - 1) >= 0 && checkAtForTree(row-1, col))
                    {
                        temp[row-1][col] = "b";
                    }

                }        
               
            }
        }
        forest = temp;
    }

    //MUST RUN SECOND
    public static void clearBurning()
    {
        for(int row = 0; row < forest.length; row++)
        {
            for(int col = 0; col < forest[row].length; col++)
            {
                if(forest[row][col] == "🔥")
                    forest[row][col] = "e";
                if(forest[row][col] == "b")
                    forest[row][col] = "🔥";
            }
        }
    }

    //MUST RUN THIRD
    public static void lightingStrike(int row, int col)
    {
        boolean p = new Random().nextInt(50)==0; //1 in 50 chance of burning
        if(p && forest[row][col] == "🌲")
        {
            forest[row][col] = "🔥";
            System.out.println("lightingStrike at " + (row+1) + " " + (col+1));
        }
    }

    public static void seedGrow(int row, int col)
    {
        boolean p = new Random().nextInt(20)==0; //1 in 20 chance of tree growing
        if(p && forest[row][col] == " ") //spot must be empty and tree must be able to grow
        {
            forest[row][col] = "🌲";
            System.out.println("tree grew at " + (row+1) + " " + (col+1));
        }
        if(forest[row][col] == "e")
        {
            forest[row][col] = " ";
        }
    }


    //HELPER METHODS
        //Check for burning tree
    public static boolean checkAt(int rowPos, int colPos)
    {
        return forest[rowPos][colPos] == "🔥";
    }
        //check for tree
		public static boolean checkAtForTree(int rowPos, int colPos)
    {
        return forest[rowPos][colPos] == "🌲";
    }

    //print array
    public static String printAll()
    {
        String outString = "";
        for(int row  = 0; row < forest.length; row++)
        {
            for(int col  = 0; col < forest[row].length; col++)
            {
                outString += forest[row][col] + " ";
            }
            outString += System.lineSeparator();
        }
        return outString;
    }

}
    