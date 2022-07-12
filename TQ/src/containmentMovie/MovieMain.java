        package containmentMovie;

        import java.util.Scanner;

        public class MovieMain {

	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Movie mo[]=new Movie[2];
		for(int i=0;i<2;i++)
		{
		System.out.println("movie id,name,collection");
		int mid=sc.nextInt();
		String mname=sc.next();
		int collection=sc.nextInt();
		   Actor ac[]=new Actor[2];
		   for(int j=0;j<2;j++)
		   {
			   System.out.println("id,name,birthyear,address");
			   int id=sc.nextInt();
			   String name=sc.next();
			   int birthyear=sc.nextInt();
			   String address=sc.next();
			
			  Actor a1=new Actor();
			  a1.setId(id);
			  a1.setName(name);
			  a1.setBirthyear(birthyear);
			  a1.setAddress(address);
			
			  ac[j]=a1;
			
			
		   }
		      Movie m1=new Movie();
	          m1.setMid(mid);
		      m1.setMname(mname);
		      m1.setCollection(collection);
		      m1.setAc(ac);
		
		      mo[i]=m1;
		
		}
		
		for(Movie b:mo)
		{
			for(Actor h:b.ac)
			{
				if(h.getName().equals("akshaykumar")&& b.getCollection()>50000)
				{
					System.out.println(b.mname+h.name+" "+h.address+" "+h.birthyear+" "+ h.id+""+b.collection);
				}
			}
		}
		
		
		
	}

}
