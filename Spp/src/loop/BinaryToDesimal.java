package loop;

public class BinaryToDesimal {

	public static void main(String[] args) {
	  int[] binary=new int[1000];
	  int i=0;
	  int n=5;
	  while(n>0)
	  {
		  binary [i]=n%2;
		  n=n/2;
		  i++;
	  }
	  for(int j=i-1;j>=0;j--)
	  {
		  System.out.print(binary[j]);
	  }

	}

}
