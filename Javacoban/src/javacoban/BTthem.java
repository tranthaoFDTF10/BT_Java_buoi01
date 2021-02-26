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
public class BTthem {
    public static void Dem(String str){
        int []count= new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        char a[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            a[i]=str.charAt(i);
            int dem=0;
            for(int j=0;j<=i;j++){
                if(str.charAt(i)==a[j]){
                    dem++;
                }
            }
            if(dem==1){
                System.out.println("So luan xuat hien cua "+str.charAt(i)+" la: "+count[str.charAt(i)]);
            }
        }
        
    }
    public static void Dao(String str){
        String ketqua="";
        for(int i=str.length()-1;i>=0;i--){
            ketqua=ketqua+str.charAt(i);
        }
        System.out.println(ketqua);
    }
    public static void inchuoi(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi: ");
        String str=sc.nextLine();
        System.out.print("\nChuoi sau khi nhap: ");
        inchuoi(str);
        System.out.print("\n");
        Dem(str);
        System.out.print("\nChuoi sau khi dao: ");
        Dao(str);
    }
}
