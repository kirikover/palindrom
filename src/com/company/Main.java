package com.company;

public class Main {

    public static void main(String[] args) {
       String d= "dude";
       if(isPalindrome(d)){
           System.out.print("it palindrom");
       }
       else {
           System.out.print("not palindrom");
       }
    }
        public static String reverseString(String s) {
            String p="";
            for (int i = s.length() - 1; i >= 0; --i) {
                p += s.charAt(i);
            }
            return p;
        }
        public static boolean isPalindrome(String s){
        String back;
        back=reverseString(s);
        if (back.equals(s)){
            return true;
        }
        return false;
    }
}
