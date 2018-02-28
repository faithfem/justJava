package arrays;

public class App {

	public App() {
		
	}

	public static void main(String[] args) {
		int[] nums = new int[5]; //5 is size of array
		
		//random index
		for(int i=1; i<nums.length; i++)
			nums[i] = 4*i;
		int num = nums[2];
		System.out.println(num);
		
		//linear search 
		for(int i=0; i<nums.length; i++)
			if(nums[i] == 4)
		System.out.println("index found, " + i);

	}

}
