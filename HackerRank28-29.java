import java.util.*;
import java.io.*;

public class Day28 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet();
		
		Scanner scan = new Scanner(System.in);
		int inputs = scan.nextInt();
		scan.nextLine();
		
		while(inputs-->0){
			String firstname = scan.next();
			String email = scan.next();
			if(firstname.matches("[a-z]*")&& firstname.length()<21 && email.contains("@gmail.com") && email.length()<51){
				treeSet.add(firstname+","+email);
			}			
		}		
		 
		 for(String c : treeSet){
			 System.out.println(c.split(",")[0]);
		 }
		 
		 Iterator iterator = treeSet.iterator();
		 System.out.println("Tree set data in ascending order: ");     

		 while (iterator.hasNext()){
		   System.out.println(iterator.next() + " ");
		   }
		   
		   
	}
}



public class Day29 {
	  public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  
		  int T = scan.nextInt();
		
		  
		  while(T-->0){
			int N = scan.nextInt();
			int K = scan.nextInt();
			int[] arr = new int[N];

			for(int i =1; i<=N; i++){
				arr[i-1]=i;
			}

			int max = 0;

			for(int y=0; y<arr.length; y++){
				for(int k=y+1; k<arr.length; k++ ){
					int A=arr[y];
					int B=arr[k];

					int tmp = A & B;
					if(tmp < K && max < tmp){
					max = tmp;	
					}
				}
			}
			System.out.println(max);
		  }
	  }

}