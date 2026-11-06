/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;
public class NameStudent4 {
    public static void FistName(String [] Name)
    {
        for (int i = 0; i < Name.length; i++) {
           String [] FirstName = Name[i].split(",");
            System.out.println(FirstName[0]);
        }
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tedad Student ra vared konid :");
        int Student = input.nextInt();
        String [] FirsName = new String [Student];
        for (int i = 0; i < FirsName.length; i++) {
            System.out.println("FirsName && LastName " + i + " ra vared konid :");
            FirsName[i] = input.next();
        }
        FistName(FirsName);
       
        
    }
    
}
