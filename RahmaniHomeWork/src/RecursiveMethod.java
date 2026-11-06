/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;
public class RecursiveMethod {
    public static int Print(int n)
    {
        if (n == 0) {
            return 0;
        }
        System.out.println(n);
        return Print(n-1);
    }
     public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = input.nextInt();
        int result = Print(number);
    }
}

