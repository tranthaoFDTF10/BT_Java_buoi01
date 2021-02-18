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
public class tonghaiso {
    public int nhap(){
        Scanner sc = new Scanner(System.in);
        String s; 
        int n;
        do{
            System.out.print("Nhap vao mot so nguyen: ");
            s = sc.nextLine(); // dùng biến s kiểu String để nhập muốn kiểu nào cũng được
            try{
                n = Integer.parseInt(s); // biến n lưu trữ về đúng định dạng 
            }
            catch(NumberFormatException ex){ //TH ngoại lệ VD 20a1
                n = Integer.MAX_VALUE; // n lưu giá trị đặc biệt là GTLN của số thực
                System.out.println("Ban da nhap sai dinh dang. Nhap lai");
            }
        }while(n==Integer.MAX_VALUE); //Nhập đến khi nào đúng thì thôi. ĐK khác giá trị đặc biệt
        return n;
    }
    public static void main(String args[]){
        tonghaiso t = new tonghaiso();
        int a = t.nhap();
        int b =t.nhap();
        System.out.println("Tong cua hai so la: "+(a+b));
    }
    
}
