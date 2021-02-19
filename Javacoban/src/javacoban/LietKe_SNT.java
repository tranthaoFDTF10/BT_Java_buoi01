/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoban;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class LietKe_SNT {
    public static int checkSNT(int n){
        if(n<2){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return 0; //khong la SNT
                }
            }
        return 1; //La SNT
    }
    public static void LietKe(int n){
        for(int i=2;i<=n;i++){
            if(checkSNT(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen = ");
        int n = sc.nextInt();
        System.out.print("Cac SNT nho hon "+n+"la: ");
        LietKe(n);
    }
}
