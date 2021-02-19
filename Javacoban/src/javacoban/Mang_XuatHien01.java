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
//yêu cầu: Nhập một mảng số nguyên a0, a1, a2, …, an-1. In ra màn hình các phần tử xuất hiện trong mảng đúng 1 lần.
import java.util.Scanner;
public class Mang_XuatHien01 {
    public static void nhap(int a[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan phan tu thu "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
    }
    public static int Dem(int a[], int n,int i){
        int count=0;
        for(int j=0;j<n;j++){
            if(a[j]==i){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        nhap(a, n);
        System.out.print("\nCac phan tu xuat hien dung 1 lan: ");
        for(int i=0;i<n;i++){
            if(Dem(a, n, a[i])==1){
                System.out.print(a[i]+" ");
            }
        }
        System.out.print("\nCac phan tu xuat hien dung 2 lan: ");        
        for(int i=0;i<n;i++){
            if(Dem(a, n, a[i])==2 && Dem(a, i, a[i])==0){ // chỉ lấy 1 số do 2 số trùng nhau
                System.out.print(a[i]+" ");
            }
        }
    }
    
}
