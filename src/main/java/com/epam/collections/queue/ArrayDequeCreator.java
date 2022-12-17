package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    ArrayDeque<Integer> result = new ArrayDeque<>();

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        addTwoCards(firstQueue);
        addTwoCards(secondQueue);
        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            takeTopAddTwo(firstQueue);
            takeTopAddTwo(secondQueue);
        }
        return result;
    }

    public void addTwoCards(Queue<Integer> queue){
        for (int i = 0; i<2; i++){
            Integer cur = queue.poll();
            if (cur != null) {
                result.add(cur);
            }
        }
    }

    public void takeTopAddTwo(Queue<Integer> queue){
        Integer elem = result.pollLast();
        queue.add(elem);
        addTwoCards(queue);
    }


}
