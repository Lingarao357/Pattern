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
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("## printing the pttern ##");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print("*");
        }
        for(int k=n;k<i;k++){
            System.out.print("");
        }
            
             System.out.println();
        }
        
    }
 
}
