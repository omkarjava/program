package supplier;

public class Supplier {
	int supid;
	String name,contact;
	public Supplier(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
	  return supid+name+contact;	
	}
	//void Supplier() {}
	void supplier(int supid,String name,String contact)
	{
		this.supid=supid;
		this.name=name;
		this.contact=contact;
		
	}

	
   //
	public static void main(String[] args) {
		
        Supplier s[];
        s=new Supplier[3];
        System.out.println(s[0]);
        s[0]=new Supplier (12,"ram",3214563);
        s[1]=new Supplier (13,"raj",32145566);
        s[2]=new Supplier (14,"rak",321455463);
        
        System.out.println("Supplier Record");
//        for(int i=0;i<s.length;i++)
//        {
//        	System.out.println(s[i]);
//        	System.out.println("---------------------");
//        }
        for(Supplier obj:s)
        {
        	System.out.println(obj);
        }
	
	}

}
