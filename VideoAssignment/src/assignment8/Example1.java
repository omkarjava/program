package assignment8;

public class Example1 {

	public static void main(String[] args) {
//		int arr[][] ={{22, 31, 9}, {12, 25, 16}};
//		int max=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr.length;j++)
//			{
//				if(arr[i][j]>max)
//				{
//					max=arr[i][j];
//				}
//			}
//		}
//		System.out.println(max);

		int arr[][]={{22, 31, 9}, {12, 5,16}, {34, 42, 2}};
		int max=34;
		for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
			{
					if(arr[i][j]<max)
					{
						max=arr[i][j];
					}
				}
			}
			System.out.println(max);
		
	}

}
