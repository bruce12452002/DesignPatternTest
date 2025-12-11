package criteria;

import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream()
                .filter(p -> "FEMALE".equalsIgnoreCase(p.gender()))
                .toList();
    }
}
