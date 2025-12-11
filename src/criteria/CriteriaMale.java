package criteria;

import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream()
                .filter(p -> "MALE".equalsIgnoreCase(p.gender()))
                .toList();
    }
}
