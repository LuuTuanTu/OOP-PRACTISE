package WEEK2;

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
        setMaSV(MaSV);
        setHoten(Hoten);
        setDiemLT(DiemLT);
        setDiemTH(DiemTH);
    }

    public int getMaSV() { return MaSV; }
    public void setMaSV(int maSV) { 
        if (maSV > 0) {
            this.MaSV = maSV; 
        } else {
            this.MaSV = 0;
        }
    }

    public String getHoten() { return Hoten; }
    public void setHoten(String hoten) { 
        if (hoten != null && !hoten.trim().isEmpty()) {
            this.Hoten = hoten; 
        } else {
            this.Hoten = "unknown";
        }
    }

    public double getDiemLT() { return DiemLT; }
    public void setDiemLT(double diemLT) { 
        if (diemLT >= 0.0 && diemLT <= 10.0) {
            this.DiemLT = diemLT; 
        } else {
            this.DiemLT = 0.0;
        }
    }

    public double getDiemTH() { return DiemTH; }
    public void setDiemTH(double diemTH) { 
        if (diemTH >= 0.0 && diemTH <= 10.0) {
            this.DiemTH = diemTH; 
        } else {
            this.DiemTH = 0.0;
        }
    }

    public double DTB() {
        return (DiemLT + DiemTH) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-25s %-10.2f %-10.2f %-10.2f", 
                MaSV, Hoten, DiemLT, DiemTH, DTB());
    }

    public static void main(String[] args) {
        SINHVIEN sv1 = new SINHVIEN(25635111, "Luu Tuan Tu", 8.5, 9.0);
        SINHVIEN sv2 = new SINHVIEN(25635112, "Nguyen Van A", 7.0, 8.0);
        SINHVIEN sv3 = new SINHVIEN();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("=== NHẬP THÔNG TIN SINH VIÊN 3 ===");
        
        System.out.print("Nhập mã sinh viên: ");
        int ma = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nhập họ và tên: ");
        String ten = sc.nextLine();
        
        System.out.print("Nhập điểm lý thuyết: ");
        double lt = sc.nextDouble();
        
        System.out.print("Nhập điểm thực hành: ");
        double th = sc.nextDouble();
        
        sv3.setMaSV(ma);
        sv3.setHoten(ten);
        sv3.setDiemLT(lt);
        sv3.setDiemTH(th);
        
        System.out.println("\n================================ DANH SÁCH SINH VIÊN ================================");
        System.out.printf("%-10s %-25s %-10s %-10s %-10s\n", "MSSV", "Họ Tên", "Điểm LT", "Điểm TH", "Điểm TB");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
        System.out.println("-------------------------------------------------------------------------------------");

        sc.close();
    }
}