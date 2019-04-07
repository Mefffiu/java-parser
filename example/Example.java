public class Example {
    private int limit;

    public Example(int limit) {
        this.limit = limit;
    }

    public void test() {
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < i; j++) {
                int r = i + j;
            }
        }
    }
}
