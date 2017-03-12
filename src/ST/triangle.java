package ST;

public class triangle {

	public String triangle (int a, int b,int c)
	{
		String str;
		int d=a-b;
		int e=b-c;
		int f=a-c;
	    if( d*e*f==0){
			str="isoscele";
		    if( (a==b) && (b==c) )
		    	str="equilateral";
		}
		else
			str="scalene";
		return str;
		
	}

}