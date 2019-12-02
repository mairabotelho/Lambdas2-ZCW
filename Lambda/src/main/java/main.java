import java.time.LocalDate;
import java.time.Month;

public class main {

    public static void main(String[] args) {
        PersonServices people = new PersonServices();

        people.create("Oscar Martinez", LocalDate.of(1986, Month.DECEMBER, 12),
                Person.Sex.MALE, "oscar@gmail.com");
        people.create("Michael Scott", LocalDate.of(1978, Month.JULY, 8),
                Person.Sex.MALE, "scottstotes@gmail.com");
        people.create("Philys Vance", LocalDate.of(2018, Month.MAY, 23),
                Person.Sex.FEMALE, "pvance@gmail.com");
        people.create("Pamela Beasly", LocalDate.of(2006, Month.NOVEMBER, 1),
                Person.Sex.FEMALE, "pam@gmail.com");



        //local class
        class checkForOver18 implements CheckPerson {
            @Override
            public boolean test(Person person) {
                return person.getAge() < 30;
            }
        }

        people.printPeople(people.getPeopleList(), new checkForOver18());


        //anonymous class
        people.printPeople(people.getPeopleList(), new CheckPerson() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >=30;
            }
        });

        people.printPeople(people.getPeopleList(), person -> person.getAge() >= 30);

    }
}
