class Problem_1{
	public static int find_sum_of_all_multiples_of_multiple1_and_multiple2(int limit, int value1, int value2){
		int product_of_multiples = value1 * value2;
		int all_multiples_of_value1 = (limit-1)/value1;
		int all_multiples_of_value2 = (limit-1)/value2;
		int total_multiple_of_product_of_multiples = (limit-1)/product_of_multiples;
		int sum_of_multiple1 = (all_multiples_of_value1*(all_multiples_of_value1+1))/2;
		int sum_of_multiple2 = (all_multiples_of_value2*(all_multiples_of_value2+1))/2;
		int sum_of_product_of_multiples = (total_multiple_of_product_of_multiples*(total_multiple_of_product_of_multiples+1))/2;
		return ((value1 * sum_of_multiple1) + (value2 * sum_of_multiple2)) - (product_of_multiples * sum_of_product_of_multiples);
	}
	public static void main(String[] args) {
		System.out.println(find_sum_of_all_multiples_of_multiple1_and_multiple2(1000, 5, 3));
	}
}