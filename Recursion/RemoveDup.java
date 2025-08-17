package Recursion;

public class RemoveDup {
    public static void Remove(String str ,int idx , StringBuilder newStr , boolean map[]){
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char CurrChar = str.charAt(idx);
        if (map[CurrChar - 'a'] == true) {
            // duplicate
            Remove(str, idx+1, newStr, map);
        }else{
            map[CurrChar - 'a'] = true;
            Remove(str, idx, newStr.append(CurrChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        Remove(str, 0, new StringBuilder(), new boolean[26]);
    }
}
