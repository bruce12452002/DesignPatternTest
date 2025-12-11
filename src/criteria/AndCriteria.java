package criteria;

import java.util.List;

public record AndCriteria(Criteria criteria, Criteria otherCriteria) implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return otherCriteria.meetCriteria(criteria.meetCriteria(persons));
    }
}
