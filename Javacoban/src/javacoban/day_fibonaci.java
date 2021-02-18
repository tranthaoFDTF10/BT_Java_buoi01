/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoban;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class day_fibonaci {
    public static void fibonaci(int n){
       int n1=0;
       int n2=1;
       int n3;
       System.out.print(n1+" "+n2+" ");
       for(int i=2;i<n;i++){
           n3=n1+n2;
           System.out.print(n3+" ");
           n1=n2;
           n2=n3;
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n = ");
        int n = sc.nextInt();
        fibonaci(n);
    }
}
