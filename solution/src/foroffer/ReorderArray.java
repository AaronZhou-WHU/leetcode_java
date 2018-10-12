package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/9/3 09:21
 */
public class ReorderArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        //reOrderArray(arr);
        reOrderArray2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
    public static void reOrderArray(int [] array) {
        if(null==array||array.length==0)
            return;
        for(int i=0;i<array.length-1;i++){
            int j=i+1;
            if(array[i]%2==0){
                while(j<array.length){
                    if(array[j]%2!=0){
                        int tmp = array[j];
                        array[j]=array[i];
                        array[i]=tmp;
                        break;
                    }else{
                        j++;
                    }
                }
            }
        }
    }
    public static void reOrderArray2(int [] array) {
//        for(int i=0;i<array.length;i++) {
//            for(int j=array.length-1;j>i;j--) {
//                if(array[j]%2==1&&array[j-1]%2==0) {//½»»»Î»ÖÃ
//                    int tmp=array[j];
//                    array[j]=array[j-1];
//                    array[j-1]=tmp;
//                }
//            }
//        }
        for(int i=0;i<array.length;i++){
            int j= array.length-1;
            while(j>i){
                if(array[j]%2!=0&&array[j-1]%2==0){
                    array[j]=array[j]^array[j-1];
                    array[j-1]=array[j]^array[j-1];
                    array[j]=array[j]^array[j-1];
                }
                j--;
            }
        }
    }
}
