package com.sdtbu.chapter03;

public class Utils {
    private Utils()
    {

    }
    public static int getMax(int[] arr)
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
