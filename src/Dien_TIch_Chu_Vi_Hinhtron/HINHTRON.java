package Dien_TIch_Chu_Vi_Hinhtron;

public class HINHTRON {
		double BanKinh;
		public HINHTRON(double BanKinh) {
			this.BanKinh = BanKinh;
		}
		public double getBanKinh() {
			return BanKinh;
		}
		public void setBanKinh(double BanKinh) {
			this.BanKinh = BanKinh;
		}
		public double DienTich(double BanKinh) {
			return BanKinh*BanKinh*3.1416;		
		}
	}


