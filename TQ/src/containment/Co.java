package containment;

public class Co {
	int cid;
	String name;
	C car;
	Co(int cid,String name,int id,String cname,int price)
	{
		this.cid=cid;
		this.name=name;
		this.car=new C(id,cname,price);
	}
   
	public String toString()
	{
		return cid+" "+name+" "+car;
	}
}
