package THUC_PHAM;

public class HangThucPham {
	private String MaHang;
	private String TenHang;
	private double Dongia;
	private String NgaySX;
	private String NgayHH;
	
	public HangThucPham(String MaHang, String TenHang, double Dongia, String NgaySX, String NgayHH)
	{
		this.MaHang = MaHang;
		this.TenHang = TenHang;
		this.Dongia = Dongia;
		this.NgaySX =NgaySX;
		this.NgayHH = NgayHH;
 	}

	public String getMaHang() {
		return MaHang;
	}

	public void setMaHang(String maHang) {
		MaHang = maHang;
	}

	public String getTenHang() {
		return TenHang;
	}

	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}

	public double getDongia() {
		return Dongia;
	}

	public void setDongia(double dongia) {
		Dongia = dongia;
	}

	public String getNgaySX() {
		return NgaySX;
	}

	public void setNgaySX(String ngaySX) {
		NgaySX = ngaySX;
	}

	public String getNgayHH() {
		return NgayHH;
	}

	public void setNgayHH(String ngayHH) {
		NgayHH = ngayHH;
	}
	
	
}

