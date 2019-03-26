public class DataRow {

    private String label;
    private String codeFragment;
    private String context;

    public DataRow() {
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
        return String.format("label: %-20s context: %-20s codeFragment: '%s'", label, context, codeFragment);
    }

}
