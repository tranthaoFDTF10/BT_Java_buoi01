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
public class SNT_Co5ChuSo {
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
        System.out.print("Cac SNT co 5 chu so la: ");
        for(int i=10000;i<=99999;i++){
            if(checkSNT(i)==1){
                System.out.print(i+" ");
            }
        }
    }
}
