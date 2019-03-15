public class SumSquare{
  public static void main(String [] args){
   //Your program will generate an output of Sum of Squares of multiples of 3
    
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int multiplesOfThree= 3;
		int cumulationResult= 0;
		int result;
		
		while(multiplesOfThree <= 33) {
			result=(int) (Math.pow(multiplesOfThree, 2)); 
			
			cumulationResult= cumulationResult + result; 
			multiplesOfThree += 3 ;
			System.out.printf("Cumulation result: %-10d%-10c%-10d%-10c%-10d\n", cumulationResult, ':', multiplesOfThree, '*', multiplesOfThree );
		}
		
		System.out.print("The SUM of square multiples of 3 is " + cumulationResult);
		
			
		
	}

}
