package org.example;

/**
 * A simple hash map implementation using an array of entities.
 */
public class MapUsingHash {

    /**
     * Represents a key-value pair entity.
     */
    private class Entity {
        private String key;
        private String value;

        /**
         * Constructs an Entity with the specified key and value.
         *
         * @param key the key of the entity
         * @param value the value of the entity
         */
        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }

        /**
         * Returns the key of this entity.
         *
         * @return the key of this entity
         */
        public String getKey() {
            return key;
        }

        /**
         * Returns the value of this entity.
         *
         * @return the value of this entity
         */
        public String getValue() {
            return value;
        }
    }

    private Entity[] entities;

    /**
     * Constructs an empty map with a fixed size of 100.
     */
    public MapUsingHash() {
        this.entities = new Entity[100];
    }

    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained a mapping for the key, the old value is replaced.
     *
     * @param key the key with which the specified value is to be associated
     * @param value the value to be associated with the specified key
     */
    public void put(String key, String value) {
        int hash = hash(key);
        entities[hash] = new Entity(key, value);
    }

    /**
     * Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or null if there is no mapping for the key
     */
    public String get(String key) {
        int hash = hash(key);
        if (entities[hash] != null && entities[hash].getKey().equals(key)) {
            return entities[hash].getValue();
        }
        return null;
    }

    /**
     * Removes the mapping for the specified key from this map if present.
     *
     * @param key the key whose mapping is to be removed from the map
     */
    public void remove(String key) {
        int hash = hash(key);
        if (entities[hash] != null && entities[hash].getKey().equals(key)) {
            entities[hash] = null;
        } else {
            System.out.println("Key not found");
        }
    }

    /**
     * Computes the hash code for the specified key.
     *
     * @param key the key for which the hash code is to be computed
     * @return the hash code for the specified key
     */
    private int hash(String key) {
        return Math.abs(key.hashCode() % entities.length);
    }
}
