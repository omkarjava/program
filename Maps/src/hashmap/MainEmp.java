package hashmap;

import java.util.HashMap;

public class MainEmp {

	public static void main(String[] args) {
		
		
		
		
		 HashMap<CustomizedEmployeeKey,Integer>st=new HashMap<>();
      
		 st.put(new CustomizedEmployeeKey(12,"ram","hr"),500000);
		 st.put(new CustomizedEmployeeKey(12,"ram","hr"),500000);
		 st.put(new CustomizedEmployeeKey(13,"ramesh","maeketing"),580000);
		 st.put(new CustomizedEmployeeKey(14,"raj","hr"),509000);
		 st.put(new CustomizedEmployeeKey(15,"rahul","sales"),520000);
		 st.put(new CustomizedEmployeeKey(13,"neha","hr"),506000);
		 
		 System.out.println(st);
		 
		 
		 
		 
		 
		 
		 
	}

}
