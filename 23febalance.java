
// Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


// canBalance([1, 1, 1, 2, 1]) → true
// canBalance([2, 1, 1, 2, 1]) → false
// canBalance([10, 10]) → true
public boolean canBalance(int[] nums) {

  int total = 0;

  for (int i = 0; i < nums.length; i++) {
    total += nums[i];
  }

  int left = 0;

  for (int i = 0; i < nums.length; i++) {

    left += nums[i];

    int right = total - left;

    if (left == right) {
      return true;
    }
  }

  return false;
}