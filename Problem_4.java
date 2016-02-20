import java.util.Arrays;

class Problem_4{
	private int digit;

	public Problem_4(int digit){
		this.digit = digit;
	}

	private boolean isPalindrome(int number){
		int reverse = 0, copy = number;
		while(copy != 0){
			reverse *= 10;
			reverse += copy % 10;
			copy /= 10;
		}
		return number == reverse;
	}

	private int find_second_factors(int max, int divide_with){
		int remainder = max % divide_with;
		if(remainder == 0) return max/divide_with;
		return 0;
	}

	private boolean isValid(int first_factor,int second_factor, int max_limit, int min_limit){
		return ((second_factor <= max_limit && second_factor >= min_limit) && (first_factor <= max_limit && first_factor >= min_limit));
	}

	public int[] find_palindrom(){
		String maximum = "9";
		String minimum = "1";
		for(int i  = 0;i < this.digit-1;i++){
			maximum+="9";
			minimum+="0";
		};
		int max_limit = Integer.parseInt(maximum);
		int min_limit = Integer.parseInt(minimum);

		int maximum_possible_number = max_limit * max_limit;
		while(true){
			int first_factor = max_limit;
			if(isPalindrome(maximum_possible_number)){
				while(first_factor > min_limit){
					int second_factor = find_second_factors(maximum_possible_number, first_factor);
					if(isValid(first_factor,second_factor, max_limit, min_limit)){
						return new int[]{first_factor, second_factor};
					}
					first_factor--;
				}
			};
			maximum_possible_number--;
		}
	};

	public static void main(String[] args) {
		Problem_4 palindrom1 = new Problem_4(3);
		System.out.println(Arrays.toString(palindrom1.find_palindrom()));
	}
}