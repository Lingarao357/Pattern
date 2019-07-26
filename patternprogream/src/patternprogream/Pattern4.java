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
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        System.out.println("## print pattern ##");
        for(int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print("");
        }
        for(int k=rows;k>=i;k--){ 
            System.out.print("*");
        }
            System.out.println();
        }
        
    }
}
