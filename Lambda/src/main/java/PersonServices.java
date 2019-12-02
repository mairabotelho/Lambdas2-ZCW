import java.time.LocalDate;
import java.util.ArrayList;

public class PersonServices {

    ArrayList<Person> peopleList;

    public PersonServices(){

        peopleList = new ArrayList<>();
    }

    public void create (String name, LocalDate birthday, Person.Sex gender, String emailAddress){
        Person newPerson = new Person(name, birthday, gender, emailAddress);
        peopleList.add(newPerson);
    }

    public ArrayList<Person> getPeopleList () {
        return peopleList;
    }

    public static void printPeople(
            ArrayList<Person> roster, CheckPerson check) {
        for (Person p : roster) {
            if (check.test(p)) {
                p.printPerson();
            }
        }
    }
}
