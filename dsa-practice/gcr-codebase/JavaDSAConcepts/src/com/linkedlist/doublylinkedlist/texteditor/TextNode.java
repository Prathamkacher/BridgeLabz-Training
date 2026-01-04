package com.linkedlist.doublylinkedlist.texteditor;

public class TextNode {
    String content;
    TextNode next;
    TextNode prev;

    TextNode(String content) {
        this.content = content;
        this.next = null;
        this.prev = null;
    }
}
