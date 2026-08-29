public class BatchAdapter {
    private int state;

    public BatchAdapter(int seed) {
        this.state = seed;
    }

    public int encode(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 49) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        BatchAdapter obj = new BatchAdapter(49);
        System.out.println(obj.encode(49));
    }
}
