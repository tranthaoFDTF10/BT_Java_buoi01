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
//Yêu cầu: Viết chương trình liệt kệ các số nguyên có từ 5 đến 7 chữ số thảo mãn: 
//1. Là số nguyên tố. 
//2. Là số thuận nghịch. 
//3 .Mỗi chữ số đều là số nguyên tố. 
//4. Tổng các chữ số là số nguyên tố.

public class BT_TongHop02 {
    public static int checkSNT(long n){ //Kiem tra SNT
        if(n<2){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return 0; //khong la SNT
                }
            }
        return 1; //La SNT
    }
    public static void LietKe_SNT(){ // Liet ke SNT
         for(long i=10000;i<=9999999;i++){
            if(checkSNT(i)==1){
                System.out.print("\nSNT: "+i);
            }
        }
    }
    public static int checkSTN(long n){ //Kiem tra số thuận nghịch
        long dao=0; //Biến lưu kết quả sau khi dao nguoc
        long m = n;//Biến lưu để tiến hành phân tích 
        while(m>0){
            dao=dao*10 + m%10;
            m=m/10;
        }
        if(dao==n){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void LietKe_SoTN(){ //Liệt kê số thuận nghịch
        for(long i=10000;i<=9999999;i++){
            if(checkSTN(i)==1){
            } else {
                System.out.print("\nSo Thuan Nghich: "+i);
            }
        }
    }
    public static int TongChuSo(long n){ //Kiem tra tong cac chu so có phải là SNT hay không
        long sum=0;
        long tam;
        while(n!=0){
            tam=n%10;
            sum=sum+tam;
            n=n/10;
        }
        if(checkSNT(sum)==1){ //Tong cac chu so la SNT thi return 1
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void LietKe_TongChuSo(){ //Liệt kê các số có tổng chữ số là SNT
        for(long i=10000;i<=9999999;i++){
            if(TongChuSo(i)==1){
                System.out.print("\nCac so co Tong chu so la SNT: "+i);
            }
        }
    }
    public static String ChuSo_SNT(long n){ //Lưu các chữ số vào một chuỗi sau đó đem đi so sánh
        String str ="";
        long tam;
        while(n!=0){
            tam=n%10;
            str=str+tam;
            n=n/10;
        }
        return str;
    }
    public static void LietKe_ChuSo_SNT(){
        for(long i=10000;i<=9999999;i++){
            String kt = ChuSo_SNT(i); // biến kt lưu số i
            for(int j=0;j<=kt.length()-1;j++){ //duyệt chuỗi và kiem tra số chuỗi số kt(i)
                if(checkSNT(kt.charAt(j))==1){ //kiểm tra từng kí tự trong chuỗi
                    System.out.print("So co moi chu so deu la SNT: "+i);
                }
            }
        }
    }
    public static void main(String[] args){
        LietKe_SNT();
        LietKe_SoTN();
        LietKe_SoTN();
        LietKe_ChuSo_SNT();
    }
}
