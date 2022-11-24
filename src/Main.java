public class Main {
    public static void main(String[] args) {
        //Builder Pattern
        System.out.println("Builder Pattern");
        CodeBuilder cb = new CodeBuilder("Person");
        cb.addField("name", "String")
                .addField("age", "int")
                .addField("address", "String")
                .addField("weight", "int")
                .addField("height", "double");
        System.out.println(cb);

        //Factory Pattern
        System.out.println("\n\n\nFactory Pattern");
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

        //Prototype Pattern
        System.out.println("\n\n\nPrototype Pattern");
        Line firstLine = new Line(new Point(0, 0), new Point(25, 25));
        Line secondLine = firstLine.deepCopy();

        System.out.println(firstLine);
        System.out.println(secondLine);

        firstLine.getStart().setX(10);
        firstLine.getStart().setY(5);
        secondLine.getEnd().setX(50);
        secondLine.getEnd().setY(40);

        System.out.println(firstLine);
        System.out.println(secondLine);
    }
}