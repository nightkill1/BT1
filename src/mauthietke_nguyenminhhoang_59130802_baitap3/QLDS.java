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

public class QLDS implements Interface {
    // attributes
    private ArrayList<CaNhan> dsCN = new ArrayList<>();

    // constructor
    public QLDS(ArrayList<CaNhan> dsCaNhan) {
        this.dsCN = dsCaNhan;
    }
    
    // methods
    // them ca nhan
    @Override
    public int them(CaNhan cn) {
      dsCN.add(cn);
      return 1;
    }

    // xoa ca nhan
  

    // in ds ca nhan
    @Override
    public void inDS() {
      dsCN.forEach(cn -> System.out.println(cn.HienThiTT()));
    }

    @Override
    public int Xoa(String Ten) {
        if (dsCN.removeIf(cn -> cn.hoTen.equals(Ten))) {
        return 1;
      }
      return 0;
    }
}
