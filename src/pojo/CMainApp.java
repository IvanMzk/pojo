package pojo;

/**
 * Created by ivann on 27.03.15.
 */
public class CMainApp {


    public static void main(String[] argv)
    {
        CPerson person1 = new CPerson("Ivan", "Ivanov", 20, Position.DEVELOPER);
        CPerson person2 = new CPerson("Peter", "Petrov", 30, Position.QA);
        CPerson person3 = new CPerson("Peter", "Petrov", 30, Position.QA);

        System.out.println(person2 == person3);
        System.out.println(person2.equals(person3));
        System.out.println(person1.equals(person2));




    }


}
