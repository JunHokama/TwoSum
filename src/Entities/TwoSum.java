package Entities;
public class TwoSum {
	
public int [] twoSum(int []arr, int target) {
		
	for(int i = 0; i<arr.length;i++) {
		for(int j = 0; j<arr.length;j++) {
			if(arr[i] + arr[j] == target) {
				return new int[] {i,j};
			}
		}
	}
	return arr;}
}
