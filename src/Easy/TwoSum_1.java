package Easy;

public class TwoSum_1 {

	public int[] twoSum(int[] nums, int target) {
		//
		// int[] result = new int[2];
		// Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// for (int i = 0; i < nums.length; i++) {
		// if (map.containsKey(target - nums[i])) {
		// result[1] = i + 1;
		// result[0] = map.get(target - nums[i]);
		// return result;
		// }
		// map.put(nums[i], i + 1);
		// }
		// return result;
		//
		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					break;
					// return result;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
