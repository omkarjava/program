package WrapperClasses;

public class CharacterClassExample {

	public static void main(String[] args) {
	 
		
		  System.out.println(Character.toUpperCase('h'));
		  System.out.println(Character.isDigit('3'));
		
          System.out.println(Character.isUpperCase('S'));
          System.out.println(Character.isLowerCase('h'));
          System.out.println(Character.isWhitespace('\t'));
          System.out.println(Character.isLetter('h'));
          
          System.out.println(Character.compare('d', 'a'));
          
          System.out.println(Character.MAX_CODE_POINT); 
          System.out.println(Character.MIN_RADIX);
          System.out.println(Character.BYTES);
          System.out.println(Character.SIZE);
          System.out.println(Character.MIN_VALUE);
          System.out.println(Character.valueOf('l'));
          System.out.println(Character.charCount(56512));
          System.out.println(Character.FORMAT);
          System.out.println(Character.isIdentifierIgnorable(5));
	}

}
