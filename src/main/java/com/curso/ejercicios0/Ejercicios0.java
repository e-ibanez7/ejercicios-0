/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.ejercicios0;

/**
 *
 * @author eibaneza
 */
public class Ejercicios0 {
    public static void checkPalindrome(String cadena) {
        Palindromo pruebas = new Palindromo();
        if (pruebas.checkPalindrome(cadena))
            System.out.println("El texto introducido es un palíndromo");
        else
             System.out.println("El texto introducido NO es un palíndromo");
    }
    
    public static void printFactorze(int number){
        Palindromo pruebas = new Palindromo();
        System.out.println(number +" Factorial is equial to: "+ pruebas.factorize(number));
    }
    
    public static void findGCD (int x, int y){
        Palindromo pruebas = new Palindromo();
        System.out.println("The GCD of " + x + " and " + y +" is: " + pruebas.findGreatestCommonDivisor(x, y));
    }
    public static void reverseString (String cadena){
        Palindromo pruebas = new Palindromo();
        System.out.println("The '" + cadena + "string reversed is: " + pruebas.reverseString(cadena));
        
    }
    public static void isAmstrongNumber(int number) {
        Palindromo pruebas = new Palindromo();
        if (pruebas.isAmstrongNumber(number)){
            System.out.println("Number " + number + " is an Amstrong Number");
        }
        else {
            System.out.println("Number " + number + " is NOT an Amstrong Number");
        } 
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Ejercicios0.checkPalindrome("AOA");
        Ejercicios0.checkPalindrome("ABC");
        Ejercicios0.checkPalindrome("12821");
        Ejercicios0.checkPalindrome("123456789");
        Ejercicios0.printFactorze(12);
        
        Ejercicios0.findGCD(5, 20);
        Ejercicios0.reverseString("asdfghjklñ");
        
        Ejercicios0.isAmstrongNumber(371);
        Ejercicios0.isAmstrongNumber(236);
        Ejercicios0.isAmstrongNumber(8208);
        
        
        Palindromo pruebas = new Palindromo();
        pruebas.workOutRice(87);
        
    }
}
