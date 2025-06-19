package hlo;

public class quantifiers 
{
	public static void main(String args[]){
		String str1="prasad#icky@gmail.com";
		System.out.println(str1.matches(".*@gmail.*"));
		// . means anything and * means any number of times
		System.out.println(str1.matches("\\w*@gmail.*"));
		//befor @gamil only letters and numbers allowed no spl char
		System.out.println(str1.matches("\\w*@gmail.*"));
		
	}

}
