package Array.SortingTechniques;

public class BubbleSort {
    // arrange in assending or decending order

    // 1st compare thand swap we swap like this that the biggest found in last

    public static void Sort(int arr[]){
        for(int i=0; i< arr.length-1; i++){
            for(int j = 0; j< arr.length-1-i; j++){
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={5 , 4 ,3  , 2 ,1 };

        Sort(arr);
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
