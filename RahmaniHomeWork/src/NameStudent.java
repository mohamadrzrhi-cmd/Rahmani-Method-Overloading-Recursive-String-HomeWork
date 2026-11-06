/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */

import java.util.Scanner;
public class NameStudent {
    
    public static void  Name (String n [])
{
    for (int i = 0; i < n.length; i++) {
        System.out.print(n[i].substring(0, 1) + " ");
    }
}
     public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tedad Student ra vared konid :");
        int Student = input.nextInt();
        
        String [] Name = new String [Student];
        
        for (int i = 0; i < Student; i++) {
            System.out.println("Name Student  " + i +"  :" );
            Name[i] = input.next();
        }
        Name (Name);
    }
    
}
