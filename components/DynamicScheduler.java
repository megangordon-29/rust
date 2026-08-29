public class SmartCollector {
    private int state;

    public SmartCollector(int seed) {
        this.state = seed;
    }

    public int build(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 10) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        SmartCollector obj = new SmartCollector(10);
        System.out.println(obj.build(10));
    }
}
