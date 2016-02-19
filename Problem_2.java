class Problem_2{
	private int total;
	private int threshold;
	Problem_2(int threshold){
		this.threshold = threshold;
		this.total = 0;
	}

	private void addIt(int number){
		this.total += number;
	}

	private boolean isEven(int number){
		return number % 2 == 0;
	}

	private int get_total(){
		return this.total;
	}

	public int get_evens_till_threshold(){
		int first = 0;
		int second = 1;
		int sum = 0;
		while(true){
			sum = first + second;
			if(sum > this.threshold) return get_total();
			if(isEven(sum)) addIt(sum);
			first = second;
			second = sum;
		}
	}
	public static void main(String[] args) {
		Problem_2 fibonacci = new Problem_2(4000000);
		int evens = fibonacci.get_evens_till_threshold();
		System.out.println(evens);
	}
}