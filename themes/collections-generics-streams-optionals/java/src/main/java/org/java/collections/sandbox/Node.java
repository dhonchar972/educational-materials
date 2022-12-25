package org.java.collections.sandbox;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class Node<T> {
    Node<T> previous;
    T current;
    Node<T> next;

    Node(Node<T> previous, T current, Node<T> next) {
        this.previous = previous;
        this.current = current;
        this.next = next;
    }
}
