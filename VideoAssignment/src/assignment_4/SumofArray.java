package assignment_4;

public class SumofArray {

	public static void main(StringExample[] args) {
		int a[]= {4,5,2,1,3,6,7,8,9};
		int sum=0;
		int p=1;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			p*=a[i];
		}
        System.out.println(sum);
        System.out.println(p);
	}

}
