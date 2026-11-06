/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;
public class Overloading {
    public static double Area(int r)
    {
        return r * r * 3.14;
    }
    
    public static int Area(int a , int b)
    {
        return a * b;
    }
    
    public static double Area (double base , double height)
    {
        return base * height / 2;
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter r :");
        int number = input.nextInt();
        double result = Area(number);
        System.out.println("Masahat Dayere: " + result);
        
        
        System.out.println("enter Length: ");
        int num1 = input.nextInt();
        System.out.println("enter width");
        int num2 = input.nextInt();
        int result1 = Area(num1 , num2);
        System.out.println("Masahat Mostatil :" + result1);
        
        System.out.println("enter base :");
        double numBase = input.nextDouble();
        System.out.println("enter height :");
        double numHeight = input.nextDouble();
        double result2 = Area(numBase , numHeight);
        System.out.println("Masahat Mosalas :" + result2);
    }
    
}
