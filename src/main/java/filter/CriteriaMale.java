package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxin_ryan
 */
public class CriteriaMale implements Criteria {

    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
