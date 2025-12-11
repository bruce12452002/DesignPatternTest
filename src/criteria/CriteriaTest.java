package criteria;

import java.util.List;

/**
 * 又就過濾器(filter)模式
 */
public class CriteriaTest {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Robert", "Male", "Single"),
                new Person("John", "Male", "Married"),
                new Person("Laura", "Female", "Married"),
                new Person("Diana", "Female", "Single"),
                new Person("Mike", "Male", "Single"),
                new Person("Bobby", "Male", "Single")
        );

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, female);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println(male.meetCriteria(persons));
        System.out.println(female.meetCriteria(persons));
        System.out.println(singleMale.meetCriteria(persons));
        System.out.println(singleOrFemale.meetCriteria(persons));
    }
}
