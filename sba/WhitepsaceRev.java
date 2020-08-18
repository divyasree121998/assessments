
public class WhitepsaceRev {
//reverse string
		public void StrBreakRev(String str) {
			
    String[] arr = str.split(" ");
			
			for(int i=0;i<=arr.length-1;i++)
			{
				for(int j=arr[i].length()-1;j>=0;j--)	{
					System.out.print(arr[i].charAt(j) +"");
				}
				System.out.println();
			}								
		}
	
	
	
	public static void main(String[] args) {
		
		WhitepsaceRev s = new WhitepsaceRev();
		
		
		s.StrBreakRev("This Is Java Programming");
		
		
		
	}

}

