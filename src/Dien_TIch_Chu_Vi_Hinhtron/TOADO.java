package Dien_TIch_Chu_Vi_Hinhtron;

public class TOADO {
	private int xo, yo;
	private int xr, yr;
	
	public TOADO(int xo, int yo, int xr, int yr) {
		this.xo = xo;
		this.xr = xr;
		this.yo = yo;
		this.yr = yr;
	}

	public int getXo() {
		return xo;
	}

	public void setXo(int xo) {
		this.xo = xo;
	}

	public int getYo() {
		return yo;
	}

	public void setYo(int yo) {
		this.yo = yo;
	}

	public int getXr() {
		return xr;
	}

	public void setXr(int xr) {
		this.xr = xr;
	}

	public int getYr() {
		return yr;
	}

	public void setYr(int yr) {
		this.yr = yr;
	}
	public double DienTich_Toado(int xo, int yo, int xr, int yr) {
		return Math.sqrt((xo-xr)*(xo-xr) + (yo-yr)*(yo-yr));
	}
}

