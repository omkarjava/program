
public class MissingNo {

	public static void main(String[] args) {
		//int a[]=new int[5];
        int a[]=  {1,3,4,6,8,9};
//        for(int i=0;i<a1.length;i++)
//        {
//        	System.out.println(a1[i]);
//        }
        int cnt=1;
        for(int i=0;i<a.length;)
        {
           if(a[i]==cnt)
           {
        	 i++;
        	 cnt++;
           }
           else
           {
        	System.out.println(cnt);
            cnt++;
           }
        }
	}

}
