/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
import java.util.Scanner;
public class Sort {
    
    public static void Sort()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tool Array Ra Vared Konid :");
        int Tool = input.nextInt();
        
        int Array [] = new int [Tool];
        
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Meghdar " + i + " Ra vared Konid");
            Array[i] = input.nextInt();
        }
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length - 1; j++) {
                if (Array [j] < Array [j + 1]) {
                    int temp = Array [j];
                    Array [j] = Array [j + 1];
                    Array [j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < Array.length; i++) {
                System.out.print(Array[i] + " ");
            }
    }
    public static void main(String[] args) 
    {
        Sort();
    }
}
