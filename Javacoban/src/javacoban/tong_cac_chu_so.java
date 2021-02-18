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
public class tong_cac_chu_so {
    public static long tong(long n){
        long sum=0;
        long tam;
        while(n!=0){
            tam=n%10;
            sum=sum+tam;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap mot so nguyen: ");
        long n = sc.nextLong();
        System.out.println("Tong cac chu so cua "+n+" la: "+tong(n));
    }
    
}
