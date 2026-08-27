package DienTich_ChuVi_HCN;

public class HINHCHUNHAT {
	private double chieudai;
	private double chieurong;
		
	public  HINHCHUNHAT(double chieudai , double chieurong){
		this.chieudai = chieudai;
		this.chieurong = chieurong;		
	}

	public double getChieudai() {
		return chieudai;
	}

	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}

	public double getChieurong() {
		return chieurong;
	}

	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}
	
	public double DienTich(double chieudai, double chieurong) {
		return chieudai*chieurong;
	}
	public double ChuVi(double chieudai, double chieurong) {
		return (chieudai+chieurong)/2;
	}
}


