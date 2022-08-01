    package constructor;
    import java.util.Scanner;
    public class Theater {
	int contact;
	String name,movie1,movie2,movie3,adress,movie;
	 
	void setname(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
	} 
	void setmovie1(String movie1)
	{
		this.movie1=movie1;
	}
	String getmovie1()
	{
		return movie1;
	} 
	void setmovie2(String movie2)
	{
		this.movie2=movie2;
	}
	String getmovie2()
	{
		return movie2;
	}
	void setmovie3(String movie3)
	{
		this.movie3=movie3;
	}
	String getmovie3()
	{
		return movie3;
	}
	
	void setadress(String adress)
	{
		this.adress=adress;
	}
	String getadress()
	{
		return adress;
	}
	void setcontact(int contact)
	{
		this.contact=contact;
	}
	int getcontact()
	{
		return contact;
	}
	void movieDetail(String movie)
	{
		if(movie.equalsIgnoreCase(movie1))
		{
			System.out.println("ticket price:150,200,250,300");
			System.out.println("Shows:9am,12am,3pm,6pm,2pm");
		}
		else if(movie.equalsIgnoreCase(movie2))
		{
			System.out.println("ticket price:50,150,100,300");
			System.out.println("shows:5am,9am,6pm,10pm");
		}
		else if(movie.equalsIgnoreCase(movie3))
		{
			System.out.println("ticket price:500,550,300,800");
			System.out.println("shows:4am,8am,10pm,12pm");
		}
		else
		{
			System.out.println("no show");
		}
	}
	
	
	public String toString()
	{
	return name+" "+movie1+" "+movie2+" "+movie3+" "+adress+" "+contact;
	}

	public static void main(String[] args) {
		Theater T1=new Theater();
		T1.setname("Laxminarayan");
		T1.setmovie1("pushpa");
		T1.setmovie2("pawankhind");
		T1.setmovie3("golmal");
		T1.setadress("swargate");
        T1.setcontact(9683343);
       
        
        
      Scanner sc=new Scanner(System.in);
      System.out.println(T1.getname());
      System.out.println("movies:"+T1.getmovie1()+"/"+T1.getmovie2()+"/"+T1.getmovie3());
      System.out.println("Enter the movie name:");
      String movie=sc.next();
      T1.movieDetail(movie);
        
	}
	

}
