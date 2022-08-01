package enumAssignment;

public enum Seasons {
	
	SPRING,SUMMER,AUTUMN;
	
    int a=10;
   public void main()
   {
	 System.out.println(a); 
   }
   
   
   private Seasons (){};
  
   private Seasons(int a)
   {
	   this.a=a;
   }
}
