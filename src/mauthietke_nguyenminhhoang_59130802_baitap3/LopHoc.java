/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mauthietke_nguyenminhhoang_59130802_baitap3;

import java.util.ArrayList;

/**
 *
 * @author beron
 */
public class LopHoc  {
    
    public GiaoVien GV;
    ArrayList<CaNhan> DSHS;
    ArrayList<CaNhan> DSGV;
    
    private Interface QlDsGV = null;
    
    private Interface QlDsHS = null;
    
     public  LopHoc() {
        this.GV = new GiaoVien();
        this.DSHS = new ArrayList<>();
        this.DSGV = new ArrayList<>();
        this.QlDsHS = new QLDS(DSHS);
        this.QlDsGV = new QLDS(DSGV);
    }
    // contructor LopHoc voi giao vien chu nhiem truyen vao
    public LopHoc(GiaoVien gvChuNhiem) {
        this.GV = gvChuNhiem;
        this.DSHS = new ArrayList<>();
        this.DSGV = new ArrayList<>();
        this.QlDsHS = new QLDS(DSHS);
        this.QlDsGV = new QLDS(DSGV);
    }
    
    public void setGiaoVienCN(GiaoVien GVCN)
    {
        this.GV = GVCN; 
    } 
    public GiaoVien getGiaoVienCN()
    { 
        return GV; 
    }

     public int themHocSinh(HocSinh hs) {
      if (QlDsHS.them(hs) == 1) {
        return 1;
      }
      return 0;
    }
    
     
    public int themGVGD(GiaoVien gv) {
      if (QlDsGV.them(gv) == 1) {
        return 1;
      }
      return 0;
    }
    
    
    public int inDSHS() {
        System.out.println("DS hoc sinh:");
        QlDsHS.inDS();

        return 1;
    }
    public int inDSGVGD() {
        System.out.println("DS giao vien giang day:");
        QlDsGV.inDS();
     
        return 1;
    }
          
}
