/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;
public class HomeWork1 {
    public static String word(int x , String a)
    {
        int count = a.length();
        if (x > count) {
            return "null";
        }
        else {
            return a.substring(0, x);
        }
    }
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("enter word :");
     String word = input.next();
        System.out.println("enter number :");
     int number = input.nextInt();
     String result = word(number , word);
        System.out.println(result);
}
}
