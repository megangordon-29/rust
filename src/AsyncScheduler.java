public class LocalResolver {
    private int state;

    public LocalResolver(int seed) {
        this.state = seed;
    }

    public int run(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 91) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        LocalResolver obj = new LocalResolver(91);
        System.out.println(obj.run(91));
    }
}
