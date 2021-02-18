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
public class HoTen {
    public static void TachTen(String s){
        s=s.trim(); //cắt bỏ khoảng trắng dư thừa
        int i =s.lastIndexOf(' '); //tim vị trí khoảng trắng cuối cùng trong chuỗi để lưu vào
        String ten=s.substring(i+1);//cắt từ vị trí thứ i+1 mới ra tên của mình
        System.out.println("Ten sau khi cat: "+ten);
    }
    /*public static void TachHoTen(String s){
        s=s.trim();
        String[] word = s.split(" ");
        
  
    }*/
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String s = sc.nextLine();
        HoTen.TachTen(s);
        
    }
    
}
