package Easy;

public class RemoveElement_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(removeElement(new int[] {2}, 3));	
	}

	public static int removeElement(int[] nums, int val) {

		int i = 0;
		int j = nums.length - 1;
		int temp = 0;
		while (i <= j) {

			while (i <nums.length && nums[i] != val  )
				i++;

			while (j >=0&& nums[j] == val)
				j--;

			if (i < j) {
				// swap

				temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}

		}
		return i;
	}
}
