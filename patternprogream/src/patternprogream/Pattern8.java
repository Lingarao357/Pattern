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
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
      int rows=sc.nextInt();
      for(int i=rows;i>=1;i--){
           
      for(int k=1;k<=(i*2)-1;k++)
      {
          System.out.print("*");
      }
       for(int j=rows-1;j<=i;j++){
            System.out.print("");
       }

         
       
        System.out.println();
       sc.close();
      }
     
      
    }
}
