import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        ArrayList<Person> persons = new ArrayList<Person>();

    }

    public static void printPersons(ArrayList<Person> persons){
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
