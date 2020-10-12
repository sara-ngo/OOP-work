package person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PersonTest {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        
        list.add(new Person("Joe", "Smith", 40));
        list.add(new Person("Amy", "Gold", 32));
        list.add(new Person("Tony", "Stork", 21));
        list.add(new Person("Sean", "Irish", 24));
        list.add(new Person("Tina", "Brock", 28));
        list.add(new Person("Lenny", "Hep", 18));

        System.out.println("First Name Ascending: ");
        sort(list, "first name", true);
        System.out.println("\nFirst Name Descending: ");
        sort(list, "first name", false);
        System.out.println("\nLast Name Length Ascending: ");
        sort(list, "last name", true);
        System.out.println("\nLast Name Length Descending: ");
        sort(list, "last name", false);
        System.out.println("\nAge Ascending: ");
        sort(list, "age", true);
        System.out.println("\nAge Descending: ");
        sort(list, "age", false);

        
    }

    public static void sort(ArrayList<Person> list, String attribute, boolean ascending) {
    list.sort(new Comparator<Person>(){
        @Override
        public int compare(Person o1, Person o2) {
            int sortValue = 0;
                switch(attribute.toUpperCase()){
                    case "FIRST NAME":
                        sortValue = o1.getFirstName().compareTo(o2.getFirstName());
                        break;
                    case "LAST NAME":
                        sortValue = Integer.compare(o1.getLastNameLength(), o2.getLastNameLength());
                        break;
                    case "AGE":
                        sortValue = Integer.compare(o1.getAge(), o2.getAge());
                        break;
                   
                    default:
                        throw new IllegalArgumentException("Invalid attribute \"" + attribute + "\"");
                }
                return ascending ? sortValue : -sortValue;
            }
        });

        for (Person p : list) {
            System.out.println(p.getFirstName() + " " + p.getLastName() + " " + p.getAge() );
        } 
       
    }
    }



