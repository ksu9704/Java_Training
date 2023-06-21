package JavaStudy.Coures2.part1.Array;

public class IntArrayBasic {
    public static void main(String[] args) {
        // 종수 5개를 배열에 저장하고 출력하세요.
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        // num.length : 길이를구하는 동작
        for (int i=0; i<nums.length; i++){
            int data = nums[i]; // 데이터를 얻는동작(가져오는동작)
            System.out.println(data);
        }

        // 향상된 for문(foreach)
        for (int data : nums){
            System.out.println(data);

        }
    }
}
