public class Testing
{
    public static void main(String args[])
    {
        Mountain m = new Mountain();
        int[] arr = {1, 2, 3, 2, 1};
        int[] arr1 = {11, 22, 33, 22, 11};
        int[] arr2 = {9, 3, 5, 7, 5};
        int[] arr3 = {11, 22, 33, 55, 77};
        int[] arr4 = {99, 33, 55, 77, 120};
        int[] arr5 = {9, 3, 5, 7, 5};

        System.out.println(m.isMountain(arr));
        System.out.println(m.isMountain(arr1));
        System.out.println(m.isMountain(arr2));
        System.out.println(m.isMountain(arr3));
        System.out.println(m.isMountain(arr4));
        System.out.println(m.isMountain(arr5));

        System.out.println(m.getPeakIndex(arr));
        System.out.println(m.getPeakIndex(arr1));
        System.out.println(m.getPeakIndex(arr2));
        System.out.println(m.getPeakIndex(arr3));
        System.out.println(m.getPeakIndex(arr4));
        System.out.println(m.getPeakIndex(arr5));
    }     
}

