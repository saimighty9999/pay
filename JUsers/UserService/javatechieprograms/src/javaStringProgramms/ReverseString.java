package javaStringProgramms;

public class ReverseString {
	public static void main(String[] args) {

//		String s = "My style is my passion";
//		String rs = " ";
//
//		for (int i = s.length() - 1; i >= 0; i--) {
//			rs = rs + s.charAt(i);
//
//		}
//
//		System.out.println("orginal String" + s);
//		System.out.println("reverse String" + rs);
//		
		
		
		String s="I LOVE INDIA";
		
		String ss="";
		
		for(int i=s.length()-1;i>=0;i--) {
			ss=ss+s.charAt(i);
		}
		
		System.out.println(" "+ ss);
		
	}

}
