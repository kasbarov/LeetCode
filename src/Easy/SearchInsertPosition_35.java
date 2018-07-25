package Easy;

public class SearchInsertPosition_35 {

	public static void main(String[] args) {

	}

	public static int searchInsert(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target || nums[i] > target)
				return i;

		}
		
		return nums.length;
	}
}
