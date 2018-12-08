package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/12/8 17:29
 */
public class IsContinuous {
    public boolean isContinuous(int [] numbers) {
        if (null!=numbers&&numbers.length==5){
            for (int i = 0; i < numbers.length-1; i++) {
                for (int j = i+1; j < 5; j++) {
                    if (numbers[j]<numbers[i]){
                        int tmp = numbers[j];
                        numbers[i] = numbers[j];
                        numbers[j] = tmp;
                    }
                }
            }

            return true;
        }
        return false;

    }
    public boolean isContinous(int[] arr){
        if(arr == null || arr.length!= 5)
            return false;
        int countOf0 = (arr[0] == 0?1:0);
        int dis=0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] == 0)
                countOf0++;
            int t = arr[i];
            int j = 0;
            for(j = i-1;j>=0;j--){
                if(t!=0 && t==arr[j])  //ÅÐ¶ÏÊý×Ö²»ÖØ¸´
                    return false;
                else
                if(t>arr[j])
                    break;
                else
                    arr[j+1] = arr[j];
            }
            arr[j+1] = t;
        }
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] != 0)
                dis+= arr[i+1]-arr[i]-1;
        }
        if(dis <= countOf0)
            return true;
        else
            return false;
    }
}
