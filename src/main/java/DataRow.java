public class DataRow {

    private String label;
    private String codeFragment;
    private String context;

    public DataRow() {
    }

    public DataRow(String label, String codeFragment, String context) {
        this.label = label;
        this.codeFragment = codeFragment;
        this.context = context;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCodeFragment() {
        return codeFragment;
    }

    public void setCodeFragment(String codeFragment) {
        this.codeFragment = codeFragment;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "DataRow [" +
                "label='" + label + '\'' +
                ", codeFragment='" + codeFragment + '\'' +
                ", context='" + context + '\'' +
                ']';
    }

}
