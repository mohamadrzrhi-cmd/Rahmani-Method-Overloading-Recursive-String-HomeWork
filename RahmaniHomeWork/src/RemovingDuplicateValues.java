/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mohamadreza
 */
public class RemovingDuplicateValues {
    
    static int j = 0;
    public static void remove(int [] array , int [] NewArray , int i)
    {
        if (i == array.length) {
            return;
        }
        
        if (i == 0 || array[i] != array[i - 1]) {
            NewArray[j] = array[i];
            j++;
        }
        
        remove(array,NewArray,i+1);
    }

     public static void main(String[] args) 
    {
        int [] a = {1,2,2,3,3,4};
        int [] b = new int [a.length];
        
        remove(a,b,0);
        
        for (int i = 0; i < j; i++) {
            System.out.println(b[i]);
        }
        
    }
    
}
