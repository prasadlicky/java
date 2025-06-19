package hlo;

public class str_methods {
	
		public static void main(String args[]){
			String str1="prasadlicky@gmail.com";
			System.out.println(str1.matches("@gmail"));
			System.out.println(str1.indexOf("@gmail"));
			System.out.println(str1.substring(0,11));
			
			int i = str1.indexOf("@");
			String username=str1.substring(0,i);
			String domain=str1.substring(i+1,str1.length());
			System.out.println("username: "+username);
			System.out.println("domain: "+domain);
			
					
			
}
}