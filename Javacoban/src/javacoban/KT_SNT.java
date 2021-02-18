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
public class KT_SNT {
    public static void checkSNT(int n){
        int count=0;
        if(n<=1){
            System.out.println("Khong la SNT");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                count++;
                }
            }
            if(count==0){
                System.out.println("La so nguyen to");
            }
            else{
                System.out.println("Khong la SNT");
            }
        }
        
    }
    public static void SoNhiPhan(int n){
        int kq=0,i=1,chiadu;
        do{
            chiadu=n%2;
            kq=kq+(i*chiadu);
            n=n/2;
            i=i*10;
        }while(n>0);
        System.out.println("So nhi phan cua "+n+" la: "+kq);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n = ");
        int n = sc.nextInt();
        KT_SNT.checkSNT(n);
        KT_SNT.SoNhiPhan(n);
    }
}
