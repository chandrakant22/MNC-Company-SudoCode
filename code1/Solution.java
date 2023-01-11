import java.util.Scanner;
//Chandrakant sir ceo asterisc.in 7744822228 hello@asterisc.in
public class Code1 {
	
	 static int[] strToInt(String str)
	    {
	 
	        String[] splitArray = str.split(" ");
	        int[] array = new int[splitArray.length];
	
	        for (int i = 0; i < splitArray.length; i++) {
	            array[i] = Integer.parseInt(splitArray[i]);
	        }
	        return array;
	    }

	public static void main(String[] args) {

		int count=0;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter number of product");
		int np=Integer.parseInt(sc.nextLine());
		//System.out.println("Enter product Temperature");
		String ptemp=sc.nextLine();
		
		
		int pt[]=strToInt(ptemp);
		
		for(int i=0;i<pt.length;i++)
		{
			if(pt[i]<0)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		

	}

}
