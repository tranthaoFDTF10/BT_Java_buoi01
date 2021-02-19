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
//Đếm số từ trong 1 chuỗi
import java.util.Scanner;
public class DemTu_Chuoi {
    public static int DemTu(String str){
        int count=0;
        str=str.trim();//xoa khoang trang dau va cuoi
        String[] word = str.split("\\s",0);// tach chuoi thành từng từ theo khoảng trắng
        for(String duyet: word){
            if(!duyet.isEmpty()){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String str = sc.nextLine();
        System.out.print("\nSo tu trong chuoi la: "+DemTu(str));
        
    }
    
}
