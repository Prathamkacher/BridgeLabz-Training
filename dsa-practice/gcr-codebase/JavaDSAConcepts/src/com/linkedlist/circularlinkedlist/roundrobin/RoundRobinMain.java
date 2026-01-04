package com.linkedlist.circularlinkedlist.roundrobin;

public class RoundRobinMain {

    public static void main(String[] args) {

        RoundRobinScheduler rr = new RoundRobinScheduler(2);

        rr.addProcess(1, 5, 1);
        rr.addProcess(2, 3, 2);
        rr.addProcess(3, 4, 1);

        rr.simulate();
    }
}
