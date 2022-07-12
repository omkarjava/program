        import java.util.Scanner;

        public class FloatNo {

	    public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Array Size");
//		float size=sc.nextInt();
//		float a[]=new float [ (int) size];
//		System.out.println("Enter the no of Element");
	    float a[] = {4.2f,4.5f,4,5,6};
        for(int i=0;i<a.length;i++)
        {
        System.out.println(a[i]+ " ");
        }
        float sum=0;
        for(int i=0;i<a.length;i++)
        {
        	sum=sum+a[i];	
        }
        System.out.println();
        float average=sum/a.length;
        System.out.println(average);
        

	}

}
