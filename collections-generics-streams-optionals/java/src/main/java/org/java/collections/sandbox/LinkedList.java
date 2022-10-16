package org.java.collections.sandbox;

import java.util.*;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
class Node<T> {
    Node<T> previous;
    T current;
    Node<T> next;

    Node(Node<T> previous, T current, Node<T> next) {
        this.previous = previous;
        this.current = current;
        this.next = next;
    }
}

/**
 * {@link LinkedList} is a list implementation that is based on singly linked generic nodes.
 *
 * @param <T> generic type parameter
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class LinkedList<T> {
    transient int size = 0; // transient - non serializable

    /**Pointer to first node.*/
    transient Node<T> first;

    /**Pointer to last node.*/
    transient Node<T> last;

    /**Constructs an empty list.*/
    public LinkedList() {
    }

    /**
     * Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
     *
     * @param collection the collection whose elements are to be placed into this list
     * @throws NullPointerException – if the specified collection is null
     */
    public LinkedList(Collection<? extends T> collection) {
        this(); // call empty constructor
        addAll(collection);
    }

    /**
     * Returns the first element in this list.
     *
     * @return the first element in this list
     * @throws NoSuchElementException if this list is empty
     */
    public T getFirst() {
        final Node<T> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.current;
    }

    /**
     * Returns the last element in this list.
     *
     * @return the last element in this list
     * @throws NoSuchElementException if this list is empty
     */
    public T getLast() {
        final Node<T> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.current;
    }

    /**
     * Removes and returns the first element from this list.
     *
     * @return the first element from this list
     * @throws NoSuchElementException if this list is empty
     */
    public T removeFirst() {
        final Node<T> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return unlinkFirst(f);
    }

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element from this list
     * @throws NoSuchElementException if this list is empty
     */
    public T removeLast() {
        final Node<T> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return unlinkLast(l);
    }

    /**
     * Inserts the specified element at the beginning of this list.
     *
     * @param e the element to add
     */
    public void addFirst(T e) {
        linkFirst(e);
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * <p>This method is equivalent to {@link #add}.
     *
     * @param e the element to add
     */
    public void addLast(T e) {
        linkLast(e);
    }

    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * More formally, returns the lowest index {@code i} such that
     * {@code Objects.equals(o, get(i))},
     * or -1 if there is no such index.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     */
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<T> x = first; x != null; x = x.next) {
                if (x.current == null)
                    return index;
                index++;
            }
        } else {
            for (Node<T> x = first; x != null; x = x.next) {
                if (o.equals(x.current))
                    return index;
                index++;
            }
        }
        return -1;
    }

    /**
     * Returns {@code true} if this list contains the specified element.
     * More formally, returns {@code true} if and only if this list contains
     * at least one element {@code e} such that
     * {@code Objects.equals(o, e)}.
     *
     * @param o element whose presence in this list is to be tested
     * @return {@code true} if this list contains the specified element
     */
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    /**Returns the number of elements in this list.*/
    public int size() {
        return size;
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * <p>This method is equivalent to {@link #addLast}.
     *
     * @param e element to be appended to this list
     * @return {@code true} (as specified by {@link Collection#add})
     */
    public boolean add(T e) {
        linkLast(e);
        return true;
    }

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.  If this list does not contain the element, it is
     * unchanged.  More formally, removes the element with the lowest index
     * {@code i} such that
     * {@code Objects.equals(o, get(i))}
     * (if such an element exists).  Returns {@code true} if this list
     * contained the specified element (or equivalently, if this list
     * changed as a result of the call).
     *
     * @param o element to be removed from this list, if present
     * @return {@code true} if this list contained the specified element
     */
    public boolean remove(Object o) {
        if (o == null) {
            for (Node<T> x = first; x != null; x = x.next) {
                if (x.current == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<T> x = first; x != null; x = x.next) {
                if (o.equals(x.current)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Appends all the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator.  The behavior of this operation is undefined if
     * the specified collection is modified while the operation is in
     * progress.  (Note that this will occur if the specified collection is
     * this list, and it's nonempty.)
     *
     * @param c collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     */
    public boolean addAll(Collection<? extends T> c) {
        return addAll(size, c);
    }

    /**
     * Inserts all the elements in the specified collection into this
     * list, starting at the specified position.  Shifts the element
     * currently at that position (if any) and any subsequent elements to
     * the right (increases their indices).  The new elements will appear
     * in the list in the order that they are returned by the
     * specified collection's iterator.
     *
     * @param index index at which to insert the first element
     *              from the specified collection
     * @param c collection containing elements to be added to this list
     * @return {@code true} if this list changed as a result of the call
     * @throws IndexOutOfBoundsException {@inheritDoc}
     * @throws NullPointerException if the specified collection is null
     */
    public boolean addAll(int index, Collection<? extends T> c) {
        checkPositionIndex(index);

        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0)
            return false;

        Node<T> pred, succ;
        if (index == size) {
            succ = null;
            pred = last;
        } else {
            succ = node(index);
            pred = succ.previous;
        }

        for (Object o : a) {
            @SuppressWarnings("unchecked")
            T e = (T) o;
            Node<T> newNode = new Node<>(pred, e, null);
            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            pred = newNode;
        }

        if (succ == null) {
            last = pred;
        } else {
            pred.next = succ;
            succ.previous = pred;
        }

        size += numNew;
        return true;
    }

    /**
     * Removes all the elements from this list.
     * The list will be empty after this call returns.
     */
    public void clear() {
        for (Node<T> x = first; x != null; ) {
            Node<T> next = x.next;
            x.current = null;
            x.next = null;
            x.previous = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public T get(int index) {
        checkElementIndex(index);
        return node(index).current;
    }

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public T set(int index, T element) {
        checkElementIndex(index);
        Node<T> x = node(index);
        T oldVal = x.current;
        x.current = element;
        return oldVal;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public void add(int index, T element) {
        checkPositionIndex(index);

        if (index == size)
            linkLast(element);
        else
            linkBefore(element, node(index));
    }

    /**
     * Removes the element at the specified position in this list.  Shifts any
     * subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public T remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    /**Links said element as first.*/
    private void linkFirst(T element) {
        final Node<T> first = this.first;
        final Node<T> newNode = new Node<>(null, element, first);
        this.first = newNode;

        if (first == null)
            this.last = newNode;
        else
            first.previous = newNode;

        size++;
    }

    /**Links said element as last.*/
    private void linkLast(T element) {
        final Node<T> last = this.last;
        final Node<T> newNode = new Node<>(last, element, null);
        this.last = newNode;

        if (last == null)
            this.first = newNode;
        else
            last.next = newNode;

        size++;
    }

    /**
     * Inserts element e before non-null Node.
     */
    private void linkBefore(T e, Node<T> node) {
        final Node<T> element = node.previous;
        final Node<T> newNode = new Node<>(element, e, node);
        node.previous = newNode;
        if (element == null)
            first = newNode;
        else
            element.next = newNode;
        size++;
    }

    /**
     * Unlinks non-null first node f.
     */
    private T unlinkFirst(Node<T> f) {
        final T element = f.current;
        final Node<T> next = f.next;
        f.current = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.previous = null;
        size--;
        return element;
    }

    /**
     * Unlinks non-null last node l.
     */
    private T unlinkLast(Node<T> l) {
        // assert l == last && l != null;
        final T element = l.current;
        final Node<T> prev = l.previous;
        l.current = null;
        l.previous = null; // help GC
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;
        return element;
    }

    /**
     * Unlinks non-null node x.
     */
    private T unlink(Node<T> x) {
        final T element = x.current;
        final Node<T> next = x.next;
        final Node<T> prev = x.previous;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.previous = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.previous = prev;
            x.next = null;
        }

        x.current = null;
        size--;
        return element;
    }

    /**
     * Tells if the argument is the index of an existing element.
     */
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    /**
     * Tells if the argument is the index of a valid position for an
     * iterator or an add operation.
     */
    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    /**
     * Constructs an IndexOutOfBoundsException detail message.
     * Of the many possible refactorings of the error handling code,
     * this "outlining" performs best with both server and client VMs.
     */
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    /**
     * Returns the (non-null) Node at the specified element index.
     */
    private Node<T> node(int index) {
        Node<T> x;
        if (index < (size >> 1)) {
            x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
        } else {
            x = last;
            for (int i = size - 1; i > index; i--)
                x = x.previous;
        }
        return x;
    }
}
