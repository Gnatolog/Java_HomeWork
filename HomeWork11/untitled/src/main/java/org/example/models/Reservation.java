package org.example.models;

public class Reservation {

        private static int counter = 100;
        private final int id;
        private String date;
        private String name;

        public Reservation(String date, String name) {
            this.id = ++counter;
            this.date = date;
            this.name = name;
        }

        public int getId() {
            return this.id;
        }

        public String getDate() {
            return this.date;
        }

        public String getName() {
            return this.name;
        }


}
