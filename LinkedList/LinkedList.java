package LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add First
    public void addFirst(int data){
        // step1 -> create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) { // if ll is empty so head and tail point the same address or node
            head = tail = newNode;
            return;
        }

        // step2 -> newNode next = head
        newNode.next = head; // linking step

        // step3  -> head = newNode
        head = newNode;
    }

    // Add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add in Middle
    public void add(int data , int idx){
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        
        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i= 0; temp = prev
        newNode.next = temp.next;
        temp.next = newNode;
    }



    // Print Data
    public void print(){ // O(n)
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public  int removeFirst(){

        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    } 

    // Remove Last
    public int removeLast(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1) { // if ll size is 1
            int val = head.data;
            head = tail = null;
            return val;
        }
        //  prev : i = size -2
        Node prev = head;
        for(int i = 0; i< size-2; i++){
            prev =prev.next;
        }
        
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Iterative search
    public int IterativeSearch(int key){
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public int helper(Node head , int key){ // O(n)
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx+1;
    }
    //  Recursive Search
    public int recSearch(int key){
        return helper(head , key);
    }

    // Reverse LL
    public void reverse(){
        Node prev = null;
        Node curr = tail  = head; // When we revrse hail became tail and tail became head
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Delete Nth from end
    public void deleteNthfromEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // remove First
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // Check Ll is pallindrome or not
    // Slow - Fast Approach
    public Node findMid(Node head){ //helper fn
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; //+2
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalli(){
        if (head == null || head.next == null) { // in this case ll is alread pallindrome
            return true;
        }
        // step1 -> find mid
        Node midNode = findMid(head);

        // step2 -> reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head; // left half head

        // step3 -> check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle(){  // It is also known as Floyd's cycle finding aldorithum
        Node slow = head ; 
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

            if (slow == fast) {
                return true; // cycle exist
            }
        }
        return false; // cycle doesn't exist
    }


    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // Find meeting point
        slow = head; 
        Node prev = null;
        while (slow != fast) { // last Node
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null

        prev.next = null;
    }
    public static void main(String[] args) {
        LinkedList ll  = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.add(9, 2);
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));
        // ll.print();
        // ll.deleteNthfromEnd(3);
        // ll.reverse();
        // ll.print();
        // System.out.println(ll.checkPalli());

        // for cycle detecting code

        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        // System.out.println(isCycle());
    }
}
