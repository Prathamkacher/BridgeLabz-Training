package com.collections.votingsystem;

public class VotingMain {

    public static void main(String[] args) {

        VoteManager vm = new VoteManager();

        vm.castVote("Vishal");
        vm.castVote("Aryaman");
        vm.castVote("Harsh");
        vm.castVote("Aryan");
        vm.castVote("Gaurav");

        vm.displayVoteOrder();
        System.out.println();
        vm.displaySortedResult();
    }
}
