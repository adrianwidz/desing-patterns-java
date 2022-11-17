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
    }
}