/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ejercicios0;

/**
 *
 * @author eibaneza
 */
public class Palindromo {
    
    public Palindromo () {}
    
    
    public boolean checkPalindrome (String cadena) {
        boolean result=true;
        int i=0;
        int stringMiddle = cadena.length()/2;
        do {
            int y = cadena.length()-1-i;
            if (cadena.charAt(i) != cadena.charAt(y)){
                result=false;
            }
            i++;
        }while (result==true && i<stringMiddle);
                
        return result;
        
    }
    
    public boolean checkPalindromicNumber(int number) {
        String stringNumber = Integer.toString(number);
        return this.checkPalindrome(stringNumber);
    }
    
    public int factorize (int number){
        int result=1;
        for(int i=1;i<=number;i++){
            result=result*i;
        }
        return result;
    }
    public int findGreatestCommonDivisor(int x, int y){
        int gcd=1;
        int smaller = Math.min(x, y);
        for (int i=2;i<=smaller;i++){
            if (x%i == 0 && y%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    
    public String reverseString(String string){
        String result;
        char swapChar;
        char swapArray [] = string.toCharArray();
        for(int i=0;i<string.length()/2;i++){
            swapChar = swapArray[i];
            swapArray[i] = swapArray[string.length()-1-i];
            swapArray[string.length()-1-i] = swapChar;
        }
        result = String.valueOf(swapArray);
        return result;
    }
    
    public boolean isAmstrongNumber(int number){
        boolean result=false;
        double operation=0;
        String numStr=Integer.toString(number);
        double digits = numStr.length();
        for(int i = 0; i < digits; i++){
            double num = Character.getNumericValue(numStr.charAt(i));
            operation = operation + Math.pow(num, digits);
        }
        if (operation == number)
            result = true;
       
        return result;
    
    }
    
    public void workOutRice(int weight) {
        int oneKg = 0;
        int threeKg = 0;
        int fiveKg = weight / 5;
        int rest = weight%5;
        if (rest > 0){
            threeKg = (rest/3);
            rest = rest%3;
            if (rest > 0){
                oneKg = rest;
            }
                    
        }
        System.out.println("To satisfy " + weight + " of rice we need: ");
        if (fiveKg > 0)
            System.out.println(fiveKg + " 5Kg packages");
        if (threeKg > 0)
            System.out.println(threeKg + " 3Kg packages");
        if (oneKg > 0)
            System.out.println(oneKg + " 1Kg packages");
    }
}
