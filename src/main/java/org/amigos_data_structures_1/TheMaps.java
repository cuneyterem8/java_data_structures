package org.amigos_data_structures_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TheMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("alex"));
        map.put(2, new Person("alexa"));
        map.put(3, new Person("mariam"));
        map.put(3, new Person("mariam2"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        map.forEach((key, person) -> {
            System.out.println(key + " " + person);
        });
        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println(map.values());
        System.out.println();

        Map<Person2, Diamond> map2 = new HashMap<>();
        map2.put(new Person2("Jamila"), new Diamond("African diamond"));

        System.out.println(new Person2("Jamila").hashCode());
        System.out.println(new Person2("Jamila").hashCode());
        System.out.println(map2.get(new Person2("Jamila")));
    }

    record Person(String name){}

    record Diamond(String name){}

    static class Person2{
        String name;

        public Person2(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person2{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person2 person2 = (Person2) o;
            return Objects.equals(name, person2.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
