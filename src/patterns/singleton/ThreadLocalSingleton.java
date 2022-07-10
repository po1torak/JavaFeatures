package patterns.singleton;

public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {

    }

    private static final ThreadLocal<ThreadLocalSingleton> INSTANCE = ThreadLocal.withInitial(ThreadLocalSingleton::new);

    public static ThreadLocalSingleton getInstance() {
        return INSTANCE.get();
    }
}
