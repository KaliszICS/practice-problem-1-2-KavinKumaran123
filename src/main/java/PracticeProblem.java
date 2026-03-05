public class PracticeProblem {

	public static boolean validIndex(int arr[], int a) {
		try 
		{
			int b = arr[a];
			return true;
		}
		catch(ArrayIndexOutOfBoundsException e){
			return false;
		}

	}
	public static int divide(int a, int b){
		try {
			int c = a/b;
			return c;
		}
		catch(ArithmeticException e){
			return 0;
		}
	}
	public static int safeConvertStringtoInt(String a){
		try {
			int b = Integer.parseInt(a);
			return b;
		}
		catch(NumberFormatException e){
			return 0;
		}
	}

	

}
