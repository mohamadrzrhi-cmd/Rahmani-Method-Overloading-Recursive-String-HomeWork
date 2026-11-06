/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;
public class HomeWork3 {
    
    public static boolean MyMethod(String a , String b , int x)
    {
        int CountA =a.length();
        int CountB = b.length();
        if (x > CountA || x > CountB) {
            return false;
        }
        else
        {
            String SubA = a.substring(0, x);
            String SubB = b.substring(0 , x);
            System.out.println(SubA + SubB);
            return true;
        }
    }
    
   public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word1 = input.next();
        System.out.println("enter another word:");
        String word2 = input.next();
        System.out.println("enter a number");
        int number = input.nextInt();
        System.out.println(MyMethod(word1 , word2 , number));
        
    }
    
}
