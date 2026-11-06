/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;
public class RecursiveMethod1 {
    
    public static int Pow(int num , int pow)
    {
        if (pow == 0) {
            return 1;
        }
        return num * Pow(num , pow - 1);
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = input.nextInt();
        
        System.out.println("enter a pow : ");
        int pow = input.nextInt();
        
        int r = Pow(number , pow);
        System.out.println(r);
    }
}
