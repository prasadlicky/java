import java.util.*;
public class Variable_arguments_in_overloading {
	static void show(int...A){           //it is like infinite arguements  or parameters can be passed but of same type like int , we can use it for arrays also
		for(int x:A){  // for each loop
			System.out.println(x);
		}
	}

	public static void main(String[] args) {  //here for one arguement every method is printing but same integer
		show(100);
		show(12,3,4,5);
		show(new int[]{1,3,4,5});

	}

}
