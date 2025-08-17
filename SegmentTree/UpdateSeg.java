package SegmentTree;

public class UpdateSeg {
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

    public static void updateUtil(int i , int si , int sj , int idx , int diff){// O(logn)
        if (idx > sj ||idx < si) {
            return;
        }

        tree[i]+= diff;
        if (si != sj) { // non leaf
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, diff);
            updateUtil(2*i+2, mid+1, sj, idx, diff);
        }
    }

    public static void update(int arr[] , int idx , int newVal){
        int n = arr.length;
        int diff = newVal - arr[idx];
        arr[idx] = newVal;

        updateUtil(0, 0, n-1, idx, diff); // Segment tree
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;

        init(n);
        buildST(arr, 0, 0, n - 1);

        // for (int i = 0; i < tree.length; i++) {
        //     System.out.print(tree[i] + " ");
        // }

        update(arr, 2, 2);
    }
}
