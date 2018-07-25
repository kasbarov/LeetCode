package Easy;

public class ReverseInteger_7 {

	public static int reverse(int x) {

		long result = 0;

		
			while (x != 0) {
				result = x % 10 + (result * 10);
			//	System.out.println("result: " + result);
				x = x / 10;
			//	System.out.println("x: " + x);
			}

			return (int) ((result > Integer.MAX_VALUE)  || (result < Integer.MIN_VALUE) ? 0 : result);
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(964632435 * 10);
		 //System.out.println(reverse(-2147483648));
		System.out.println(reverse(1232));
	}

}
