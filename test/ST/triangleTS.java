package ST;

 

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ST.triangle;

import static org.junit.Assert.*;




@RunWith(Parameterized.class)
public class triangleTS {
	private String type;
	private int a;
	private int b;
	private int c;
	
	public triangleTS(String type, int a, int b, int c){
		this.type = type;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Parameters
	public static Collection prepareData(){
		Object[][] object = {
				{"isoscele",1,1,1},
				{"equilateral",2,2,3},
				{"equilateral",2,3,3},
				{"scalene",2,3,4}};
		return Arrays.asList(object);
	}
	@Test
	public void TestTypeOfTriangle() 
	{
		triangle calc = new triangle (); 
		assertEquals (type, calc.triangle(a,b,c)); 
	}

}