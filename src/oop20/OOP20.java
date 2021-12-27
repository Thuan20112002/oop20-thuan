/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop20;

import data.Child;
import data.Parent;

/**
 *
 * @author DELL
 */
public class OOP20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        playParentNchild();
    }
    
    public static void playParentNchild(){
        Parent p = new Parent("Biet Thu", "100BTC");
        p.showProfile();
        //KHAI CHA NEW CHA, chấm xổ ra gì?? xổ cái gì của Cha
        
        Child c1 = new Child("Nha pho", "100ETH", "HAHA");
        c1.showProfile(); //nếu không làm đồ riêng, đó là lúc xài lại của Ba
        //phải theo quy tắc của Cha
        //nếu muốn qua mặt, còi to cho vượt, hãy tự làm đi, @Override
        //KHAI CON = NEW CON, chẩm xổ ra gì??? Khuôn Con có gì xổ đó
        //                     xổ tất cả những gì Cha cho/ thừa kế
                                //xổ hết của Cha +  xổ của riêng con
        //KHAI GÌ NEW NẤY, XỔ CÁI NẤY, XI63 ALL CỦA KHUÔN MÀ TA KHAI BÁO
        //c1.sayHi();
        
        //cú chót, KHIA CHA NEW CON, ĐỌC THEO KIỂU KẾ THỪA, GÁY NGOÀI ĐƯỜNG
        //MAỲ BIẾT TAO CON AI KHÔNG, BA TAO KHÔNG VỪA ĐÂU, DÙNG DANH NGĨA DÒNG HỌ
        //KHẨU KHÍ CỦA DÒNG HỌ, CHỨ KO PHẢI MÌNH
        Parent c2 = new Child("Can Ho cao cap", "DOGECOIN", "HAHA");
        //c2.sayHi();
        //CHỈ XỔ NHỮNG GÌ CỦA Cha, ko xổ riên ra con
        //riêng Con ccó trùng Cha tên hàm, vẫn gọi Cha nhưng chạy Con
        
        //đang dùng danh nghĩa của Cha, thì cư xử như Cha, Cha ép có hàm sayHi() lấy
        //gì mà xổ, trong RAM có sẽ sayHi() đấy, vì new Childe() sayHi()
        //clone khuôn Child như nhau, quan trọng con trỏ
        
        //List<Student> list = new ArrayList();
        //Cha                       Con
        
        //KỸ THUẬT CẠM VÀO THỨ RIÊNG TƯ CỦA CON
        //BA KO BIẾT TRONG SG CON LÀM GÌ, VẬY LÀM SAO BA CÓ THỂ BIẾT???
        //DÙNG KỸ THUẬT DRIFT CON TRỎ
        {
    }
}
