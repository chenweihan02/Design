/**
 * @author ChenWeihan
 * @create 2021-11-28 15:40
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {}
    synchronized public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
