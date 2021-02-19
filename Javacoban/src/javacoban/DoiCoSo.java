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
public class DoiCoSo {
    public static String ChuyenDoi(int n, int b){
        String str="";
        int du;
        while(n>0){
            du=n%b;
            n=n/b;
            if(b==16){
                if(du==10) str+="A";
                if(du==11) str+="B";
                if(du==12) str+="C";
                if(du==13) str+="D";
                if(du==14) str+="E";
                if(du==15) str+="F";
                if(du>=0 && du<10) str+=du;
                
            }
            else{
                str+=du;
            }
        }
        return str;
    }
    public static void xuat(String str){
        for(int i =str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so muon chuyen: ");
        int n = sc.nextInt();
        System.out.print("\nNhap co so muon chuyen: ");
        int b = sc.nextInt();
        String ketqua = ChuyenDoi(n, b);
        System.out.print("\nGia tri "+n+" sau khi chuyen sang co so "+b+": ");
        xuat(ketqua);
    }
}
