public class AtomicRouter {
    private int state;

    public AtomicRouter(int seed) {
        this.state = seed;
    }

    public int render(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 8) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        AtomicRouter obj = new AtomicRouter(8);
        System.out.println(obj.render(8));
    }
}
