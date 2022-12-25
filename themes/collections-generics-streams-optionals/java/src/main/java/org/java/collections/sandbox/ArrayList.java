package org.java.collections.sandbox;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * Simple realisation of class {@link ArrayList}.
 *
 * @param <T> generic type parameter
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class ArrayList<T> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elements;

    private int size;

    /**
     * This constructor creates an instance of {@link ArrayList} with a default capacity of an array inside.
     * A default size of inner array is 5;
     */
    public ArrayList() {
        //throw new Exception(); // todo: implement this method
        this(DEFAULT_CAPACITY);
    }

    /**
     * This constructor creates an instance of {@link ArrayList} with a specific capacity of an array inside.
     *
     * @param initCapacity - the initial capacity of the list
     * @throws IllegalArgumentException – if the specified initial capacity is negative or 0.
     */
    public ArrayList(int initCapacity) {
        if (initCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        elements = new Object[initCapacity];
    }

    /**
     * Creates and returns an instance of {@link ArrayList} with provided elements
     *
     * @param elements to add
     * @return new instance
     */
    @SafeVarargs
    public static <T> ArrayList<T> of(T... elements) {
        var list = new ArrayList<T>();
        Stream.of(elements).forEach(list::add);
        return list;
    }

    /** Change size of list. */
    private void resize() {
        if (elements.length == size) {
            var newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    /**
     * Adds an element to the array.
     *
     * @param element element to add
     */
    public void add(T element) {
        resize();
        elements[size] = element;
        size++;
    }

    /**
     * Adds an element to the specific position in the array where
     *
     * @param index   index of position
     * @param element element to add
     */
    public void add(int index, T element) {
        Objects.checkIndex(index, size + 1);
        resize();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    /**
     * Retrieves an element by its position index. In case provided index in out of the list bounds it
     * throws {@link IndexOutOfBoundsException}
     *
     * @param index index of element
     * @return en element
     */
    @SuppressWarnings("unchecked")
    public T get(int index) {
        Objects.checkIndex(index, size);
        return  (T) elements[index];
    }

    /**
     * Returns the first element of the list. Operation is performed in constant time O(1)
     *
     * @return the first element of the list
     * @throws java.util.NoSuchElementException if list is empty
     */
    public T getFirst() {
        if (isEmpty())
            throw  new NoSuchElementException();

        return get(0);
    }

    /**
     * Returns the last element of the list. Operation is performed in constant time O(1)
     *
     * @return the last element of the list
     * @throws java.util.NoSuchElementException if list is empty
     */
    public T getLast() {
        if (isEmpty())
            throw  new NoSuchElementException();

        return get(size - 1);
    }

    /**
     * Changes the value of array at specific position. In case provided index in out of the list bounds it
     * throws {@link IndexOutOfBoundsException}
     *
     * @param index   position of value
     * @param element a new value
     */
    public void set(int index, T element) {
        Objects.checkIndex(index, size);
        elements[index] = element;
    }

    /**
     * Removes an elements by its position index. In case provided index in out of the list bounds it
     * throws {@link IndexOutOfBoundsException}
     *
     * @param index element index
     * @return deleted element
     */
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removed = (T) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return removed;
    }

    /**
     * Checks for existing of a specific element in the list.
     *
     * @param element is element
     * @return If element exists method returns true, otherwise it returns false
     */
    public boolean contains(T element) {
        for (var i = 0; i < size; i++)
            if (element.equals(elements[i]))
                return true;

        return false;
    }

    /**
     * Checks if a list is empty
     *
     * @return {@code true} if list is empty, {@code false} otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @return amount of saved elements
     */
    public int size() {
        return size;
    }

    /**
     * Removes all list elements
     */
    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }
}
