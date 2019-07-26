/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternprogream;

import java.util.Scanner;

/**
 *
 * @author Linga357
 */
public class Patternprogream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int rows=sc.nextInt();
         for (int i=0;i<=rows;i++)
        {
            for (int j=0;j<=rows;j++)
            {
                if(i==0||i==rows){
                    System.out.print("*");
                }
                else if(j==0||j==rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//   String s="200";
////   int i=Integer.parseInt(s);
//     int i=Integer.valueOf(s);
//       // System.out.println(s+100);
//        
       // System.out.println(i+100);
    }
    
}
