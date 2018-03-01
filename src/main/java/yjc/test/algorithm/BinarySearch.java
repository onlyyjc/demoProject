package yjc.test.algorithm;

/**
 * 二分查找，折半查找
 * Created by yangjiachang on 2018/3/1.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int srcArray[] = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};
        System.out.println("递归实现"+binSearch(srcArray, 0, srcArray.length - 1, 81));
        System.out.println("循环实现"+binSearch(srcArray, 81));
    }

    /**
     * 二分查找递归实现
     * @param srcArray  有序数组
     * @param start     起始下标
     * @param end       终止下标
     * @param key       待查询的值
     * @return          查询成功返回下标，否则返回-1
     */
    public static int binSearch(int srcArray[], int start, int end, int key) {
        /** 位运算效率高 */
        /** 不用 （start+end）/2 是避免溢出 */
        int mid = ((end - start) >> 1) + start;
        if (srcArray[mid] == key) {
            return mid;
        }
        if (start >= end) {
            return -1;
        } else if (key > srcArray[mid]) {
            return binSearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binSearch(srcArray, start, mid - 1, key);
        }
        return -1;
    }

    /**
     * 二分查找循环实现
     * @param srcArray  有序数组
     * @param key       待查询的值
     * @return          查询成功返回下标，否则返回-1
     */
    public static int binSearch(int srcArray[], int key) {
        int mid = srcArray.length / 2;
        if (key == srcArray[mid]) {
            return mid;
        }

        int start = 0;
        int end = srcArray.length - 1;
        while (start <= end) {
            mid = ((end - start) >> 1) + start;
            if (key < srcArray[mid]) {
                end = mid - 1;
            } else if (key > srcArray[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
