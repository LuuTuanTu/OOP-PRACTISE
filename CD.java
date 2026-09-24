package QuanlyCD;

public class CD {
	private int maCD;
	private String nameCD;
	private int soBai;
	private double gia;
	
	public static final int default_ma = 99999;
	public static final String default_name = "unknown";
	
	public CD()
	{
		this.maCD = default_ma;
		this.nameCD = default_name;
		this.soBai = 1;
		this.gia = 1.0;
	}
	
	public CD(int maCD, String tuaCD, int soBai, double gia)
	{
		setMaCD(maCD);
		setNameCD(tuaCD);
		setSoBai(soBai);
		setGia(gia);
	}

	public int getMaCD() {return maCD;}
	public String getNameCD() {return nameCD;}
	public int getSoBai() {return soBai;}
	public double getGia() {return gia;}

	public void setMaCD(int maCD) {
		if(maCD <= 0)
			  throw new IllegalArgumentException("CD>0!");
		this.maCD = maCD;
	}

	public void setNameCD(String nameCD) {
		if (nameCD == null || nameCD.trim().isEmpty())
			throw new IllegalArgumentException("CD>0!");
		this.nameCD = nameCD;
	}

	public void setSoBai(int soBai) {
		if(soBai<=0)
			throw new IllegalArgumentException("SoBai>0!");
		this.soBai = soBai;
	}

	public void setGia(double gia) {
		if(gia<0)
			throw new IllegalArgumentException("GIA>=0!");
		this.gia = gia;
	}
	
	@Override
	public String toString() {
		return String.format(
			"| %-10d | %-25s | %-12d | %-15.2f |",
			maCD, nameCD, soBai, gia);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


