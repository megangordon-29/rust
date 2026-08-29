public class RemoteClient {
    private int state;

    public RemoteClient(int seed) {
        this.state = seed;
    }

    public int collect(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 10) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        RemoteClient obj = new RemoteClient(10);
        System.out.println(obj.collect(10));
    }
}
