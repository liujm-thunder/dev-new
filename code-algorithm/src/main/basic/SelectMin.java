package main.basic;

public class SelectMin {


    /***
     * 犯了一个愚蠢的错误 在内循环中比较中 竟然使用a[j]与a[i]比较 太愚蠢了
     * 应该使用已经记录的a[min]与a[j]相比较大小啊！！！
     * @param a
     * @return
     */
    public static int[] sortBySelectMin(int[] a) {
        for (int i = 0; i < a.length; i++) {
            /***记录最小值索引**/
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            /****将最小值与第i个值交换位置***/
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
        return a;
    }



    public static void main(String[] args) {
        int[] array = {8,7,16,5,4,29,89,65};
        sortBySelectMin(array);
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }

}
