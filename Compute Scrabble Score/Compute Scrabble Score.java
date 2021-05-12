class Main {
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static int[] points = 
	{1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 3, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    static int[][] magicS = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
    static int[][] magicS2 = {{12, 7, 6}, {9, 5, 1}, {4, 3, 8}};
    static int[][] latinS = {{1, 2, 3, 4}, {3, 4, 1, 2}, {4, 3, 2, 1}, {2, 1, 4, 3}};
    static int[][] latinS2 = {{1, 2, 3, 4}, {3, 4, 1, 2}, {4, 3, 2, 1}, {2, 4, 4, 3}};




  public static void main(String[] args) 
	{
		System.out.println(computeScore("dog"));
		System.out.println(computeScore("homie"));
		System.out.println(computeScore("country"));
		System.out.println(computeScore("bug"));
		System.out.println(computeScore("quesadilla"));

        System.out.println(isMagic(magicS));
        System.out.println(isMagic(magicS2));
        System.out.println("Latin");
        System.out.println(isLatin(latinS));
        System.out.println("Latin 2");
        System.out.println(isLatin(latinS2));
	}

	public static int computeScore(String word)
	{
		int score = 0;
		word = word.toUpperCase();
		for(int i = 0; i < word.length(); i++)
		{
			score +=points[alphabet.indexOf(word.charAt(i))];
		}
		return score;
	}

	public static boolean isMagic(int[][] arr)
	{
		int sum = 0;
		if(arr.length == arr[1].length)
		{
			sum = getSumOfRow(arr, 1);
			//first check
			for(int row = 0; row < arr.length; row++)
			{
				//rows and columns
				if(sum != getSumOfRow(arr, row) && sum != getSumOfCol(arr, row))
				{
					return false;
				}
			}
			//diagonals
			if(sum != getSumOfDiagonal(arr, false) && sum != getSumOfDiagonal(arr, true))
			{
				return false;
            }
			return true;
		}
		return false;
	}

    public static boolean isLatin(int[][] arr)
    {
        
        for(int row = 0; row < arr[0].length; row++)
        {
            for(int col = 0; col < arr[0].length; col++)
            {
                if(col + 1 < arr[0].length)
                {
                    if(arr[row][col] == arr[row][col+1])
                    {
                        return false;
                    }
                }
                if(row + 1 < arr[0].length)
                {
                    if(arr[col][row] == arr[col][row + 1])
                    {
                        return false;
                    }
                }
                
            }
        }
        return true;
    }

	public static int getSumOfRow(int[][] arr, int row)
	{
		int num = 0;
		for(int col  = 0; col < arr[row].length; col++)
		{
			num += arr[row][col];
		}
		return num;
	}

	public static int getSumOfCol(int[][] arr, int col)
	{
		int num = 0;
		for(int row = 0; row < arr[col].length; row++)
		{
			num += arr[row][col];
		}
		return num;
	}

	public static int getSumOfDiagonal(int[][] arr, boolean left)
	{
		int num = 0;
		if(left)
		{
			for(int col = arr[0].length - 1; col > 0; col--)
			{
				num += arr[col][col];
			}
		}
		else
		{
            int row = arr[0].length - 1 ;
			for(int col = 0; col < arr[0].length; col++)
			{
                num += arr[row][col];
                row--;
			}
		}
		return num;
	}
}