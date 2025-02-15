package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue <String> res = new PriorityQueue<>(Comparator.reverseOrder());
        res.addAll(firstList);
        res.addAll(secondList);
        return res;
    }
}
