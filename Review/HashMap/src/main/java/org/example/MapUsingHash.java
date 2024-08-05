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
}
