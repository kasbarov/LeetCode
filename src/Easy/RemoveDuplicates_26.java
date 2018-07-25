package Easy;

public class RemoveDuplicates_26 {

	public static void main(String[] args) {

		System.out.println(removeDuplicates(new int[] { 1, 2 }));
	}

	public static int removeDuplicates(int[] nums) {

		int j = 0;
		int temp = 0;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] != nums[j]) {
				j++;

				// swap
				temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;

			}
		}
		return j+1;
	}
}
