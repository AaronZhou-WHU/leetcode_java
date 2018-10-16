package foroffer;

/**
 * @Author : zhoubin
 * @Description :
 * @Date : 18/10/16 21:33
 */
public class GetNumberOfK {
    private static int getFirstK(int[] data, int k, int start, int end)
    {
        if (start > end)
        {
            return -1;
        }

        int middIndex = (start + end) / 2;
        int middData = data[middIndex];

        if (middData == k)
        {
            if ((middIndex > 0 && data[middIndex - 1] != k) || middIndex == 0)
            {
                return middIndex;
            }
            else
            {
                end = middIndex - 1;
            }
        }
        else if (middData > k)
        {
            end = middIndex - 1;
        }
        else
        {
            start = middIndex + 1;
        }

        return getFirstK(data, k, start, end);
    }
    private static int getLastK(int[] data, int k, int start, int end)
    {
        if (start > end)
        {
            return -1;
        }

        int middIndex = (start + end) / 2;
        int middData = data[middIndex];

        if (middData == k)
        {
            if ((middIndex < data.length - 1 && data[middIndex + 1] != k) || middIndex == end)
            {
                return middIndex;
            }
            else
            {
                start = middIndex + 1;
            }
        }
        else if (middData > k)
        {
            end = middIndex - 1;
        }
        else
        {
            start = middIndex + 1;
        }

        return getLastK(data, k, start, end);
    }
    public static int GetNumberOfK(int[] data, int k)
    {
        int number = 0;
        if (data != null && data.length > 0)
        {
            int first = getFirstK(data, k, 0, data.length - 1);
            int last = getLastK(data, k, 0, data.length - 1);

            if (first > -1 && last > -1)
            {
                number = last - first + 1;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 3, 3, 3, 4, 5 };
        int actual = GetNumberOfK(data, 3);
        System.out.println(actual);
    }
}
