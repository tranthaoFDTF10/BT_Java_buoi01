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
public class GPTrinh {
   public static void gptbac1(double a, double b){
       if(a==0){
           if(b==0){
              System.out.println("Phuong trinh VSN");
           }
           else{
               System.out.println("Phuong trinh VN");
           }
       }
       else{
           System.out.println("Nghiem cua PT la: "+(-b/a));
       }
   }
   public static void gptbac2(double a, double b, double c){
       if(a==0) gptbac1(b,c);
       else{
           double delta=b*b-4*a*c;
           if(delta>0){
               double x1=(-b+Math.sqrt(delta))/(2*a);
               double x2=(-b-Math.sqrt(delta))/(2*a);
               System.out.println("Phuong trinh co hai ngiem x1 = "+x1+"; x2 = "+x2);
           }
           else if(delta==0){
               System.out.println("Phuong trinh co nghiem kep x1 = x2 = "+(-b/(2*a)));
           }
           else{
               System.out.println("Phuonh trinh vo nghiem");
           }
       }
   }
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap he so a = ");
       double a = sc.nextDouble();
       System.out.print("\nNhap he so b = ");
       double b = sc.nextDouble();
       System.out.print("\nNhap he so c = ");
       double c = sc.nextDouble();
       gptbac2(a,b,c);
   }
}
