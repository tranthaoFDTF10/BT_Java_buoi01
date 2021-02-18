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
public class so_nguyen_to {
    public static void kiemtraSNT(int n){
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("La so nguyen to");
        }
        else{
            System.out.println("Khong la so nguyen to");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n = ");
        int n = sc.nextInt();
        kiemtraSNT(n);
    }
}
