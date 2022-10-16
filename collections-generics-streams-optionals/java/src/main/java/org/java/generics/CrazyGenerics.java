package org.java.generics;

import lombok.Data;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * @author Dmytro Honchar <dmytro.honchar972@gmail.com>
 * Date: 10/16/2022
 */
public class CrazyGenerics {
    /**
     * {@link Converter} interface declares a typical contract of a converter. It works with two independent generic types.
     * It defines a convert method which accepts one parameter of one type and returns a converted result of another type.
     *
     * @param <T> – source object type
     * @param <R> - converted result type
     */
    public interface Converter {
        // todo: introduce type parameters
        // todo: add convert method
    }

    /**
     * {@link StrictProcessor} defines a contract of a processor that can process only objects that are {@link Serializable}
     * and {@link Comparable}.
     *
     * @param <T> – the type of objects that can be processed
     */
    interface StrictProcessor {
        // todo: make it generic
        void process(Object obj);
    }

    /**
     * {@link CollectionRepository} defines a contract of a runtime store for entities based on any {@link Collection}.
     * It has methods that allow to save new entity, and get whole collection.
     *
     * @param <T> – a type of the entity that should be a subclass of {@link BaseEntity}
     * @param <C> – a type of any collection
     */
    interface CollectionRepository {
        // todo: update interface according to the javadoc
        void save(Object entity);

        Collection<Object> getEntityCollection();
    }

    /**
     * {@link ListRepository} extends {@link CollectionRepository} but specifies the underlying collection as
     * {@link java.util.List}.
     *
     * @param <T> – a type of the entity that should be a subclass of {@link BaseEntity}
     */
    interface ListRepository {
        // todo: update interface according to the javadoc
    }

    /**
     * {@link ComparableCollection} is a {@link Collection} that can be compared by size. It extends a {@link Collection}
     * interface and {@link Comparable} interface, and provides a default implementation of a compareTo method that
     * compares collections sizes.
     * <p>
     * Please note that size does not depend on the elements type, so it is allowed to compare collections of different
     * element types.
     *
     * @param <E> a type of collection elements
     */
    interface ComparableCollection {
        // todo: refactor it to make generic and provide a default impl of compareTo
    }

    /**
     * {@link Sourced} is a container class that allows storing any object along with the source of that data.
     * The value type can be specified by a type parameter "T".
     *
     * @param <T> – value type
     */
    @Data
    public static class Sourced {
        // todo: refactor class to introduce type parameter and make value generic
        private Object value;
        private String source;
    }

    /**
     * {@link Limited} is a container class that allows storing an actual value along with possible min and max values.
     * It is special form of triple. All three values have a generic type that should be a subclass of {@link Number}.
     *
     * @param <T> – actual, min and max type
     */
    @Data
    public static class Limited {
        // todo: refactor class to introduce type param bounded by number and make fields generic numbers
        private final Object actual;
        private final Object min;
        private final Object max;
    }

    /**
     * {@link MaxHolder} is a container class that keeps track of the maximum value only. It works with comparable objects
     * and allows you to put new values. Every time you put a value, it is stored only if the new value is greater
     * than the current max.
     *
     * @param <T> – value type
     */
    public static class MaxHolder {
        // todo: refactor class to make it generic
        private Object max;

        public MaxHolder(Object max) {
            this.max = max;
        }

        /**
         * Puts a new value to the holder. A new value is stored to the max, only if it is greater than current max value.
         *
         * @param val a new value
         */
        public void put(Object val) {

        }

        public Object getMax() {
            return max;
        }
    }

    /**
     * {@link CollectionUtil} is an util class that provides various generic helper methods.
     */
    static class CollectionUtil {
        static final Comparator<BaseEntity> CREATED_ON_COMPARATOR = Comparator.comparing(BaseEntity::getCreatedOn);

        /**
         * An util method that allows to print a dashed list of elements
         *
         * @param list
         */
        public static void print(List<Integer> list) {
            // todo: refactor it so the list of any type can be printed, not only integers
            list.forEach(element -> System.out.println(" – " + element));
        }

        /**
         * Util method that check if provided collection has new entities. An entity is any object
         * that extends {@link BaseEntity}. A new entity is an entity that does not have an id assigned.
         * (In other word, which id value equals null).
         *
         * @param entities provided collection of entities
         * @return true if at least one of the elements has null id
         */
        public static boolean hasNewEntities(Collection<BaseEntity> entities) {
            return true;
        }

        /**
         * Util method that checks if a provided collection of entities is valid. An entity is any subclass of
         * a {@link BaseEntity} A validation criteria can be different for different cases, so it is passed
         * as second parameter.
         *
         * @param entities            provided collection of entities
         * @param validationPredicate criteria for validation
         * @return true if all entities fit validation criteria
         */
        public static boolean isValidCollection() {
            return true;
        }

        /**
         * hasDuplicates is a generic util method checks if a list of entities contains target entity more than once.
         * In other words, it checks if target entity has duplicates in the provided list. A duplicate is an entity that
         * has the same UUID.
         *
         * @param entities     given list of entities
         * @param targetEntity a target entity
         * @param <T>          entity type
         * @return true if entities list contains target entity more than once
         */
        public static boolean hasDuplicates() {
            return true;
        }

        /**
         * findMax is a generic util method that accepts an {@link Iterable} and {@link Comparator} and returns an
         * optional object, that has maximum "value" based on the given comparator.
         *
         * @param elements   provided iterable of elements
         * @param comparator an object that will be used to compare elements
         * @param <T> type of elements
         * @return optional max value
         */
        // todo: create a method and implement its logic manually without using util method from JDK

        /**
         * findMostRecentlyCreatedEntity is a generic util method that accepts a collection of entities and returns the
         * one that is the most recently created. If collection is empty,
         * it throws {@link java.util.NoSuchElementException}.
         * <p>
         * This method reuses findMax method and passes entities along with prepare comparator instance,
         * that is stored as constant CREATED_ON_COMPARATOR.
         *
         * @param entities provided collection of entities
         * @param <T> entity type
         * @return an entity from the given collection that has the max createdOn value
         */
        // todo: create a method according to JavaDoc and implement it using previous method

        /**
         * An util method that allows to swap two elements of any list. It changes the list so the element with the index
         * i will be located on index j, and the element with index j, will be located on the index i.
         * Please note that in order to make it convenient and simple, it DOES NOT declare any type parameter.
         *
         * @param elements a list of any given type
         * @param i index of the element to swap
         * @param j index of the other element to swap
         */
        public static void swap(List<?> elements, int i, int j) {
            Objects.checkIndex(i, elements.size());
            Objects.checkIndex(j, elements.size());
        }

    }
}