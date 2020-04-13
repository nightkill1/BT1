/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauthietke_nguyenminhhoang_59130802_baitap3;

import java.util.Scanner;

/**
 *
 * @author beron
 */
public class MauThietKe_NguyenMinhHoang_59130802_Baitap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         
        Scanner sc = new Scanner(System.in);
        
        
        GiaoVien gvch = new GiaoVien();
        gvch.setHoTen("Nguyen Cong Son");
        gvch.setTuoi(35);
        gvch.setDiaChi("Nha Trang");
        gvch.setSdt("0123321654");
        gvch.setmonDay("Lap trinh huong doi tuong");
        gvch.settoBoMon("Phan Mem");
        
        
        LopHoc lopHoc = new LopHoc(gvch);

       
        HocSinh hs1 = new HocSinh();
        hs1.setHoTen("Nguyen Minh Hoang");
        hs1.setTuoi(20);
        hs1.setDiaChi("Van Ninh");
        hs1.setSdt("0344612169");
        hs1.setLop("59-CNTT.2");
        hs1.setnangKieu("hat");
       
        lopHoc.themHocSinh(hs1);

 
        HocSinh hs2 = new HocSinh();
       
        hs2.setHoTen("Le anh Tu");
        hs2.setTuoi(20);
        hs2.setDiaChi("Ninh Hoa");
        hs2.setSdt("0123987456");
        hs2.setLop("59-CNTT.2");
        hs2.setnangKieu("Nhay");
        lopHoc.themHocSinh(hs2);

       
        
        HocSinh hs3 = new HocSinh();
        hs3.setHoTen("Pham Thu Ha");
        hs3.setTuoi(21);
        hs3.setDiaChi("Tuy An");
        hs3.setSdt("0123925852");
        hs3.setLop("58-CNTT.1");
        hs3.setnangKieu("Mua");
        lopHoc.themHocSinh(hs3);


        
        GiaoVien gv1 = new GiaoVien();
        gv1.setHoTen("Nguyen Thi Thu Thuy");
        gv1.setTuoi(40);
        gv1.setSdt("09333333");
        gv1.setDiaChi("Nha Trang");
        gv1.setmonDay("He Quan Tri CSDL");
        gv1.settoBoMon("Pham Mem");
      
        lopHoc.themGVGD(gv1);

  
        GiaoVien gv2 = new GiaoVien();
        
        gv2.setHoTen("Mai Cuong Tho");
        gv2.setTuoi(41);
        gv2.setSdt("099999999");
        gv2.setDiaChi("Ha Noi");
        gv2.setmonDay("Lap Trinh Mang");
        gv2.settoBoMon("Mang May Tinh");
      
                
   
        lopHoc.themGVGD(gv2);

      
        GiaoVien gv3 = new GiaoVien();
       
        gv3.setHoTen("Doan Vu Thinh");
        gv3.setTuoi(38);
        gv3.setSdt("096969696");
        gv3.setDiaChi("Dong Hoa");
        gv3.setmonDay("T.h Tin Hoc co so");
        gv3.settoBoMon("Pham Mem");
      
    
  
        lopHoc.themGVGD(gv3);

      
        
        lopHoc.inDSHS();

        lopHoc.inDSGVGD();
    }
    
}
