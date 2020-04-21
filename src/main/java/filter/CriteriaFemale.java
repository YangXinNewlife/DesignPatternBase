package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxin_ryan
 */
public class CriteriaFemale implements Criteria {

    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
