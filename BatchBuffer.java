public class LiteDispatcher {
    private int state;

    public LiteDispatcher(int seed) {
        this.state = seed;
    }

    public int collect(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 55) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        LiteDispatcher obj = new LiteDispatcher(55);
        System.out.println(obj.collect(55));
    }
}
