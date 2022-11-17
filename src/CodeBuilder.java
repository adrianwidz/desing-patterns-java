import java.util.ArrayList;

class CodeBuilder
{
    private String className;
    private ArrayList<String> fields;

    public CodeBuilder(String className)
    {
        this.className = className;
        this.fields = new ArrayList<>();
    }

    public CodeBuilder addField(String name, String type)
    {
        this.fields.add(String.join(" ", "public", type, name));
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("public class ").append(this.className).append("\n{\n");
        for (String filed : this.fields) {
            sb.append(String.format("\t%s;\n", filed));
        }
        sb.append("}");
        return sb.toString();
    }
}