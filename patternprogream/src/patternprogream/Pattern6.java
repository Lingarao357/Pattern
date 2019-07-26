/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternprogream;

/**
 *
 * @author Linga357
 */
public class Pattern6 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
        for(int j=0;j<=10;j++){
        if(i==0||i==10){
            System.out.print("*");
        }
        else if(j==0||j==10){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        }
            System.out.println();
        }
    }
}
