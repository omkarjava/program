package example;

public class Digit {

	public static void main(String[] args) {
	int a[]= {4,2,5,5,7,12,20,10,25,3,8};
	int b=0;
	 for(int i=0;i<a.length;i++)
	 {
		if(a[i]>10 && a[i]<Integer.MAX_VALUE)
		{
			b+=a[i];
		}
	 }
     System.out.println(b);
    
	}

}
