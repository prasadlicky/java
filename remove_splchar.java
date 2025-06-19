package hlo;

public class remove_splchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="qwdn %^&nf n& 5nm12     jd";
		System.out.println(str.matches("[a-z,0-9]+"));
        System.out.println(str);
        System.out.println(str.replaceAll("[^a-z,0-9]",("")));
        System.out.println(str.replaceAll("[' ']",("")));
	    System.out.println(str.replaceAll("\\s+","").trim()); 
	   
	    String str1=" als asd fkc fkd ghg";
	    String words[]=str1.split("\\s");
	    System.out.println(words.length);
	}

}
