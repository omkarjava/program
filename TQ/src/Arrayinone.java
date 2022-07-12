import java.util.Arrays;

public class Arrayinone {

	public static void main(String[] args) {
       int a[]= {5,8,7,9,5,12,3,3,65,4};
       int b[]= {5,8,7,6,2,9};
       int n=a.length;
       int m=b.length;
       int c=n+m;
       int d[]=new int [c];
       for(int i=0;i<a.length;i++)
       {
    	   d[i]=a[i];
       }
       System.out.println(Arrays.toString(d));
       for(int i=0;i<b.length;i++)
       {
    	   d[i+a.length]=b[i];
       } 
       System.out.println(Arrays.toString(d));
	}

}
