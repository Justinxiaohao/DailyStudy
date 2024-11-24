package com.sdtbu.chapter01;
//统计字符串中的大小写字母个数，并分别输出，要求将字符串转为数组，加上统计数字
public class Demo07String {
    public static void main(String[] args)
    {
        String s = "HelloWorld";
        char[] chars = s.toCharArray();
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] >= 'a' && chars[i] <= 'z')
            {
                count++;
            }
            else if (chars[i] >= 'A' && chars[i] <= 'Z')
                count1++;
            else count2++;

        }System.out.println(count);
        System.out.println(count1);
        System.out.println(count2);
    }


}
