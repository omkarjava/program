package video1;


	public class Bikes implements Comparable<Bikes>{
		
		int id;
		String name,brand;
		
		Bikes(int id,String name,String brand)
		{
			this.id=id;
			this.name=name;
			this.brand=brand;
		}
		public String toString()
		{
			return id+" "+name+" "+brand;
		}
		
	   public int compareTo(Bikes j)
	   {
		   return this.id-j.id;
	   }

}
