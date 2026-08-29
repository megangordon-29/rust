public class SecureProcessor {
    private int state;

    public SecureProcessor(int seed) {
        this.state = seed;
    }

    public int flush(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 38) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        SecureProcessor obj = new SecureProcessor(38);
        System.out.println(obj.flush(38));
    }
}
