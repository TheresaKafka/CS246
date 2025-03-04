/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author ACER
 */
public class TinhPhuongTrinhX {
    private int choice;

    public TinhPhuongTrinhX() {
    }

    public TinhPhuongTrinhX(int choice) {
        this.choice = choice;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
    public String TimX(double a, double b,double c,double d)
    {
        String kq = "";
        if(choice==2)
        {
            double dt, k, x1, x2, x3, x;
    if (a == 0) {
        return("Đây không phải là phương trình bậc 3.");
    }

    // Tính delta và k
    dt = Math.pow(b, 2) - 3 * a * c;
    k = (9 * a * b * c - 2 * Math.pow(b, 3) - 27 * Math.pow(a, 2) * d) /
        (2 * Math.sqrt(Math.pow(Math.abs(dt), 3)));
    if (dt > 0) {
        if (Math.abs(k) <= 1) {
            x1 = (2 * Math.sqrt(dt) * Math.cos(Math.acos(k) / 3) - b) / (3 * a);
            x2 = (2 * Math.sqrt(dt) * Math.cos(Math.acos(k) / 3 - (2 * Math.PI / 3)) - b) / (3 * a);
            x3 = (2 * Math.sqrt(dt) * Math.cos(Math.acos(k) / 3 + (2 * Math.PI / 3)) - b) / (3 * a);
            kq = "x1=" + x1 + "; x2=" + x2 + "; x3=" + x3;
        } else {
            x = ((Math.sqrt(dt) * Math.abs(k)) / (3 * a * k)) * 
                (Math.pow(Math.abs(k) + Math.sqrt(Math.pow(k, 2) - 1), 1.0 / 3) + 
                 Math.pow(Math.abs(k) - Math.sqrt(Math.pow(k, 2) - 1), 1.0 / 3)) - (b / (3 * a));
            kq = "x=" + x;
        }
    } else if (dt == 0) {
        x = -b / (3 * a);
        kq = "x = " + x;
    } else { 
        // Trường hợp có nghiệm phức
        double realPart = -b / (3 * a);
        double imaginaryPart = Math.sqrt(Math.abs(dt)) / (3 * a);
        kq = "x1=" + realPart + "; x2=" + realPart + "+" + imaginaryPart + "i"
           + "; x3=" + realPart + "-" + imaginaryPart + "i";
    }   
        }  
        else if(choice ==1)
        {
            if (a == 0) {
            if (b == 0) {
                return("Phương trình vô nghiệm.");
            } else {
                double x = -c / b;
                return("x = " + x);
            }
            
        }
            //Tính Delta
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta > 0) {
            // Hai nghiệm phân biệt
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);  
            kq =("x1 = " + x1)
            +(";x2 = " + x2);
        } else if (delta == 0) {
            // Nghiệm kép
            double x = -b / (2 * a);
            kq=("x = " + x);
        }else {
            // Hai nghiệm phức
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            
            kq=("x1 = " + realPart + " + " + imaginaryPart + "i")
            +(";x2 = " + realPart + " - " + imaginaryPart + "i");
        }
        }else if (choice==0){
         if (a == 0) {
            if (b == 0) {
                return ("Phương trình có vô số nghiệm.");
            } else {
                return ("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            kq=("x = " + x);
        }   
        }    
        return kq;
    }
}
