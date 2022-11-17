public class PersonFactory {

    private int index;

    public PersonFactory() {
        this.index = 0;
    }

    public Person createPerson(String name) {
        return new Person(index++, name);
    }

}

class Person {
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
