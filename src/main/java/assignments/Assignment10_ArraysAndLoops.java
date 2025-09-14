package assignments;

public class Assignment10_ArraysAndLoops {
	
	
//	Given values are 12,34,11,36,87,98,93.
//	Store the values in Array and Print second and third largest number from the above values without
//	using collections and default sort methods 
	
	
		
	public static int result1(int k) {
		
	int temp, size;
    int array[] = {12,34,11,36,87,98,93};
    size = array.length;

    for(int i = 0; i<size; i++ ){
       for(int j = i+1; j<size; j++){

          if(array[i]>array[j]){
             temp = array[i];
             array[i] = array[j];
             array[j] = temp;
          }
       }
    }
    return array[size - k];
	}
	
	public static void main(String[] args) {
    System.out.println(" second largest number is:: "+ Assignment10_ArraysAndLoops.result1(2));
    System.out.println(" second largest number is:: "+ Assignment10_ArraysAndLoops.result1(3));

		
		
 }
}
