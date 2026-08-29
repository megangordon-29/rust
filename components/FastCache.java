public class DynamicController {
    private int state;

    public DynamicController(int seed) {
        this.state = seed;
    }

    public int run(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 78) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        DynamicController obj = new DynamicController(78);
        System.out.println(obj.run(78));
    }
}
