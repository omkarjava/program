   package febPaper;

   public class Question1 {
	static void overloadedMethod(float f)
	{
	System.out.println("float var args ");
	}
	static void overloadedMethod(Double D)
	{
	System.out.println("Double Wrapper Class Type");
	}
	static void overloadedMethod(Long L)
	{
	System.out.println("Long Wrapper Class Type");
	}

	public static void main(String[] args) {
		int i = 21;
		overloadedMethod(i);

	}

}
