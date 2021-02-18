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
public class Javacoban {
    public static int UCLN(int a, int b){
        int ucln=0;
        for(int i=1;i<=a||i<=b;i++){
            if(a%i==0 && b%i==0){
                ucln=i;
            }
        }
        return ucln;
    }
    public static int BCNN(int a, int b){
        int bcnn;
        return bcnn=(a*b)/UCLN(a,b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap a: ");
        int a= sc.nextInt();
        System.out.println("Moi ban nhap b: ");
        int b = sc.nextInt();
        System.out.println("UCLN la: "+UCLN(a,b));
        System.out.println("BCNN la: "+BCNN(a,b));
    }
    
}
