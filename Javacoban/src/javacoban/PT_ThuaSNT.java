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
//Phân tích thừa số nguyên tố
import java.util.Scanner;
public class PT_ThuaSNT {
    public static int checkSNT(int n){
        if(n<2){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void PhanTich(int n){
        for(int i=2;i<=n;i++){
            while(checkSNT(i)==1 && (n%i==0)){
                System.out.print(i+".");
                n/=i;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n = ");
        int n = sc.nextInt();
        System.out.print("\n"+n+" = ");
        PhanTich(n);
        
    }
}
