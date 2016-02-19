class Problem_4{
	public static boolean isPalindrome(int number){
		int reverse = 0, copy = number;
		while(copy != 0){
			reverse *= 10;
			reverse += copy % 10;
			copy /= 10;
		}
		return number == reverse;
	}

	public static int find_second_factors(int max, int divide_with){
		int remainder = max % divide_with;
		if(remainder == 0) return max/divide_with;
		return 0;
	}

	public static boolean isValid(int first_factor,int second_factor){
		return ((second_factor < 1000 && second_factor > 99) && (first_factor < 1000 && first_factor > 99));
	}

	public static int[] find_palindrom(){
		int max = 999 * 999;
		while(true){
			int first_factor = 999;
			if(isPalindrome(max)){
				while(first_factor > 100){
					int second_factor = find_second_factors(max, first_factor);
					if(isValid(first_factor,second_factor)){
						return new int[]{first_factor, second_factor};
					}
					first_factor--;
				}
			};
			max--;
		}
	};

	public static void main(String[] args) {
		int[] a = find_palindrom();
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
}