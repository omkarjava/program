package containment;

public class Jcb {
	 
	int engine;
	String model;
	MusicPlayer m;
	 Jcb (	int engine,String model,int price,String name)
	 {
		 this.engine=engine;
		 this.model=model;
		 this.m=new MusicPlayer( price,name);
	 }
	public String toString()
	{
		return engine+" "+model+" "+m;
	}
	

	public static void main(String[] args) {
		

	}

}
