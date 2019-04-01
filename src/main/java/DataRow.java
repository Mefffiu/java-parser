import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataRow {

    private String label;
    private String context;
    private String codeFragment;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setCodeFragment(String codeFragment) {
        this.codeFragment = codeFragment;
    }

    private String escapeQuotes(String data) {
        String escapedData = Optional.ofNullable(data).orElse("-");
        escapedData = escapedData.replace("\"", "\"\"");
        return '"' + escapedData + '"';
    }

    public String toCSVFormat() {
        return Stream.of(label, context, codeFragment)
                .map(this::escapeQuotes)
                .collect(Collectors.joining(","));
    }

    @Override
    public String toString() {
        return String.format("label: %-20s context: %-20s codeFragment: '%s'", label, context, codeFragment);
    }

}
