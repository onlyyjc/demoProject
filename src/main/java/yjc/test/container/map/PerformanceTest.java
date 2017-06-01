package yjc.test.container.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 结果分析：
 这里暂时不对key - value的复杂度、离散程度已经冲突进行测试，仅以简单的数字字符为主测试。
 hashmap:
 1.遍历key - value的时候，通常情况下，使用entrySet遍历比keySet更好，因为keySet要先拿到key，后查出value。
 2.遍历key的时候，通常情况下，使用keySet遍历比entrySet更好，毕竟entrySet除了包含key之外还有value，需要更多的资源。
 3.遍历value的时候，通常情况下，使用values最方便，其次entrySet。
 4.遍历的方式推荐使用foreach循环，理由有二：1.性能稍好一些；2.代码简洁。
 5.数据量越大，这种性能差异越明显。

 treemap:
 使用treemap测试，结论与hashmap一致，由于其查询特性决定，上述结论更加明显。

 */
public class PerformanceTest {


    public static void main(String[] args) {
        test(50000);
        test(100000);
        test(1000000);
    }

    private static void test(int n) {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println(n+"条数据量测试：");
        System.out.println();
        Map<String,String> map = new TreeMap();
        for (int i = 0 ; i < n ; i++){
            map.put(i+"aa",i+"ss");
        }
        System.out.println("1.遍历key - value");
        keySetForeach(map);
        keySetIterator(map);
        entryForeach(map);
        entryIterator(map);
        System.out.println();
        System.out.println("2.遍历key");
        keySetKeyForeach(map);
        keySetKeyIterator(map);
        entryKeyForeach(map);
        entryKeyIterator(map);
        System.out.println();
        System.out.println("3.遍历value");
        keySetValueForeach(map);
        keySetValueIterator(map);
        entryValueForeach(map);
        entryValueIterator(map);
        valuesForeach(map);
        valuesIterator(map);
    }

    private static void valuesIterator(Map<String, String> map) {
        /** values   iterator遍历 */
        long start = System.currentTimeMillis();
        Iterator it = map.values().iterator();
        while (it.hasNext()){
            String value = (String)it.next();
        }
        long end = System.currentTimeMillis();
        System.out.println("values   iterator遍历耗时：" + (end - start) + "ms");
    }

    private static void valuesForeach(Map<String, String> map) {
        /** values foreach遍历 */
        long start = System.currentTimeMillis();
        for (String value : map.values()){
        }
        long end = System.currentTimeMillis();
        System.out.println("values   foreach遍历耗时："+(end-start)+"ms");
    }

    private static void entryIterator(Map<String, String> map) {
        /** Map.Entry<K, V>   iterator遍历 */
        long start = System.currentTimeMillis();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = (Map.Entry<String,String>)it.next();
            String key = entry.getKey();
            String value = entry.getValue();
        }
        long end = System.currentTimeMillis();
        System.out.println("Map.Entry<K, V>   iterator遍历耗时："+(end-start)+"ms");
    }

    private static void entryForeach(Map<String, String> map) {
        /** Map.Entry<K, V>   foreach遍历 */
        long start = System.currentTimeMillis();
        for (Map.Entry<String,String> entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
        }
        long end = System.currentTimeMillis();
        System.out.println("Map.Entry<K, V>   foreach遍历耗时：" + (end - start) + "ms");
    }

    private static void keySetIterator(Map<String, String> map) {
        /** keySet   iterator遍历 */
        long start = System.currentTimeMillis();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            String key = (String)it.next();
            String value = map.get(key);
        }
        long end = System.currentTimeMillis();
        System.out.println("keySet   iterator遍历耗时："+(end-start)+"ms");
    }

    private static void keySetForeach(Map<String, String> map) {
        /** keyset foreach遍历 */
        long start = System.currentTimeMillis();
        for (String key : map.keySet()){
            String value = map.get(key);
        }
        long end = System.currentTimeMillis();
        System.out.println("keyset   foreach遍历耗时："+(end-start)+"ms");
    }

    private static void entryKeyIterator(Map<String, String> map) {
        /** Map.Entry<K, V>   iterator遍历 */
        long start = System.currentTimeMillis();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = (Map.Entry<String,String>)it.next();
            String key = entry.getKey();
        }
        long end = System.currentTimeMillis();
        System.out.println("Map.Entry<K, V>   iterator遍历耗时："+(end-start)+"ms");
    }

    private static void entryKeyForeach(Map<String, String> map) {
        /** Map.Entry<K, V>   foreach遍历 */
        long start = System.currentTimeMillis();
        for (Map.Entry<String,String> entry : map.entrySet()){
            String key = entry.getKey();
        }
        long end = System.currentTimeMillis();
        System.out.println("Map.Entry<K, V>   foreach遍历耗时："+(end-start)+"ms");
    }

    private static void keySetKeyIterator(Map<String, String> map) {
        /** keySet   iterator遍历 */
        long start = System.currentTimeMillis();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            String key = (String)it.next();
        }
        long end = System.currentTimeMillis();
        System.out.println("keySet   iterator遍历耗时："+(end-start)+"ms");
    }

    private static void keySetKeyForeach(Map<String, String> map) {
        /** keyset foreach遍历 */
        long start = System.currentTimeMillis();
        for (String key : map.keySet()){
        }
        long end = System.currentTimeMillis();
        System.out.println("keyset   foreach遍历耗时："+(end-start)+"ms");
    }

    private static void entryValueIterator(Map<String, String> map) {
        /** Map.Entry<K, V>   iterator遍历 */
        long start = System.currentTimeMillis();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = (Map.Entry<String,String>)it.next();
            String value = entry.getValue();
        }
        long end = System.currentTimeMillis();
        System.out.println("Map.Entry<K, V>   iterator遍历耗时："+(end-start)+"ms");
    }

    private static void entryValueForeach(Map<String, String> map) {
        /** Map.Entry<K, V>   foreach遍历 */
        long start = System.currentTimeMillis();
        for (Map.Entry<String,String> entry : map.entrySet()){
            String value = entry.getValue();
        }
        long end = System.currentTimeMillis();
        System.out.println("Map.Entry<K, V>   foreach遍历耗时：" + (end - start) + "ms");
    }

    private static void keySetValueIterator(Map<String, String> map) {
        /** keySet   iterator遍历 */
        long start = System.currentTimeMillis();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            String key = (String)it.next();
            String value = map.get(key);
        }
        long end = System.currentTimeMillis();
        System.out.println("keySet   iterator遍历耗时："+(end-start)+"ms");
    }

    private static void keySetValueForeach(Map<String, String> map) {
        /** keyset foreach遍历 */
        long start = System.currentTimeMillis();
        for (String key : map.keySet()){
            String value = map.get(key);
        }
        long end = System.currentTimeMillis();
        System.out.println("keyset   foreach遍历耗时："+(end-start)+"ms");
    }



}
