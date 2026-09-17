import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
public class Demo {

public static void main(String[]args){
	int[] numbers = new int[]{2,7,10};
	int target=9;

	System.out.println(Arrays.toString(TwoSum(numbers,target)));
	System.out.println(Arrays.toString(TwoSumHashing(numbers,target)));
	System.out.println( DuplicateDitection(new int[]{1,2,2,3,4,5}));
	}

public static int[] TwoSum(int[]array,int target){
	for(int i=0;i<array.length;i++){
		for(int j=i+1;i<array.length;j++){
			if(target==array[i]+array[j]){
			
				System.out.println("First="+array[i]+"And"+"Second"+array[j]);
				return new int[]{array[i],array[j]};

			}
			

		}

	}
	return new int[]{};

}

/*
Create an Hashset for seen





*/

public static int[] TwoSumHashing(int[]array,int target){
	Map<Integer,Integer>seen = new HashMap<>();
	
	for(int i=0;i<array.length;i++){
		int difference = target-array[i];
		if(seen.containsKey(difference)){
			System.out.println("Condition Matched");
			return new int[] {seen.get(difference),i};

		}
		seen.put(array[i],i);

	}
	return new int[]{};

}

public static boolean DuplicateDitection(int[] array){

	Set<Integer>seen = new HashSet<>();
	
	for(int i=0;i<array.length;i++){
	    if(!seen.add(array[i])){
		return true;
	
		}
	
	
	}
return false;
}


}