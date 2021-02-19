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
//ý tưởng: Nhập n để tìm n số nguyên tố đầu tiên 
import java.util.Scanner;
public class LietKeSNT_dautien {
    public static int checkSNT(int n){
        if(n<2){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n = ");
        int n = sc.nextInt();
        int dem=0; 
        int i=2;
        System.out.print("\n"+n+" SNT dau tien la: ");
        while(dem<n){
            if(checkSNT(i)==1){
                System.out.print(i+" ");
                dem++;
            }
            i++;
        }
    }
}
