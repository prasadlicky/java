package hlo;

public class hii{
	

public static void main(String[] arge) {
StringBuilder sb= new StringBuilder(5);
sb.append ("HOwDY");
System.out.println(sb.length());
sb.insert(0,' ');
System.out.println(sb.length());
sb.replace(3, 5,"LL");
System.out.println(sb.length());
sb.insert(6, "COW");
System.out.println(sb.length());
sb.delete(2, 7);
System.out.println(sb.length());
}}