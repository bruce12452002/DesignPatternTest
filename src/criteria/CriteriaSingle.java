package criteria;

import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream()
                .filter(p -> "SINGLE".equalsIgnoreCase(p.maritalStatus()))
                .toList();
    }
}
