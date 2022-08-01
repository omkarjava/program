     package classesandobjectassi;
     import java.util.Scanner;
     public class Box {
     float length,width,height,volume=0.0f;
     
     void box(float l,float w,float h)
     {
     length=l;
     width=w;
     height=h;
     }
     void volume()
     {
    	 volume=(length*width*height);
    	 
     }
     public String toString()
     {
    	 return("volume="+(length*width*height));
     }
     
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length width height");
	
	Box b1=new  Box();
	float length=sc.nextFloat();
	float width=sc.nextFloat();
	float height=sc.nextFloat();
	b1.box(length,width,height);
	System.out.println(b1);
	
	Box b2=new  Box();
	System.out.println("enter the length width height");
	 length=sc.nextFloat();
	 width=sc.nextFloat();
	 height=sc.nextFloat();
	b2.box(length,width,height);
	System.out.println(b2);
	}
	

}
