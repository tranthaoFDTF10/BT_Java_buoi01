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
public class so_thuan_nghich {
    public static void Kiemtra(int n){
        int test=n;
        int tam,ketqua=0;
        int i=0;
        while(n==0){
            tam=n%10;
            ketqua+=Math.pow(10,i)*tam;
            n=n/10;
        }
        if(ketqua==test){
            System.out.println("La so thuan nghich");
        }
        else{
            System.out.println("Khong la so thuan nghich");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so n = ");
        int n = sc.nextInt();
        Kiemtra(n);
    }
}
