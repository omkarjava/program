package containment;

public class MusicPlayer {
	
	 int price;
	 String name;
	 MusicPlayer (int price,String name)
	 {
		 this.price=price;
		 this.name=name;
	 }
	 public String toString()
	 {
		 return   price+" "+name;
	 }

	public static void main(String[] args) {
		 
		 Jcb m=new  Jcb (6946,"gffhgv",98989,"vhjh");
		 
		
		System.out.println(m);
		

	}

}
