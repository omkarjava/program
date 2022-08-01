
public class FrequencyofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=122322455,temp;
		temp=num;
		
		for(int i=0;i<=9;i++) //i=1
		{
			int cnt=0;
			while(num!=0)     //num=12345  num=1234 num=123 num=12 num=1
			{
				int r= num%10; //r=5                               r=1
				if(r==i)
				{
					cnt++;  //                                     cnt=1;
				}
				num=num/10;
						
			}
			num=temp;//num=12345  //num=12345
			if(cnt>0)
			System.out.println(i+" "+cnt);                       //1 1
		}

	}

}
