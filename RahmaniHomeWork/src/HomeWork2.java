/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;
public class HomeWork2 {
    public static String Word(String a , int x , int y)
    {
        int count = a.length();
        if (x > count || y > count || x > y){
            return "null";
        }
        else
        {
            return a.substring(x, y);
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = input.next();
        System.out.println("enter a number :");
        int x = input.nextInt();
        System.out.println("enter another number");
        int y = input.nextInt();
        
        String result = Word(word , x , y);
        System.out.println(result);
    }
    
}
