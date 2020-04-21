package filter;

import java.util.List;

/**
 * @author yangxin_ryan
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> personList);

}
