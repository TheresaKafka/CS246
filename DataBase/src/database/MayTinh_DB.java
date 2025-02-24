/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author ACER
 */
public class MayTinh_DB {
    String DuLieuPhepTinh;
    public MayTinh_DB (){DuLieuPhepTinh="";}
    public MayTinh_DB(String DuLieuPhepTinh) {
        this.DuLieuPhepTinh = DuLieuPhepTinh;
    }

    public String getDuLieuPhepTinh() {
        return DuLieuPhepTinh;
    }

    public void setDuLieuPhepTinh(String DuLieuPhepTinh) {
        this.DuLieuPhepTinh = DuLieuPhepTinh;
    }
    
}
