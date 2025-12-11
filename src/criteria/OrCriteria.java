package criteria;

import java.util.List;

public record OrCriteria(Criteria criteria, Criteria otherCriteria) implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> ps = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(persons)
                .stream()
                .filter(o -> !ps.contains(o))
                .toList();
    }
}
