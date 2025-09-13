package app;
//import javax.swing.*;

public class main{
	
	
	public double calculateAverageOfThree(int x, int y, int z) {
		x+=y+z;
		return x/3;
		
		
	}
	
	public int getFactorial(int x){
		if(x>0 && x!=1) {
			return x * getFactorial(x-1);
		}
		return 1;
		
	}
	
}