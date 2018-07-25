package Easy;

public class ImplementStrStr_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(strStr("aaaaa", "bba"));
	}

	public static int strStr(String haystack, String needle) {

		if (needle.equals(""))
			return 0;

		for (int i = 0; i <= haystack.length() - needle.length(); i++) {

			int j=0;
			
			while (needle.charAt(j) == haystack.charAt(i+j)) {
				j++;
				
				if (j==needle.length())
					return i;
			}

		}

		return -1;
	}

}
