package string;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer ("Java");
		sb.append("Language");
        System.out.println(sb);
        
        String s=new String("lan");
        s.concat("guage");	
        
        System.out.println(s);		
        
//        sb.reverse();
//        System.out.println(sb);
//        
        System.out.println(sb.capacity());//16+
        System.out.println(sb.length());
        
        sb.replace(5, 8, "Lang");
        System.out.println(sb);
        
        sb.delete(5, 8);
        System.out.println(sb);
        
        sb.deleteCharAt(5);
        System.out.println(sb);
        
        System.out.println(sb.indexOf("h"));
        
        sb.insert(5, "lang");
        System.out.println(sb);
        
        sb.insert(6, 2.4f);
        System.out.println(sb);
        
        
        sb.setCharAt(2, 's');
        System.out.println(sb);
	}

}
