public class SimpleResolver {
    private int state;

    public SimpleResolver(int seed) {
        this.state = seed;
    }

    public int encode(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 28) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        SimpleResolver obj = new SimpleResolver(28);
        System.out.println(obj.encode(28));
    }
}
