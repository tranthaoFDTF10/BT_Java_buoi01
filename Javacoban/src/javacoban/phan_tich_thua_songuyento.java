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
public class phan_tich_thua_songuyento {
    public static void phantich(int n){
        int dem=0;
        for(int i=2;i<=n;i++){
            while(n%i==0){
                dem++;
                n=n/i;
            }
            if(dem!=0){
                System.out.print(i);
                if(dem>1){
                    System.out.print("^"+dem);
                }
                if(n>i){
                    System.out.print("*");
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Moi ban nhap so n: ");
        int n = sc.nextInt();
        System.out.println("Sau khi phan tich ra thua so nguyen to ta co: ");
        phantich(n);
    }
}
