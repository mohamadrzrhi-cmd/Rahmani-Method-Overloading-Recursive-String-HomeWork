/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;
public class NameStudent2 {
    
    public static void Name(String [] n)
    {
        for (int i = 0; i < n.length; i++) {
            
            for (int j = n[i].length() - 1; j >= 0 ; j--) {
                System.out.print(n[i].charAt(j));
            }
            System.out.println();
        }
    }
     public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tedad Student ra vared konid :");
        int count = input.nextInt();
        
        String [] Names = new String [count];
        for (int i = 0; i < Names.length; i++) {
            System.out.println("Name " + i + " ra vared konid :");
            Names[i] = input.next();
        }
        Name (Names);
    }
}
