package video1;

public class Book {
	int bookid;
	String bookname;
	int price; 
	Auther a;
	Book(int bookid,String bookname,int price,Auther a)
	{
		this.bookid=bookid;
		this.bookname=bookname;
		this.price=price;
		this.a=a;
	}
	public String toString()
	{
		return bookid+" "+bookname+" "+price;
	}
 
	public static void main(String[] args) {
		
		Book barr[]=new Book[5];
		Auther s=new Auther("ram",52,"ww.Auther@gmail");
		barr[0]=new Book(1001,"java",100,s);
		barr[1]=new Book(1002,"c++",900,s);
		barr[2]=new Book(1003,"html",700,s);
		barr[3]=new Book(1004,"python",1500,s);
		barr[4]=new Book(1004,"java2",400,s);
		System.out.println(s);
		for(int i=0;i<barr.length;i++)
		{
			System.out.println(barr[i]);
		}
	}

}
