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
//yêu cầu: Kiểm tra xem chuoi S1 co trong chuỗi s2 hay không
import java.util.Scanner;
public class Chuoi_kiemtra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi s1 = ");
        String s1 = sc.nextLine();
        System.out.print("Nhap chuoi s2 = ");
        String s2 = sc.nextLine();
        System.out.println(s1.contains(s2));
        //trả về true là có; 
        //trả về false là không
    }
}
