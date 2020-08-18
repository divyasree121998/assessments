
//space break of string
public class SplitWhitespace {
	 void brk(String str) {
		String[]arr=str.split(" ");
		for (String g : arr)
		{
		System.out.println(g);	
		}
		
	}
	

	 public static void main(String[] args) {
		SplitWhitespace s = new SplitWhitespace();
		s.brk("This Is Java Programming");
		
	}

}

