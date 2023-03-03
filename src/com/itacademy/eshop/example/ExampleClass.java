package com.itacademy.eshop.example;

public class ExampleClass {

    public class Person {
        private String name;
        private int age;
        private Nationality nationality;
        private Address address;

        public Person() {
            this.name = "Unknown";
            this.age = 0;
            this.nationality = Nationality.UNKNOWN;
            this.address = new Address();
        }

        public Person(String name, int age, Nationality nationality, Address address) {
            this.name = name;
            this.age = age;
            this.nationality = nationality;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Nationality getNationality() {
            return nationality;
        }

        public void setNationality(Nationality nationality) {
            this.nationality = nationality;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }
    }

    /**
     * This enum represents different nationalities that a Person object can have.
     * It contains constants for common nationalities, such as American and Canadian,
     * as well as a default UNKNOWN value for cases where a person's nationality is not known.
     */
    public enum Nationality {
        AMERICAN,
        CANADIAN,
        UNKNOWN
    }

    public class Address {
        private String street;
        private String city;
        private String state;
        private String zip;

        /**
         * Default constructor that initializes the Address object with default values for all fields.
         */
        public Address() {
            this.street = "Unknown";
            this.city = "Unknown";
            this.state = "Unknown";
            this.zip = "Unknown";
        }

        /**
         * Parameterized constructor that initializes the Address object with the given values for all fields.
         *
         * @param street The street address.
         * @param city The city.
         * @param state The state.
         * @param zip The ZIP code.
         */
        public Address(String street, String city, String state, String zip) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zip = zip;
        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String getZip() {
            return zip;
        }

    }

    public class Main {
        public void main(String[] args) {
            // Scenario 1: Using the default constructor
            Person person1 = new Person();
            System.out.println(person1.getName()); // "Unknown"
            System.out.println(person1.getAge()); // 0
            System.out.println(person1.getNationality()); // Nationality.UNKNOWN
            System.out.println(person1.getAddress().getStreet()); // "Unknown"
            System.out.println(person1.getAddress().getCity()); // "Unknown"
            System.out.println(person1.getAddress().getState()); // "Unknown"
            System.out.println(person1.getAddress().getZip()); // "Unknown"

            // Scenario 2: Using the parameterized constructor
            Address address = new Address("123 Main St", "Anytown", "CA", "12345");
            Person person2 = new Person("Alice", 25, Nationality.AMERICAN, address);
            System.out.println(person2.getName()); // "Alice"
            System.out.println(person2.getAge()); // 25
            System.out.println(person2.getNationality()); // Nationality.AMERICAN
            System.out.println(person2.getAddress().getStreet()); // "123 Main St"

            // Scenario 3: Using setters to set the name and age
            Person person3 = new Person();
            person3.setName("Bob");
            person3.setAge(30);
            person3.setNationality(Nationality.CANADIAN);
            person3.setAddress(new Address("456 Elm St", "Othertown", "NY", "67890`"));
        }
    }
}