package LAB2;

import java.util.Scanner;

public class SINHVIEN {
    private int MaSV;
    private String Hoten;
    private double DiemLT;
    private double DiemTH;

    public SINHVIEN() {
        this.MaSV = 0;
        this.Hoten = "unknown";
        this.DiemLT = 0.0;
        this.DiemTH = 0.0;
    }
    
    public SINHVIEN(int MaSV, String Hoten, double DiemLT, double DiemTH) {
        if (MaSV > 0) {
            this.MaSV = MaSV;
        } else {
            this.MaSV = 0;
        }
        this.Hoten = Hoten;
        this.DiemLT = DiemLT;
        this.DiemTH = DiemTH;
    }

    public int getMaSV() { return MaSV; }
    public void setMaSV(int maSV) { MaSV = maSV; }

    public String getHoten() { return Hoten; }
    public void setHoten(String hoten) { Hoten = hoten; }

    public double getDiemLT() { return DiemLT; }
    public void setDiemLT(double diemLT) { DiemLT = diemLT; }

    public double getDiemTH() { return DiemTH; }
    public void setDiemTH(double diemTH) { DiemTH = diemTH; }

    public double DTB() {
        return (DiemLT + DiemTH) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %-10.2f %-10.2f %-10.2f", 
                MaSV, Hoten, DiemLT, DiemTH, DTB());
    }

    public static void main(String[] args) {
        SINHVIEN sv1 = new SINHVIEN();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== NHẬP THÔNG TIN SINH VIÊN ===");
        
        System.out.print("Nhập mã sinh viên: ");
        int ma = sc.nextInt();
        sv1.setMaSV(ma);
        sc.nextLine();
        
        System.out.print("Nhập họ và tên: ");
        String ten = sc.nextLine();
        sv1.setHoten(ten);
        
        System.out.print("Nhập điểm lý thuyết: ");
        double lt = sc.nextDouble();
        sv1.setDiemLT(lt);
        sc.nextLine();
        
        System.out.print("Nhập điểm thực hành: ");
        double th = sc.nextDouble();
        sv1.setDiemTH(th);
        
        System.out.println("\n=== THÔNG TIN VỪA NHẬP ===");
        System.out.println("Mã SV: " + sv1.getMaSV());
        System.out.println("Họ tên: " + sv1.getHoten());
        System.out.println("Điểm LT: " + sv1.getDiemLT());
        System.out.println("Điểm TH: " + sv1.getDiemTH());
        System.out.println("Điểm TB: " + sv1.DTB());

        sc.close();
    }
}