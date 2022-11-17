public class Main {
    public static void main(String[] args) {
        //Builder Pattern
        CodeBuilder cb = new CodeBuilder("Person");
        cb.addField("name", "String")
                .addField("age", "int")
                .addField("address", "String")
                .addField("weight", "int")
                .addField("height", "double");
        System.out.println(cb);

        //Factory Pattern
        PersonFactory firstFactory = new PersonFactory();
        PersonFactory secondFactory = new PersonFactory();

        Person bob = firstFactory.createPerson("Bob");
        Person john = firstFactory.createPerson("John");
        Person bill = firstFactory.createPerson("Billy");

        Person bobSecond = secondFactory.createPerson("Bob");

        System.out.println(bob);
        System.out.println(john);
        System.out.println(bill);
        System.out.println(bobSecond);
    }
}