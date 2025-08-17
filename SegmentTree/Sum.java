package SegmentTree;

public class Sum {
      static int tree[];

    public static void init(int n) {
        tree = new int[4 * n]; // Allocate enough space
    }

    public static int buildST(int arr[], int sti, int start, int end) {
        if (start == end) {
            tree[sti] = arr[start];
            return tree[sti];
        }

        int mid = (start + end) / 2;
        int leftSum = buildST(arr, 2 * sti + 1, start, mid);
        int rightSum = buildST(arr, 2 * sti + 2, mid + 1, end);
        tree[sti] = leftSum + rightSum;
        return tree[sti];
    }

    public static int getSumUnit(int i , int si , int sj , int qi , int qj){
        if (qj <=si || qi >= sj) { //non overlapping
            return 0;
        }else if (si >= qi && sj <= qj) { // complete overlap
            return tree[i];
        }else{
            // partial overlap
            int mid = (si+sj)/2;
            int left = getSumUnit(2*i+1, si, mid, qi, qj);
            int right = getSumUnit(2*i+2, mid+1, sj, qi, qj);
            return left+right;
        }
    }

    public static int getSum(int arr[] , int qi , int qj){
        int n = arr.length;
        return getSumUnit(0, 0, n-1, qi, qj);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;

        init(n);
        buildST(arr, 0, 0, n - 1);

        // for (int i = 0; i < tree.length; i++) {
        //     System.out.print(tree[i] + " ");
        // }

        System.out.println(getSum(arr, 2, 5));
    }
}
