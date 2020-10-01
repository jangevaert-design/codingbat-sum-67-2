public class Sum67_2 {
  public int sum67(int[] nums) {
    int result = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 10 != 6) {
        result += nums[i];
      } else {
        while (nums[i] != 7) {
          i++;
        }
      }
    }

    return result;
  }
}
