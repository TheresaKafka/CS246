/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

import database.XuLyDuLieu;

/**
 *
 * @author ACER
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XuLyDuLieu a =new XuLyDuLieu();
        a.themDuLieu("50");
        a.themDuLieu("*");
        a.themDuLieu("2");
        a.xulytaoketqua();
        System.out.println(a.HienThiDuLieu());
    }
    
}
