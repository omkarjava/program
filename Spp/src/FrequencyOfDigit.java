
    public class FrequencyOfDigit {

	public static void main(String[] args) {
	int num=112455,temp;
	temp=num;
	for(int i=0;i<=9;i++)
	{ 
	  int cnt=0;
	   while(num!=0)
	   {
	       int r=num%10;
	       if(r==i)
	      {
		   cnt++;
	      }
	       num=num/10;
	    }
	 num=temp;
	 if(cnt>0)
	 System.out.println(i +" "+ cnt);	
	}
	}
    }
