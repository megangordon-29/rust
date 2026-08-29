public class AtomicLoader {
    private int state;

    public AtomicLoader(int seed) {
        this.state = seed;
    }

    public int collect(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 29) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        AtomicLoader obj = new AtomicLoader(29);
        System.out.println(obj.collect(29));
    }
}
