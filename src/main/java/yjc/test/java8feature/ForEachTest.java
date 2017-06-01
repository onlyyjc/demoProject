package yjc.test.java8feature;


import java.util.*;


public class ForEachTest {
    public static void main(String[] args) {
        /** list */
        //ArrayList in Arrays.forEach(Consumer<? super E> action)
        Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));

        //ArrayList.forEach(Consumer<? super E> action)
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.forEach(e -> System.out.println(e));
        Spliterator s = list.spliterator();
        System.out.println(s);

        /** HashSet */
        //HashSet.forEach(Consumer<? super T> action)
        Set set = new HashSet<>(list);
        set.forEach(e -> System.out.println(e));

        /**  Stack / Vector */
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        //Vector.forEach(Consumer<? super E> action)
        stack.forEach(e -> System.out.println(e));

        /**  map */
        Map<String,String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        //KeySet in HashMap.forEach(Consumer<? super K> action)
        map.keySet().forEach(e -> System.out.println(e));

        //EntrySet in HashMap.forEach(Consumer<? super Map.Entry<K,V>> action)
        map.entrySet().forEach(e -> {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        });

        //Values in HashMap.forEach(Consumer<? super V> action)
        map.values().forEach(e -> System.out.println(e));

        //HashMap.forEach(BiConsumer<? super K, ? super V> action)
        map.forEach((k, y) -> {
            System.out.println(k);
            System.out.println(y);
        });
    }
}
