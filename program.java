package com.sumit;

public class MainSolution {

	
	public static void main(String[] args) {

		
		//to print second largest
		
		int arr[] = {22,34,4,11,334,242,3,1};
		int a;
		int largest=0, sLargest=0;
		for(a=0;a<arr.length-1;a++){
			if(arr[a]>arr[a+1]){
				int temp =arr[a];
				largest=arr[a];
				if(arr[a+1]>sLargest){
					sLargest= arr[a+1];
				}
				arr[a]=arr[a+1];
				arr[a+1]=temp;
				
			}else{
				if(arr[a]>sLargest){
					sLargest= arr[a];
				}
			}
		}
		
		for(int c : arr){
		System.out.println("print array " + sLargest);
		}
		
		
		//to find length of array
		
		String str= "hello 0java !";
		int k=0;
		char[] strArr =str.toCharArray();
		for(char c: strArr)
		{
			k++;
		}
		
		System.out.println("value of k : "+k);
		
	}

}
