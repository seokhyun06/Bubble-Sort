import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int i,j,temp;
		int arr[] = {2,3,1,4,5}; // �迭�� ����
		for(i = 1; i < arr.length; i++) {
			for(j = 1; j < arr.length; j++) {
				if(arr[j] < arr[j - 1]) { 
					temp = arr[j - 1]; // ������ ���� temp���� �ӽ� ����
					arr[j - 1] = arr[j]; // ������ ���� ���� ������ ����
					arr[j] = temp;	// temp�� ���� ������ ����
				}
				System.out.println(Arrays.toString(arr)); //
			}
		}
		
	}

}
