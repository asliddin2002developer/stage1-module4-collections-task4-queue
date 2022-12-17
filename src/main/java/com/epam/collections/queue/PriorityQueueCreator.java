package com.epam.collections.queue;

import java.util.*;


public class PriorityQueueCreator {

    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> pQueue = new PriorityQueue<>(11, new StringComparator());
        List<String> mergedList = new ArrayList<>();
        mergedList.addAll(firstList);
        mergedList.addAll(secondList);
        pQueue.addAll(mergedList);

        return pQueue;
    }


}

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.compareTo(o2) < 0){
            return 1;
        }else if (o1.compareTo(o2) > 0){
            return -1;
        }
        return 0;
    }
}

