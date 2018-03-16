package main.basic;

public class InsertMin {


    /***
     * 插入排序算法
     * @param a
     * @return
     */
    public static int[] sortedByInsertMin(int[] a) {
        if (a==null||a.length==1) return a;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && a[j - 1] > a[j]; j--) {
                int tmp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = tmp;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        int[] array = {11,2,38,6,92,40};
        sortedByInsertMin(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
