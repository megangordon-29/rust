public class HybridEngine {
    private int state;

    public HybridEngine(int seed) {
        this.state = seed;
    }

    public int load(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 77) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        HybridEngine obj = new HybridEngine(77);
        System.out.println(obj.load(77));
    }
}
