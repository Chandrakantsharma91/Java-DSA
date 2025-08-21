package Array;

public class LinearSearch {
    public static int sort(int arr[] , int key){
        for(int i=0; i<arr.length; i++){
          if (arr[i] == key) {
            return i;
          }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={2 , 4, 5 ,4 , 9};
        int key = 5;
        
        int idx = sort(arr, key);
        if (idx == -1) {
            System.out.println("key not found");
        }else{
            System.out.println("key found at idx " + idx);
        }
    }
}
