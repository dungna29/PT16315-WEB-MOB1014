/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.List;

/**
 *
 * @author Dungna29
 */
public class B2_Method_PhuongThucKhongTraVe {

    /*
         *  Bài Hàm -Phương thức - Method
         *  Định nghĩa: 1 tập các câu lệnh cùng nhau thực hiện 1 tác vụ nào đó.
         *  LỢI ÍCH: - Giúp quản lý code tốt hơn
         *           - Tái sử dụng
         *
         *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
         *  }
         * <Phạm vi truy cập> - Access Modifier:Public,Private,Protected, Default
         *
         * <Kiểu trả về> : có 2 kiểu trả về và không trả về
         *          - Kiểu không trả về: void
         *          - Kiểu trả về: là giá trị(int,string,double....) hoặc tập giá trị(Array,List.....) 
                    hoặc đối tượng(class) và còn nhiều kiểu khác.
         *
         * <Tên phương thức>: Tên động từ viết thường + tên hàm viết hóa chữ cái đầu của từ
         * <Danh sách tham số>: Phương thức có thể có tham hoặc không tham số và lưu ý khi sử dụng tham số 
           thì khi gọi phương thức thì phải truyền đúng vị trí của tham số.
     */
    public static void main(String[] args) {        

        //1. Gọi hàm - Biết tên hàm và kết thúc phải có ();
        inRaManHinh();

        //2. Gọi hàm hàm có tham số:
        //Phải đảm bảo truyền đúng và đủ vị trí của tham số và kiểu dữ liệu của tham số
        inRaManHinh1(2021, "FPT");
        
        
        //Ví dụ mẫu:
        int[] arrNumber ={8,9,8,56,2,44,2,1,5,6,6,6};
        inMang(arrNumber);
        int[] arrNumber2 ={8,9,8,56,2,44};
        inMang(arrNumber2);
       
    }

    //Phần 1: Phương không trả về không tham số
    static void inRaManHinh() {
        System.out.println("Chúc mừng năm mới");
    }

    /*Phần 2: Phương thức không trả về có tham số 
        - Số lượng tham số phụ thuộc vào bài toán cần phải giải.
        - Tham số truyền vào là các kiểu dữ liệu khác nhau không nhất 
        thiết phải giống nhau như: có thể kiểu dữ liệu, mảng, đối tượng, danh sách... */

    //int year = tham số phải có kiểu dữ liệu và tên tham số
    static void inRaManHinh1(int year, String name) {
        //Coi các tham số như các là các biến có thể tương tác với nó
        System.out.println("Chúc mừng năm mới " + year + " " + name);
    }
    
    static void inRaManHinh1(int a, int[] arrNumber,List<String> lstName,SinhVien sv){
        
    }
    
    static void inMang(int[] temp){
         for (int x : temp) {
            System.out.println(x + " ");
        }
    }
}
