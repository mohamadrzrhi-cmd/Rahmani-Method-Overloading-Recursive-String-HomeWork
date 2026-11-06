/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;
public class Binary {
    
    public static String Binary (int num)
    {
        String reverse = "";
        if (num == 0) {
           return "";
        }
        reverse = num % 2 + reverse;
        return Binary(num / 2) + reverse;
    }
     public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
      int number = input.nextInt();
        System.out.print(Binary(number));
    }
}
