package interfase;

public class Gs1 implements Name{
	  

       
	    public void data()
	   {
		System.out.println("ucav");
	   }
//      public Gs1(int a, String name) 
//      {
//		super(a, name);
//		 
//	   
        void setdata()
     	{
       // super.setdata();
  		System.out.println("run fast");
  	    }


	float m=5.5f;
	
	   

	public static void main(String[] args) {
		Gs1 s =new Gs1 ();
        //System.out.println(s.a);
       // s.setdata();
		
		s.setdata();
		s.data();
		
	}

}
