package exception;

/**
 * Created by Adrian on 2017-03-02.
 */
public class NightClub {

    public void goIn(Person person) {
        if (person.getAge() < 18) {
            throw new PersonIsNotAnAdultException();
        }
    }
}
