/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class MangLuuTruDuLieu {
    ArrayList <LuuTruDuLieu> mang =new ArrayList<>();
    public void them(LuuTruDuLieu a)
    {
        mang.add(a);
    }

    public ArrayList<LuuTruDuLieu> getMang() {
        return mang;
    }

    public void setMang(ArrayList<LuuTruDuLieu> mang) {
        this.mang = mang;
    }
    public MayTinh_DB timkiem(MayTinh_DB a)
    {
        MayTinh_DB temp =null;
        for (MayTinh_DB it : mang)
            if(it.getDuLieuPhepTinh().equals(a))
                   temp =it;
        return temp;
    }
}
