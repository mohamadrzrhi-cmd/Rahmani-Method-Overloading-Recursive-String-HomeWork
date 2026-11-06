/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rahmanihomework;

import java.util.Scanner;


public class RahmaniHomeWork {
    public static String Word(String a , String b)
   {
       return a + b;
   }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("enter a word :");
       String word = input.next();
        System.out.println("enter another word :");
        String word1 = input.next();
        
        String result = Word(word, word1); 
        System.out.println(result);
    }
    
}
