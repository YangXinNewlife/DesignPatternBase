package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxin_ryan
 */
public class CriteriaSingle implements Criteria {

    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
