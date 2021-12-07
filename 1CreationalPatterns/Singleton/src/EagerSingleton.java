/**
 * @author ChenWeihan
 * @create 2021-11-28 15:38
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}
    public static EagerSingleton getInstance() {
        return instance;
    }
}
