package com.atguigu.exer;

import org.junit.Test;

public class StringPractise {

    @Test
    public void longestSubstringTest(){
        String s = longestSubstring("abcwerthelloyuiodef", "cvhellobnm");
        System.out.println(s);
    }

    private String longestSubstring(String str1, String str2) {
        String sh = str1.length() < str2.length() ? str1 : str2;
        String ln = str1.length() >= str2.length() ? str1 : str2;
        for (int i = sh.length(); i >0; i--) {

            String sub = null;
            if(ln.contains(sub))
                return sub;
        }
        return null;
    }

    @Test
    public void substringCountTest(){
        int res = substringCout("ad","ab");
        System.out.println(res);
    }

    private int substringCout(String source, String target) {
        if(!source.contains(target))
        return 0;
        int count = 0, st = 0, len = target.length();
        while(source.indexOf(target,st) != -1){
            count++;
            st = len + source.indexOf(target,st);
        }
        return count;
    }

    @Test
    public void stripStringTest() {

    }

    @Test
    public void reverseSubstringTest() {
        String res = reverseSubstring(0, "Hello JavaEEhadoop".length()-1, "Hello JavaEEhadoop");
        System.out.println(res);
    }

    /**
     * 1. Manually implement the trim static method
     *
     * @param str
     * @return
     */
    private String stripString(String str) {
        char[] value = str.toCharArray();
        int lo = 0, hi = value.length - 1;
        while ((lo < hi) && (value[lo] <= ' ')) {
            lo++;
        }
        while ((lo < hi) && (value[hi] <= ' ')) {
            hi--;
        }
        return ((lo > 0) || (hi < value.length - 1)) ? str.substring(lo, hi + 1) : str;
    }

    private String reverseSubstring(int start, int end, String str) {

        char[] val = str.toCharArray();
        if (start < 0 || end > str.length() - 1 || start >= end)
            return str;
        System.out.println(val);
        char temp;
        for (int i = start, j = end; i < j; i++, j--) {
            temp = val[i];
            val[i] = val[j];
            val[j] = temp;
            System.out.println(val);
        }
        return new String(val);

    }

}
