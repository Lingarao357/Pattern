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
public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
        for(int j=rows;j>i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=(i*2)-1;k++){
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
