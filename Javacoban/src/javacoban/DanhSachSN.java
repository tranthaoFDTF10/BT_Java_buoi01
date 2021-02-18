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
public class DanhSachSN {
    int ds[];
    int n;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap so phan tu n = ");
        n = sc.nextInt();
        ds=new int[n];//cấp phát bộ nhớ cho danh sách
        for(int i=0;i<ds.length;i++){
            System.out.print("\nNhap phan tu thu "+i+": ");
            ds[i]=sc.nextInt();
        }
        
    }
    public void sapxep(){
        for(int i=0;i<ds.length-1;i++){
            for(int j=i+1;j<ds.length;j++){
                if(ds[i]>ds[j]){
                    int t=ds[i];
                    ds[i]=ds[j];
                    ds[j]=t;
                }
            }
        }
    }
    public void in(){
        for(int e : ds){
            System.out.print(e+" ");
        }
    }
    public int dem(int x){
        int count=0;
        for(int e: ds){
            if(e==x) count++;
        }
        return count;
    }
    public static void main(String args[]){
        DanhSachSN t = new DanhSachSN();
        t.nhap();
        t.in();
        t.sapxep();
        System.out.println("Day sau khi sap xep la: ");
        t.in();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap so can dem x = ");
        int x = sc.nextInt();
        System.out.println("So "+x+" xuat hien "+t.dem(x)+" lan");
    }
    
}
