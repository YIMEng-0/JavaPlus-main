package 设计模式.原型模式;

/**
 * @author Doraemon
 * @date 2022/5/7 5:13 下午
 * @version 1.0
 */
public class BlackColor extends Color {
    public BlackColor() {
        this.colorName = "black";
    }

    @Override
    void doSomething() {
        System.out.println("black color do Something");
    }

    // 实现冒泡排序
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // 循环次数 也就是所有数据排序结束之后需要冒泡的次数， 5 个数据，需要
            for (int j = 0; j < arr.length - 1 - i; j++) { // 前面 i 个元素已经有序 所以不需要再比较
                if (arr[j] > arr[j + 1]) { // 大的往后面排 也就是实现了大的泡泡向上面浮动，这就是冒泡排序的效果
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 实现插入排序
    public void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    // 插入排序的优化版本
    public void insertSort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            if (j != i) {
                arr[j] = temp;
            }
        }
    }

    // binary search tree
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
