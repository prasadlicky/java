package hlo;

public class constructor {

	public static void main(String[] args) {
		String str1="licky";         //it is stored in pool
		System.out.println(str1);
		
		String str2=new String("prasad"); // it is stored in heap
		System.out.println(str2);
		
		char c[]={'h','i','i'};  //only single ''
		String str3=new String(c);
		System.out.println(str3);
		
		String str4=new String(c,1,2); //1 for starting 2 for no of to be printed
		System.out.println(str4);
		
		byte b[]={65,66,67,68};
		String str5=new String(b);
		System.out.println(str5);
		
		String str6=new String(b,1,2);
		System.out.println(str6);
		
		String str7="licky";            //same pool
		System.out.println(str1==str7);
		
		String str8="Licky"; 
		System.out.println(str1==str8);  //new pool
		
		String str9=new String("licky");
		System.out.println(str1==str9);   //heap
		
		String str10="   hello";
		
		System.out.println(str10.length());
		System.out.println(str10.toUpperCase());
		System.out.println(str10.trim());     //remove spaces
		System.out.println(str10.substring(3));
		System.out.println(str10.substring(3,8));
		System.out.println(str10.replace("l","kf"));
		
		System.out.println(str10.startsWith("he"));
		System.out.println(str10.startsWith(" "));
		System.out.println(str10.endsWith("o"));
		System.out.println("char  " +str10.charAt( 6));
		System.out.println(str10.indexOf("l"));
		System.out.println(str10.indexOf("?")); //not found
		System.out.println(str10.indexOf("l",3));//staring point of searching for the elemnt in a string
		System.out.println(str10.indexOf("l",6));
		System.out.println(str10.indexOf("l",7));
		
		for (int i=0; i<str10.length();i++){
			System.out.println(str10.charAt(i));
			
			
		}
		String str11="hello";
		String str12="hello";
		System.out.println(str11.equals(str12));
		
		String str13="HELLO";
		System.out.println(str12.equalsIgnoreCase(str13));
		
		System.out.println(str11.equals(str13));
		
		System.out.println(str11==str12);
		
		
		String str14="prasad licky ";
		String str15="is a good boy";
		System.out.println(str14.contains("lickz"));
		System.out.println(str14.concat(str15));
		
		
		
		
		System.out.println(str14.matches(".")); //. only rep single letter and it can be anything num ,letter, sym
		
		String str16="p";	
		System.out.println(str16.matches("."));
		String str17="p8";
		System.out.println(str17.matches("[a-z][0-9]"));
		
		
		String str18="abcd";
		System.out.println(str18.matches("abc"));
		
		String str19="abc";
		System.out.println(str19.matches("abcd"));
		
		String str20="abc";
		System.out.println(str20.matches("abc"));
		
	}

}
