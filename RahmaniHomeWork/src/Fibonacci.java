/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;

public class Fibonacci {
    
    public static int Fibo (int num1 , int num2 , int Count) 
    {
        if (Count == 0) {
            return 0;
        }
        System.out.print(" " + num1 + " ");
        return Fibo(num2 , num1 + num2 , Count - 1);
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter F :");
        int F = input.nextInt();
        Fibo(1,1,F);
    }
}
