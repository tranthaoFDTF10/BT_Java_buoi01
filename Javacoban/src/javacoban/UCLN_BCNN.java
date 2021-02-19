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
public class UCLN_BCNN {
    public int UCLN(int a,int b){
        int ucln = 0;
        for(int i=1;i<=a||i<=b;i++){
            if(a%i==0 && b%i==0){
                ucln=i;
            }
        }
        return ucln;
    }
    public int BCNN(int a, int b){
        return (a*b)/UCLN(a,b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a = ");
        int a = sc.nextInt();
        System.out.print("\nNhap so b = ");
        int b = sc.nextInt();
        UCLN_BCNN t = new UCLN_BCNN();
        System.out.println("UCLN la: "+t.UCLN(a,b));
        System.out.println("BCNN la: "+t.BCNN(a,b));
    }
}
