public class LiteDispatcher {
    private int state;

    public LiteDispatcher(int seed) {
        this.state = seed;
    }

    public int flush(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 96) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        LiteDispatcher obj = new LiteDispatcher(96);
        System.out.println(obj.flush(96));
    }
}
