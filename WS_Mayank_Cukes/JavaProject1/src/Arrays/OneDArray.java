package Arrays;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int i , sumE=0, sumO=0 , ele=0, min, j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Elements");
		for(i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
     /*System.out.println("Array's element are :");
     for(i=0;i<5;i++){
			System.out.println(arr[i]);
		}
     for(int r:arr)
    	 System.out.println(r);*/
		
		 /*for(i=0;i<5;i++){
				if (arr[i]%2==0){
					sumE= sumE +arr[i];
					
				}
				else
				{
					sumO= sumO +arr[i];
					
				}
			}
		 System.out.println("Sum of even number :"+sumE);
		 System.out.println("Sum of odd number :"+sumO);*/
		
		/*System.out.println("enter element to be searched");
		ele= sc.nextInt();
		for(i=0;i<arr.length;i++){
			if(arr[i]==ele){
				System.out.println("The element is present");
				break;
			}
			}
			if(i==arr.length){
				System.out.println("The element is not present");
			}*/
		/*min=arr[0];
		for(i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
			
		}
		System.out.println("Minimum value available in Array is :"+min);*/
		
		for(i=0,j=arr.length-1;i<arr.length/2;i++,j--){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println("Reverse array");
		for (int r:arr){
			System.out.println(r);
		}
	}

}
