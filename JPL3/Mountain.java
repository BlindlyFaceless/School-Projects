public class Mountain 
{
    public static boolean isIncreasing(int[] array, int stop) 
    {
        for(int i = 0; i < stop; i++)
        {
            if(array[i] >= array[i+1])
                return false;
        }
        return true;
    }   
    
    public static boolean isDecreasing(int[] array, int start) 
    {
        for(int i = start; i < array.length; i++)
        {
            if(i + 1 < array.length)
            {
                if(array[i] <= array[i+1])
                    return false;
            }
        }
        return true;
    }

    public static int getPeakIndex(int[] array)
    {
        int out = -1;
        for(int i = 0; i < array.length; i++)
        {
            if(i + 1 < array.length && i - 1 > 0)
            {
                if(array[i] > array[i+1] && array[i] > array[i-1])
                {
                    out = i;
                }
            }
        }
        return out;
    }

    public boolean isMountain(int[] array)
    {
        return isIncreasing(array, ((array.length-1)/2)) && isDecreasing(array, ((array.length-1)/2));
    }
}


