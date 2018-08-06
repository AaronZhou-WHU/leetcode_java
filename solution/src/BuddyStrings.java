/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/6 16:43
 */
public class BuddyStrings {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcd";
        System.out.println(buddyStrings(a, b));
    }

    public static boolean buddyStrings(String A, String B) {
        if (null == A || null == B || A.length() == 0 || B.length() == 0 || A.length() != B.length())
            return false;
        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();
        int diff = 0;
        int[] index = new int[2];
        for (int i = 0; i < charsA.length; i++) {
            if (charsA[i] != charsB[i]) {
                if (diff < 2) {
                    index[diff] = i;
                }
                diff++;
            }
            if (diff > 2) {
                return false;
            }
        }
        if (diff>2||diff==1){
            return false;
        }else if (diff==2){
            if (charsA[index[0]] == charsB[index[1]] && charsA[index[1]] == charsB[index[0]]) {
                return true;
            }
        }else if (diff==0){
            for (int i = 0; i < charsA.length; i++) {
                for (int j = i+1; j < charsB.length; j++) {
                    if (charsA[i]==charsB[j]){
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
}
