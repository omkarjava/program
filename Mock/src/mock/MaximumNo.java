package mock;

public class MaximumNo {

	public static void main(String[] args) {
		 int d=41552589;
		 int s=0;
		 while(d!=0)
		 {
			int r=d%10;
			 if(r>s)
			  s=r;
			 d=d/10;
		 }
		 System.out.println(s);
	}

}
