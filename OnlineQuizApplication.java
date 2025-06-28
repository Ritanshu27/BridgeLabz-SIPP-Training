package workshop;
import java.util.*;
public class OnlineQuizApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[5];
		int arr2[]= new int[5];
		int answer[] =  new int [5];
		System.out.println("Enter the questions");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextLine();
		}
		System.out.println("Enter the answers");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]= sc.nextInt();
		}
		//// User will answer questions now
		
		
		for(int i=0;i<arr.length;i++) {
			answer[i] = sc.nextInt();
			if(answer[i]==arr2[i]) {
				System.out.println("Correct");
			}
			else {
				System.out.println("Incorrect");
			}
			
		}

	}

}
