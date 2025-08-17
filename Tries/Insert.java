// package Ds.Tries;

public class Insert {
    // step -> 1 create a nodes arr for 26 alphabet a -> z
    public static class Node {
        Node children[] = new Node[26];
        boolean eow = false; // end of word

        public Node(){
            for(int i =0; i<26; i++){
                children[i] = null; // Inilitized with the null value
            }
        }
  }

        public static Node root = new Node(); // The root node is always empty
  
        public static void insert(String words){ 
            Node curr = root;
            for(int level = 0; level < words.length(); level++){ // TC = O(L)
                // for finding the current idx
                int idx = words.charAt(level) - 'a';
                if (curr.children[idx] == null) {
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx]; // it is the update childrent node 
            }
            curr.eow = true;
        
        }
    
    public static void main(String[] args) {
        String words[] ={"the " , "a" , "there" , "their" , "any" , "thee"};

        for(int i = 0; i< words.length; i++){
            // System.out.println();
            insert(words[i]);
        }
    }
}
