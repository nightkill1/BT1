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
public abstract class CaNhan {
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;
    public CaNhan()
    {
        this.hoTen = "";
        this.tuoi = 0;
        this.diaChi = "";
        this.sdt = "";
    }
     public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
      this.hoTen = hoTen;
      this.tuoi = tuoi;
      this.diaChi = diaChi;
      this.sdt = sdt;
    }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
    public void setSdt(String sdt) { this.sdt = sdt; }
    public String getHoTen() { return this.hoTen; }
    public int getTuoi() { return this.tuoi; }
    public String getDiaChi() { return this.diaChi; }
    public String getSdt() { return this.sdt; }

    public abstract String HienThiTT();
  
    
}
