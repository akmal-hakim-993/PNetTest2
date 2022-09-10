import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculate {

	public static void main(String[] args) {
		
		int sum = 0;
		StringBuilder sumNumbers = new StringBuilder();
		List<Integer> inputs = new ArrayList<Integer>(Arrays.asList(3,2,5,6,8,0,7,7,4));
		
		System.out.println("INPUT:");

		for(int i=0; i < inputs.size(); i++) {

			System.out.println(inputs.get(i));
		}
		
		System.out.println("");
		System.out.println("OUTPUT:");
		for(int i=0; i < inputs.size(); i++) {
			
			sum = addNo(sum, inputs.get(i));
			sumNumbers = sumNumbers.append(inputs.get(i)+"+");
			if((i+1)%2==0) {
				System.out.println("Line #"+i+" "+sumNumbers+" = "+sum);
			}
			
		}
		
	}
	
	public static int addNo(int sum, int currentNo) {
		return sum + currentNo;
	}

}
