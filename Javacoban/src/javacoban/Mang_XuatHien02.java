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
//yêu cầu: Nhập một mảng số nguyên a0, a1, a2, …, an-1. In ra màn hình số lần xuất hiện của các phần tử.

import java.util.Scanner;
public class Mang_XuatHien02 {
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
        for(int i=0;i<n;i++){
            if(Dem(a, i, a[i])==0){
                System.out.print("\nPhan tu "+a[i]+" xuat hien "+Dem(a, n, a[i])+" lan ");
            }
        }
    }
        
}
