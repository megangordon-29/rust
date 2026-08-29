public class SimpleScheduler {
    private int state;

    public SimpleScheduler(int seed) {
        this.state = seed;
    }

    public int resolve(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 25) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        SimpleScheduler obj = new SimpleScheduler(25);
        System.out.println(obj.resolve(25));
    }
}
