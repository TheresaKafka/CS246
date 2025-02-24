/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ACER
 */
public class DataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XuLyDuLieu a =new XuLyDuLieu();
        a.themDuLieu("50");
        a.themDuLieu("*");
        a.themDuLieu("2");
        a.themDuLieu("+");
        a.themDuLieu("10");
        a.xulytaoketqua();
        System.out.println(a.HienThiDuLieu());
        LuuTruDuLieu b= new LuuTruDuLieu("5+5=9", 4.0);
        MangLuuTruDuLieu LichSu= new MangLuuTruDuLieu();
        LichSu.them(b);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("His.txt"))) {
            for (LuuTruDuLieu it :LichSu.getMang()) {
                writer.write(it.tostring());
                writer.newLine(); // Xuống dòng sau mỗi phần tử
            }
            System.out.println("Ghi ArrayList vào file thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
    
}
