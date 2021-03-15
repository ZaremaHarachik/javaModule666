package hw3.demo4;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1,"olga",20,Gender.female));
        users.add(new User(2,"nikolay",25,Gender.male));
        users.add(new User(3,"svitlana",22,Gender.female));
        users.add(new User(4,"oleg",45,Gender.male));
        users.add(new User(5,"ira",55,Gender.female));
        users.add(new User(6,"ivan",80,Gender.male));
        users.add(new User(7,"igor",35,Gender.male));
        users.add(new User(8,"victor",37,Gender.male));
        users.add(new User(9,"olena",66,Gender.female));
        users.add(new User(10,"alla",17,Gender.female));
        users.add(new User(11,"zara",34,Gender.female));

     for (User user:users) {
         if (user.getId() % 2 == 0) {
             System.out.println(user);
         }
     }

         for (User user:users){
             if  (user.getName().length() >5){
                 System.out.println(user);
             }
         }



        for (User user : users) {
            if (user.getPerson() == Gender.female){
                System.out.println(user);
            }
        }





    }
}
