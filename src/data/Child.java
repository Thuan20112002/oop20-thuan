/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author DELL
 */
//1. IS A xuất hiện 1 chiều extends, chuẩn bị xài lại heng, ko có tự làm
//2. Khai báo các đặc điểm. Lưu ý:
//      2.1 Nếu Con trùng hết với Cha, ko cần làm lại, Cha sẽ làm cho
//          giả sử Con cũng là tài sản (di truyền ko cần khai báo j cả)

//      2.2 Con có đồ riên, lma2 rieng5, giấu Ba, liệu Ba biết ko?
//      //biến dị
//      Con làm thêm 1 đc tài sản, thay vì Ba chỉ có 2
//3. Làm phễu, giữ bản sắc cho Con, thỏa hiệp/đàm phán/deal nếu cần
public class Child extends Parent{

   private String assetThree;
   
   // lí thuyết, Con có 3 thứ: a1, a2, a3 phễu phải đỗ cả 3, kế thừa Cha giữ
   //new Con chính là new Cha

    public Child(String assetThree, String assetOne, String asserTwo) {
        super(assetOne, asserTwo);  //MUSR BE 1ST STATEMENT
        this.assetThree = assetThree;
        
        //phải có Cha thì con mới có không gian cho Con mở rộng
        //BẮT BUỘC PHẢI NEW CHA TRƯỚC, MỚI EXTENDS ĐC, CÓ THÊM CHỖ MỞ RỘNG
        //ĐỂ LƯU THÊM KHÁC BIỆT
        //BỐ TRÍ RAM CHO BA TRƯỚC, MỞ RỘNG CHO CON
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }
}
