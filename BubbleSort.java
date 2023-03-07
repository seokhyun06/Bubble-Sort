import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int i,j,temp;
		int arr[] = {2,3,1,4,5}; // 배열방 설정
		for(i = 1; i < arr.length; i++) {
			for(j = 1; j < arr.length; j++) {
				if(arr[j] < arr[j - 1]) { 
					temp = arr[j - 1]; // 오른쪽 값을 temp에다 임시 저장
					arr[j - 1] = arr[j]; // 오른쪽 값을 왼쪽 값에다 저장
					arr[j] = temp;	// temp를 왼쪽 값에다 저장
				}
				System.out.println(Arrays.toString(arr)); //
			}
		}
		
	}

}
