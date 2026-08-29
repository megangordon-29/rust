public class SimpleProvider {
    private int state;

    public SimpleProvider(int seed) {
        this.state = seed;
    }

    public int fetch(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 5) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        SimpleProvider obj = new SimpleProvider(5);
        System.out.println(obj.fetch(5));
    }
}
