/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;
public class NameStudent3 {
    
    public static void Name (String [] n , String NewName)
    {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            
            if (n[i].equals(NewName)) {
                count++;
            }
        }
        System.out.println(count);
    }
     public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tedad Student Ra vared Konid :");
        int count = input.nextInt();
        
        String [] Names = new String [count];
        for (int i = 0; i < Names.length; i++) {
            
            System.out.println("Name " + i + " ra vared konid" );
            Names[i] = input.next();
        }
        System.out.println(" enter a new name :");
        String NewName = input.next();
        
        Name(Names,NewName);
    }
    
}
