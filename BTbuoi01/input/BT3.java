public class BT3 {
    public static void main(String args[]){
        //đối số nằm trong [] sau args
        //đối số có thể là 7.5 20 5.6 20a1
        //Mình phải biến đối nó về thành 7.5 20.0 5.6 2001
        double tong=0;
        double n; // là biến để chuyền đối số về định dạng đúng
        double max = Double.MIN_VALUE; // sử dụng phương thức có sẵn để gán giá trị nhỏ nhất của kiểu double
        for(String e : args){ //duyệt phần tử. Mỗi phần tử của agrs lúc này là e
            try{
                n=Double.parseDouble(e); // n sẽ biến đổi phần tử e đúng định dạng kiểu double
            }catch(NumberFormatException ex){ // xử lý trường hợp ngoại lệ ví dụ như 20a1 
                n=0; //20a1 = 2001
            }
            tong=tong+n;
            if(max<n) max=n;
        }
        System.out.println("Tong cua args = "+tong);
        System.out.println("SLN la max = "+max);

    }
}
