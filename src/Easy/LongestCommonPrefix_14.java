package Easy;

public class LongestCommonPrefix_14 {
	public static void main(String[] args) {

		System.out.println(longestCommonPrefix(new String[] { }));
	}

	public static String longestCommonPrefix(String[] strs) {

		if (strs.length==0)
			return "";
		
		String longestCommonPrefix = strs[0];
		String sndWord;

		for (int i = 1; i < strs.length; i++) {
			sndWord = strs[i];

			int k = 0;
			while (k < longestCommonPrefix.length() && k < sndWord.length()
					&& longestCommonPrefix.charAt(k) == sndWord.charAt(k)) {

				k++;
			}

			longestCommonPrefix = longestCommonPrefix.substring(0, k);
		}

		return longestCommonPrefix;
	}
}
