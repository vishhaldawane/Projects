
public class SmoothTest {

	public static void main ( String[] args )  
	{
		double[] inArray  = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
		
		// write out the input
	    for (int j = 0; j < inArray.length; j++)
	    {
	    	System.out.print(inArray[j]+ " ");
	    }
	    System.out.println();
	    
		int h=1;
		double[] outArray = Smooth.smooth(inArray, h);
   
		// write out the smooth array
	    for (int j = 0; j < outArray.length; j++)
	    {
	    	System.out.print(outArray[j] + " ");
	    }
     }
}

class Smooth
{
	public static double[] smooth(double []inArray, int h) {
			
		int inArrayLength = inArray.length;
		double[] outArray = new double[inArrayLength];
	   
	    outArray[0]  =  (inArray[0] + inArray[1])/2;
	    outArray[inArrayLength-1] = (inArray[inArrayLength-2] + inArray[inArrayLength-1])/2;
	    		
	    for (int i = 1; i < inArrayLength - 1; i++)
	    {
	    	outArray[i] = (inArray[i-h] + inArray[i] + inArray[i+h])/3;
	    }
	      
	    return outArray;
	  }
	
}
