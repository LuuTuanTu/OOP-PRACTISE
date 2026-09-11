package QLCD;

public class CD {
	/*25635111-LuuTuanTu
	Tao attribute cho class*/
	
	private String MaCD;
	private String TenCD;
	private int  Sobai;
	private double Gia;
	
	//Tao Constructor default
	
	public CD()
	{
		MaCD  = "none";
		TenCD = "none";
		Sobai = 0;
		Gia = 0.0;
	}
	//GET SET

	public String getMaCD() {
		return MaCD;
	}

	public void setMaCD(String maCD) {
		MaCD = maCD;
	}

	public String getTenCD() {
		return TenCD;
	}

	public void setTenCD(String tenCD) {
		TenCD = tenCD;
	}

	public int getSobai(int Sobai) {
		return Sobai;
	}

	public void setSobai(int Sobaihat) throws Exception {
		if(Sobaihat>0)
		{
			this.Sobai = Sobaihat;
		}
		else {
			throw new Exception("So bai > 0");
		}
		
	}

	public double getGia() {
		return Gia;
	}

	public void setGia(double gia) throws Exception {
		if(gia>0)
		{
			this.Gia = gia;
		}
		else {
			throw new Exception("GIA > 0");
		}
	}
	
	//CONSTRUCTTOR
	 public CD(String MaCD, String TenCD, int Sobai, double Gia) throws Exception
	 {
		 this.MaCD = MaCD;
		 this.TenCD = TenCD;
		 if(Sobai>0)
		 {
			 this.Sobai = Sobai;
		 }
		 else {
			 throw new Exception("Sobai > 0");
		 }
		 if(Gia>0)
		 {
			 this.Gia = Gia;
		 }
		 else {
			 throw new Exception("Gia > 0");
		 }
	 }
	 public static void tieude() {
		 System.out.println("In Danh Sach CD: ");
		 for(int i = 0; i<100; i++)
			 System.out.printf("-");
		 System.out.printf("\n");
	 }
	
	 public static void main(String[] args) {
		 tieude();
	 }
	 

	
	
	
	
	
}
