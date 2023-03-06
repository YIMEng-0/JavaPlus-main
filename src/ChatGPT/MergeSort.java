package ChatGPT;

import java.util.Arrays;

/**
 * @author Doraemon
 * @date 2023/3/5 17:25
 * @version 1.0
 */
public class MergeSort {

    /**
     * 归并排序
     * @param array 待排序的数组
     * @param left 排序范围的左端点（包含）
     * @param right 排序范围的右端点（不包含）
     */
    public static void mergeSort(int[] array, int left, int right) {
        // 初始数组的判断
        if (right - left <= 1) {
            return; 
        }

        // 把数组成为两个数组
        int mid = (left + right) / 2;
        System.out.println("mid is :" + mid);

        // 左边部分的递归，将左边的所有部分进行划分，直到把数组的所有元素全部都拆出来，形成一个个的单个元素
        mergeSort(array, left, mid);    // 对左半部分进行归并排序
        mergeSort(array, mid, right);   // 对右半部分进行归并排序

        // 分成一个个的长度为 1 的小数组之后进行数组的合并
        merge(array, left, mid, right); // 合并左右两个有序部分
    }

    /**
     * 合并两个有序数组
     * @param array 待合并的数组
     * @param left 左边有序数组的起始位置
     * @param mid 左边有序数组的结束位置，同时也是右边有序数组的起始位置
     * @param right 右边有序数组的结束位置
     */
    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left];  // 临时数组用来存储合并后的结果

        // i 代表数组的左端点 也就是 0
        // j 代表数组的右端点 也就是数组的长度
        // k 代表临时数组的索引
        int i = left, j = mid, k = 0;
        while (i < mid && j < right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i < mid) {
            temp[k++] = array[i++];
        }
        while (j < right) {
            temp[k++] = array[j++];
        }
        // 将临时数组中的结果拷贝回原数组
        System.arraycopy(temp, 0, array, left, temp.length);
    }

    // 测试用例
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 10, 12, 1, 5, 6};

        // 传递参数左右端点是 0 和数组的长度 右端点不是数组的索引
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 10, 12]
    }
}
