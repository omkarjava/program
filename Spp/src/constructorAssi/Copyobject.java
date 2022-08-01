    package constructorAssi;

    public class Copyobject {
	int id;
	String name;
	Copyobject(int id , String name)
	{
		this.id=id;
		this.name=name;
	}
	Copyobject(Copyobject obj)
	{
		this.id=obj.id;
		this.name=obj.name;
	}
	public void display()
	{
		System.out.println("Details:"  + id + "  " + name );
	}

	public static void main(String[] args) {
		Copyobject a= new Copyobject(101,"ram");
		//System.out.println(a.id+" "+a.name);
		Copyobject b= new Copyobject(a);
		//System.out.println(a.id+" "+a.name);
        //a.display();
		b.display();
		

	}

}
