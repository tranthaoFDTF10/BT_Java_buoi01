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
//Yêu cầu: Sắp xếp mảng theo thứ tự tăng dần và giảm dần
public class Mang_SapXep {
    public static void nhap(int a[], int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            a[i]= sc.nextInt();
        }
    }
    public static void in(int a[], int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void SapXep_Tang(int a[], int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int tam=a[i];
                    a[i]=a[j];
                    a[j]=tam;
                }
            }
        }
    }
    public static void SapXep_Giam(int a[], int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    int tam=a[i];
                    a[i]=a[j];
                    a[j]=tam;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        nhap(a, n);
        System.out.print("\nMang moi nhap la: ");
        in(a, n);
        SapXep_Tang(a, n);
        System.out.print("\nMang sap xep tang dan la : ");
        in(a, n);
        SapXep_Giam(a, n);
        System.out.print("\nMang sap xep giam dan la : ");
        in(a, n);
    }
}
