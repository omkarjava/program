        package classesandobject;

        public class Car {
        void WheelNo()
		{ 
        	System.out.println("4 wheels");
		}
        void dashboard()
        {
        	System.out.println("Compulsary for each car");
        }
        void engineCapacity()
        {
        	System.out.println("Average engine capacity: 1200cc");
        }
        void milage()
        { 
        	System.out.println("milage:20km/ltr");
        } 
	
		public static void main(String[] args) {
			Car C1=new Car();
			C1.WheelNo();
			C1.dashboard();
		    C1.engineCapacity();
		    C1.milage();
		    
		}
		
		
}
