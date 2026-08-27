package Dien_TIch_Chu_Vi_Hinhtron;

public class Main_Tinh {
	public static void main(String[] args) {
		HINHTRON h1 = new HINHTRON(10.0);
		System.out.printf("\nDien Tich Tròn Co Ban Kinh: %f" ,h1.DienTich(10));
		TOADO h2 = new TOADO(5,2,8,3);
		System.out.printf("\nDiện tích hình tròn bằng tọa độ: %f", h2.DienTich_Toado(5,2,8,3));
	}
}
