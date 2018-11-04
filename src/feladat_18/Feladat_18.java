
package feladat_18;

import java.util.Scanner;


public class Feladat_18 {

  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
        int[] tomb = new int[25];
        for( int i = 0; i < tomb.length; i++ )
        {
                tomb[i] = (int)(Math.random()*100)+1;
        }
        for( int i = 0; i < tomb.length; i++ )
        {
                System.out.print(tomb[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < tomb.length; i = i+2)
        {           tomb[i]=tomb[i]*tomb[i];
                    System.out.print(tomb[i]+" ");
        }
    }
    
}
