//package yjc.test.container.map;
//
//import java.util.Map;
//import java.util.Objects;
//
///**
// * Created by yangjiachang on 2016/10/18.
// */
//public class MyHashMap<K,V> {
//
//    //初始容量16
//    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
//    //最大容量
//    static final int MAXIMUM_CAPACITY = 1 << 30;
//    //默认负载因子
//    static final float DEFAULT_LOAD_FACTOR = 0.75f;
//
//    transient Node<K,V>[] table;
//
//
//    //定义key的hash值算法
//    static final int hash(Object key) {
//        int h;
//        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
//    }
//
//
//    public V put(K key, V value) {
//        return putVal(hash(key), key, value, false, true);
//    }
//
//    /**
//     * Implements Map.put and related methods
//     *
//     * @param hash hash for key
//     * @param key the key
//     * @param value the value to put
//     * @param onlyIfAbsent if true, don't change existing value
//     * @param evict if false, the table is in creation mode.
//     * @return previous value, or null if none
//     */
//    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
//                   boolean evict) {
//        Node<K,V>[] tab;
//        Node<K,V> p;
//        int n, i;
//        if ((tab = table) == null || (n = tab.length) == 0)
//            n = (tab = resize()).length;
//        if ((p = tab[i = (n - 1) & hash]) == null)
//            tab[i] = newNode(hash, key, value, null);
//        else {
//            Node<K,V> e; K k;
//            if (p.hash == hash &&
//                    ((k = p.key) == key || (key != null && key.equals(k))))
//                e = p;
//            else if (p instanceof TreeNode)
//                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
//            else {
//                for (int binCount = 0; ; ++binCount) {
//                    if ((e = p.next) == null) {
//                        p.next = newNode(hash, key, value, null);
//                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
//                            treeifyBin(tab, hash);
//                        break;
//                    }
//                    if (e.hash == hash &&
//                            ((k = e.key) == key || (key != null && key.equals(k))))
//                        break;
//                    p = e;
//                }
//            }
//            if (e != null) { // existing mapping for key
//                V oldValue = e.value;
//                if (!onlyIfAbsent || oldValue == null)
//                    e.value = value;
//                afterNodeAccess(e);
//                return oldValue;
//            }
//        }
//        ++modCount;
//        if (++size > threshold)
//            resize();
//        afterNodeInsertion(evict);
//        return null;
//    }
//
//
//    static class Node<K,V> implements Map.Entry<K,V> {
//        final int hash;
//        final K key;
//        V value;
//        Node<K,V> next;
//
//        Node(int hash, K key, V value, Node<K,V> next) {
//            this.hash = hash;
//            this.key = key;
//            this.value = value;
//            this.next = next;
//        }
//
//        public final K getKey()        { return key; }
//        public final V getValue()      { return value; }
//        public final String toString() { return key + "=" + value; }
//
//        public final int hashCode() {
//            return Objects.hashCode(key) ^ Objects.hashCode(value);
//        }
//
//        public final V setValue(V newValue) {
//            V oldValue = value;
//            value = newValue;
//            return oldValue;
//        }
//
//        public final boolean equals(Object o) {
//            if (o == this)
//                return true;
//            if (o instanceof Map.Entry) {
//                Map.Entry<?,?> e = (Map.Entry<?,?>)o;
//                if (Objects.equals(key, e.getKey()) &&
//                        Objects.equals(value, e.getValue()))
//                    return true;
//            }
//            return false;
//        }
//    }
//}
