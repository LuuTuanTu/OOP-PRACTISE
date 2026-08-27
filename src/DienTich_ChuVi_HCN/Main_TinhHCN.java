package DienTich_ChuVi_HCN;

public class Main_TinhHCN {
	public static void main (String[] args) {
		 HINHCHUNHAT HCN = new HINHCHUNHAT(10,20);
		 System.out.printf("Diện tích hình chữ nhật: %f", HCN.DienTich(10, 20));
		 System.out.printf("\nChu vi hình chữ nhật: %f", HCN.ChuVi(10, 20));
	}
	
}
