/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/8/16 09:16
 */
public class K_SimilarStrings {
    public static void main(String[] args) {
        String A = "abccaacceecdeea", B = "bcaacceeccdeaae";
        System.out.println(kSimilarity(A,B));
    }

    public static int kSimilarity(String A, String B) {
        int count = 0;
        if (null == A || null == B || A.length() == 0 || B.length() == 0) {
            return count;
        }
        char[] charsa = A.toCharArray();
        char[] charsb = B.toCharArray();
        for (int i = 0; i < charsb.length; i++) {
            for (int j = i; j < charsa.length; j++) {
                if (charsa[j] == charsb[i]) {
                    if (i != j) {
                        char tmp = charsa[j];
                        charsa[j] = charsa[i];
                        charsa[i] = tmp;
                        count++;
                    }
                    break;
                }
            }
        }
        return count;
    }
}
