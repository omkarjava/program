package enums;

public enum Colours {
	
   ORANGE("red","yellow")
   {
	   public String toString()
	   {
		   return "Orange forms by :Red+Yellow";
	   }
   },
   GREEN("blue","yellow")
   {
	   public String toString()
	   {
		  return " Orange forms by :Blue+Yellow";
	   }
   },
   PINK("red","white")
   {
	   public String toString()
	   {
		   return " Pink forms by :Red+White";
	   } 
   },
   BROWN("red","black")
   {
	   public String toString()
	   {
		   return " Brown forms by :Red+black";
	   }  
   },
   PURPLE("blue","pink")
   {
	   public String toString()
	   {
		   return " Purple forms by :blue+pink";
	   } 
   };
  
   
   
    String r;
	String y;
   private Colours(String r,String y)
   {
	   this.r=r;
	   this.y=y;
   }
   
}
