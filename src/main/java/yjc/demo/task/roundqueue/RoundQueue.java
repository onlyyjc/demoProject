package yjc.demo.task.roundqueue;

import java.io.Serializable;
import java.util.NoSuchElementException;

/**
 * Created by yangjiachang on 2017/3/13.
 */
public class RoundQueue<T> implements Serializable {

    private static final long serialVersionUID = -873109114121357176L;

    private T[] queue;
    private int head = 0;
    private int tail = 0;
    private int realSize = 0;//实际容量

    //初始的大小为10
    @SuppressWarnings("unchecked")
    public RoundQueue(int size) {
        queue = (T[]) new Object[(size <= 0) ? 10 : size];
    }

    /**
     * 向尾部添加一个元素
     *
     * @param element
     */
    public void addLast(T element) {
        if (isFull()) {
            throw new QueueElementFullException();
        }
        tail = (head + realSize) % queue.length;
        queue[tail] = element;
        realSize++;

    }

    /**
     * 移出第一个元素
     *
     * @return int
     */
    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        T tempLog = queue[head];
        queue[head] = null;
        head = (head + 1) % queue.length;
        realSize--;

        return tempLog;
    }


    /**
     * 队列真实的数量
     *
     * @return int
     */
    public int realSize() {
        return realSize;
    }


    /**
     * 队列是否为空
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return realSize() == 0;
    }

    /**
     * 队列是否已满
     *
     * @return boolean
     */
    public boolean isFull() {
        return realSize() == queue.length;
    }

    /**
     * 清除保存的所有数据
     */
    public void clear() {
        while (!isEmpty()) {
            removeFirst();
        }
    }

    /**
     * 返回指定位置的值
     *
     * @param index
     * @return int
     */
    public T get(int index) {
        if (index < 0 || index >= realSize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + realSize);
        }

        return queue[index];
    }

    /**
     * 返回最末位置的值
     *
     */
    public T getLast() {
        return get(tail);
    }

    /**
     * 获取元素在队列中的索引,找到就返回其位置，找不到就返回-1
     * 如果key为null.则永远返回-1
     *
     * @param key 要查找的元素
     * @return int
     */
    public int indexOf(T key) {
        if (key == null) {
            return -1;
        } else {
            int index = 0;
            while (index <= realSize() - 1) {
                if (key.equals(queue[index])){
                    return index;
                }
                index++;
            }
        }

        return -1;
    }

}
