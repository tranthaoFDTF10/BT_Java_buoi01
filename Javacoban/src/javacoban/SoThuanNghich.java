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
public class SoThuanNghich {
    public void checkSTN(long n){
        long dao=0; //Biến lưu kết quả sau khi dao nguoc
        long m = n;//Biến lưu để tiến hành phân tích 
        while(m>0){
            dao=dao*10 + m%10;
            m=m/10;
        }
        if(dao==n){
            System.out.print("\nLa so thuan nghic");
        }
        else{
            System.out.print("Khong la so thuan nghic");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n = ");
        long n = sc.nextLong();
        SoThuanNghich t = new SoThuanNghich();
        t.checkSTN(n);
    }
}
