/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import javax.management.StringValueExp;

/**
 *
 * @author ACER
 */
public class LuuTruDuLieu extends MayTinh_DB{
    double thoigianthuchien;

    public LuuTruDuLieu() {
    }

    public LuuTruDuLieu(String DuLieuPhepTinh,double thoigianthuchien) {
        super(DuLieuPhepTinh);
    }

    public double getThoigianthuchien() {
        return thoigianthuchien;
    }

    public void setThoigianthuchien(double thoigianthuchien) {
        this.thoigianthuchien = thoigianthuchien;
    }
    public String tostring()
    {
        String temp =getDuLieuPhepTinh()+";"+String.valueOf(getThoigianthuchien());
        return temp;
    }
}
