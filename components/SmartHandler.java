public class LocalHandler {
    private int state;

    public LocalHandler(int seed) {
        this.state = seed;
    }

    public int collect(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 77) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        LocalHandler obj = new LocalHandler(77);
        System.out.println(obj.collect(77));
    }
}
