package QuanlyCD;

public class CDList {
	private CD[] dsCD;
	private int sl;
	private int size;


	private static final int default_size = 5;
	
	public CDList()
	{
		size = default_size;
		dsCD = new CD[size];
		sl = 0;
	}

	public int getSl() {return sl;}
	public CD getCDIndex(int i)
	{return dsCD[i];}
	
	public void TangMang() {
		int new_size = size*2;
		CD[] new_List = new CD[new_size];
		for(int i = 0; i<sl; i++)
			new_List[i] = dsCD[i];
		dsCD = new_List;
		size = new_size;
		System.out.println("Da duoc mo rong mang len" + size +"Phan tu");
	}
	
	public int tim(int maCD)
	{
		for(int i = 0; i<sl; i++)
		{
			if(dsCD[i].getMaCD() == maCD) return i;
		}
		return -1;
	}
	
	public boolean themCD(CD cd)
	{
		if(tim(cd.getMaCD()) != -1) {
			System.out.println("Ma da ton tai");
			return false;
		}
		if (sl == size) TangMang();
		dsCD[sl] = cd;
		sl++;
		return true;
	}
	

	

}


