import java.util.concurrent.atomic.AtomicInteger;

public class Id {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private final int id;

    public Id() {
        id = COUNTER.getAndIncrement();
    }

    public int getId() {
        return id;
    }
    public static void main (String... args){
        System.out.println(new Id().getId());
        System.out.println(new Id().getId());
        System.out.println(new Id().getId());
    }
}
