package pojo;

/**
 * Created by ivann on 27.03.15.
 */
public final class CPerson {


    final private String name;
    final private String surName;
    final private int age;
    final private Position position;



    public CPerson(String name, String surName, int age, Position position) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CPerson)) return false;

        CPerson cPerson = (CPerson) o;

        if (age != cPerson.age) return false;
        if (name != null ? !name.equals(cPerson.name) : cPerson.name != null) return false;
        if (position != cPerson.position) return false;
        if (surName != null ? !surName.equals(cPerson.surName) : cPerson.surName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
