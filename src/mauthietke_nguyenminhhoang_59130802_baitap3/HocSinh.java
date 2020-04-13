/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauthietke_nguyenminhhoang_59130802_baitap3;

/**
 *
 * @author beron
 */
public class HocSinh extends CaNhan{
    String Lop;
    String nangKhieu;
    
    public void setLop(String Lop)
    {
        this.Lop = Lop;
        
    }
    public void setnangKieu(String nangKhieu)
    {
        this.nangKhieu = nangKhieu;
        
    }
    public String getLop()
    {
        return Lop;
    }
    public String getnangKieu()
    {
        return nangKhieu;
    }
    public HocSinh()
    {
        this.Lop = "";
        this.nangKhieu = "";
    }
    public void HocSinh(String Hoten, int tuoi,  String diaChi, String sdt,String Lop, String nangKieu)
    {
        this.hoTen = Hoten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.Lop = Lop;
        this.nangKhieu = nangKieu;
    }
    public String HienThiTT(){
        String thongTin = "";
      thongTin = "ho ten: " + this.hoTen + "\n tuoi: " + this.tuoi + "\n dia chi: " + this.diaChi
        + "\n sdt: " + this.sdt + "\n lop: " + this.Lop + "\n nang khieu: " + this.nangKhieu;

//      System.out.println(thongTin);
      return thongTin;
    }
   
            
}
