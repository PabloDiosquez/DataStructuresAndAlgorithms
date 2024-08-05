package org.example;

import java.util.LinkedList;

/**
 * A simple hash map implementation using separate chaining with linked lists.
 *
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public class HashMap<K, V> {

    /**
     * Represents a key-value pair entity.
     */
    private class Entry {
        private K key;
        private V value;

        /**
         * Constructs an Entry with the specified key and value.
         *
         * @param key the key of the entry
         * @param value the value of the entry
         */
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        /**
         * Returns the key of this entry.
         *
         * @return the key of this entry
         */
        public K getKey() {
            return key;
        }

        /**
         * Returns the value of this entry.
         *
         * @return the value of this entry
         */
        public V getValue() {
            return value;
        }

        /**
         * Sets the value of this entry.
         *
         * @param value the new value
         */
        public void setValue(V value) {
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int capacity;
    private int size;

    /**
     * Constructs an empty map with the specified initial capacity.
     *
     * @param capacity the initial capacity of the map
     */
    public HashMap(int capacity) {
        this.capacity = capacity;
        this.table = new LinkedList[capacity];
        this.size = 0;
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained a mapping for the key, the old value is replaced.
     *
     * @param key the key with which the specified value is to be associated
     * @param value the value to be associated with the specified key
     */
    public void put(K key, V value) {
        int hash = hash(key);
        LinkedList<Entry> bucket = table[hash];

        for (Entry entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new Entry(key, value));
        size++;
    }

    /**
     * Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or null if there is no mapping for the key
     */
    public V get(K key) {
        int hash = hash(key);
        LinkedList<Entry> bucket = table[hash];

        for (Entry entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    /**
     * Removes the mapping for the specified key from this map if present.
     *
     * @param key the key whose mapping is to be removed from the map
     */
    public void remove(K key) {
        int hash = hash(key);
        LinkedList<Entry> bucket = table[hash];

        for (Entry entry : bucket) {
            if (entry.getKey().equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
    public int size() {
        return size;
    }

    /**
     * Computes the hash code for the specified key.
     *
     * @param key the key for which the hash code is to be computed
     * @return the hash code for the specified key
     */
    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }
}

