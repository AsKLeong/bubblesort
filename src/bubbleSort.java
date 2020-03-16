import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		int sort[]; 
		int i = 0;
		int j = 0;
		sort = new int[] {70,61,72,83,38};
		int n = sort.length;
		int x = 0;
		while (x <n) {		
		while (i < n-x-1) {
			if (sort[i] > sort[i + 1]) {
				j = sort[i];
				sort[i] = sort[i + 1];
				sort[i + 1] = j;
				i++;
			}
			
			x++;
		}
						
		
						
		
				
				
				

	}
 System.out.println(Arrays.toString(sort));
}
}
