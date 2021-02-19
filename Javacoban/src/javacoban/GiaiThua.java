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
public class GiaiThua {
    public int TinhGT(int n){
        int gt=1;
        for(int i=1;i<=n;i++){
            gt=gt*i;
        }
        return gt;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n = ");
        int n = sc.nextInt();
        GiaiThua t = new GiaiThua();
        System.out.println(n+" giai thua = "+t.TinhGT(n));
    }
}
