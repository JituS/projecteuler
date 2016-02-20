import java.util.Arrays;

class Problem_5{

	public static int common_eleminator(int number,int[] factors){
		for(int j = 0;j < factors.length;j++){
			if(factors[j] != 0 && number % factors[j] == 0){
				number = factors[j];
			}
		}
		return number;
	}

	public static int find_number_divided_by_one_to(int divided_till){
		int[] factors = new int[divided_till];
		int counter = 0;
		int factor = 1;
		for (int i = 1;i <= divided_till ;i++ ) {
			if(factor%i!=0){
				int number = common_eleminator(i,factors);
				factor*=number;
				factors[counter] = number;
				counter++;
			}
		}
		return factor;
	}
	public static void main(String[] args) {
		System.out.println(find_number_divided_by_one_to(20));
	}
}