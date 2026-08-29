public class CoreMonitor {
    private int state;

    public CoreMonitor(int seed) {
        this.state = seed;
    }

    public int encode(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 14) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        CoreMonitor obj = new CoreMonitor(14);
        System.out.println(obj.encode(14));
    }
}
