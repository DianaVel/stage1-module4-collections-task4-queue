package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque <Integer> res = new ArrayDeque<>();

        moveCards(firstQueue,res);
        moveCards(secondQueue,res);

        while (true){
            if(firstQueue.size() == 0) break;
            firstQueue.add(res.removeLast());
            moveCards(firstQueue,res);
            secondQueue.add(res.removeLast());
            moveCards(secondQueue,res);
        }
        return res;
    }

    private void moveCards (Queue<Integer> from, ArrayDeque<Integer> to){
        if(from.size()>=2) {
            to.addLast(from.remove());
            to.addLast(from.remove());
        }else {
            to.addLast(from.remove());
        }
    }
}
