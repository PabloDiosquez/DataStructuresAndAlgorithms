package org.example;

import javax.swing.text.html.parser.Entity;

public class MapUsingHash {

    private class Entity{
        private String key;
        private String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
    private Entity[] entities;

    public MapUsingHash() {
        this.entities = new Entity[100];
    }

    public void put(String key, String value){
        int hash = hash(key);
        entities[hash] = new Entity(key, value);
    }

    public String get(String key){
        int hash = hash(key);
        if(entities[hash] != null && entities[hash].getKey().equals(key)){
            return entities[hash].getValue();
        }
        return null;
    }

    public void remove(String key){
        int hash = hash(key);
        if(entities[hash] != null && entities[hash].getKey().equals(key)){
            entities[hash] = null;
        }
        System.out.println("key not found");
    }

    private int hash(String key){
        return Math.abs(key.hashCode() % entities.length);
    }
}
