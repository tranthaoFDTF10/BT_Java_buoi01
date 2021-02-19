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
//Yêu cầu:Viết chương trình nhập số nguyên dương n và thực hiện các chức năng sau: 
//1. Tính tổng các chữ số của n.
//2. Phân tích n thành tích các thừa số nguyên tố.
//3. Liệt kê các ước số của n
//4. Liệt kê các ước số là nguyên tố của n.
import java.util.Scanner;
public class BT_TongHop01 {
    public static long TinhTong(long n){
        long sum=0;
        long tam;
        while(n!=0){
            tam=n%10;
            sum=sum+tam;
            n=n/10;
        }
        return sum;
    }
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
    public static void PhanTich(long n){
        for(int i=2;i<=n;i++){
            while(checkSNT(i)==1 && (n%i==0)){
                System.out.print(i+".");
                n/=i;
            }
        }
    }
    public static void UocSo(long n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void UocSo_SNT(long n){
        for(int i=2;i<=n;i++){
            if(n%i==0 && checkSNT(i)==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n = ");
        long n = sc.nextLong();
        System.out.print("\nTong cac chu so "+n+" = "+TinhTong(n));
        System.out.print("\nPT thua so "+n+" = ");
        PhanTich(n);
        System.out.print("\nCac uoc so cua "+n+" la: ");
        UocSo(n);
        System.out.print("\nUoc so la SNT cua "+n+" la: ");
        UocSo_SNT(n);
    }
}
