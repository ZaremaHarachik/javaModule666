package hw5;



import hw3.demo4.Gender;
import hw3.demo4.User;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

      ArrayList<Person>persons = new ArrayList<>();

        persons.add(new Person(1,"olga",20, Sex.FEMALE));
        persons.add(new Person(2,"nikolay",25,Sex.MALE));
        persons.add(new Person(3,"svitlana",22,Sex.FEMALE));
        persons.add(new Person(4,"oleg",45,Sex.MALE));
        persons.add(new Person(5,"ira",55,Sex.FEMALE));
        persons.add(new Person(6,"ivan",80,Sex.MALE));
        persons.add(new Person(7,"igor",35,Sex.MALE));
        persons.add(new Person(8,"victor",37,Sex.MALE));
        persons.add(new Person(9,"olena",66,Sex.FEMALE));
        persons.add(new Person(10,"alla",17,Sex.FEMALE));
        persons.add(new Person(11,"zara",34,Sex.FEMALE));


        Test test = new Test() {
            @Override
            public void testMethod() {
            }
        };

     Test test1 = () -> {
     };

     persons.forEach(System.out::println);
        System.out.println("----------------");
        persons.stream().filter(person -> person.getId() % 2 == 0).forEach(System.out::println);
        System.out.println("----------------");
        persons.stream().filter(person -> person.getName().length() >5).forEach(System.out::println);
        System.out.println("----------------");
        persons.stream().filter(person -> person.getGender() == Sex.FEMALE).forEach(System.out::println);





    }
}
