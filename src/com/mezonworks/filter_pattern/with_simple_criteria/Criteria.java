package com.mezonworks.filter_pattern.with_simple_criteria;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
