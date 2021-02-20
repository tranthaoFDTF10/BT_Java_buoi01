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
public class Mang_01 {
    public static void nhap(int a[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan phan tu thu "+(i)+": ");
            a[i]=sc.nextInt();
        }
    }
    public static void TimPhanTu_Phanbiet(int a[],int b[],int n,int m){
        //hàm tìm phần tử phân biệt
        m=0;
       // b[m]=a[0];
       // m++;
        for(int i=0;i<n;i++){
            //vòng lặp duyệt từng phần tử của mảng a
            boolean kiemtra=true;// giả sửa a[i] là phần tử phân biệt
            for(int j=i-1;j>=0;j--){
                //duyệt mảng a từ vị trí i-1 về đầu mảng xem a[i] trước đó có tồn tại hay chưa
                //nếu a[i] chưa tồn tại thì nó chính là phần tử đăc biệt
                if(a[i]==a[j]){
                    kiemtra=false; // a[i] không là phần tử đặc biệt nên dừng lại
                    break;
                }
            }
            if(kiemtra==true){
                b[m]=a[i];// đưa phần tử phân biệt vào mảng b
                m++; //số lượng phần tử tăng lên
            }
           
        }
    }
    public static void DemPhanTu(int a[],int b[],int n, int m){
        //Tìm phần tử phân biệt
        TimPhanTu_Phanbiet(a, b, n, m);
        //Tìm số lần xuất hiện của từng phần tử phân biệt
        //Mang b chứa các phần tử phân biệt đem đi so sánh với mảng a
        for(int i=0;i<m-1;i++){
            int dem=0;
            for(int j=0;j<n;j++){
                if(b[i]==a[j]){
                    dem++;
                }
            }
            System.out.print("\nPhan tu "+b[i]+" xuat hien "+dem+" lan");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int []a=new int[n];
        int m=n;
        int []b=new int[m]; //dùng mảng phụ để tìm phân tử phân biệt
        nhap(a, n);
        DemPhanTu(a, b, n, m);
    }
}
