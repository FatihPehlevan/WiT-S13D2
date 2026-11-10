package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberToWords(-12));

    }
    public static boolean isPalindrome (int number) {
        String trimmed = String.valueOf(number);
        trimmed = trimmed.replace("-", "");
        char[] chars = new char[trimmed.length()];
        for (int i = trimmed.length()-1; i >= 0; i--) {
            chars[trimmed.length()-1-i] = trimmed.charAt(i);
        }
        String reversed = new String(chars);
        return trimmed.equals(reversed);
    }

    public static boolean isPerfectNumber(int number) {
        if(number<0) return false;
        int sum = 0;
        for (int i = 1; i<number; i++){
            if(number % i == 0){
                sum+= i;
            }
        }
        return number == sum;
    }

    public static String numberToWords (int number){
        if (number<0) return "Invalid Value";

        String nmbrStr = String.valueOf(number);
        String output = "";

        for (int i = 0; i<nmbrStr.length(); i++){
            char c = nmbrStr.charAt(i);

            switch(c) {
                case '1':
                    output+= " One";
                    break;
                case '2':
                    output+= " Two";
                    break;
                case '3':
                    output+= " Three";
                    break;
                case '4':
                    output+= " Four";
                    break;
                case '5':
                    output+= " Five";
                    break;
                case '6':
                    output+= " Six";
                    break;
                case '7':
                    output+= " Seven";
                    break;
                case '8':
                    output+= " Eight";
                    break;
                case '9':
                    output+= " Nine";
                    break;
                case '0':
                    output+= " Zero";
                    break;
            }
        }
        return output.trim();
    }
}