/**
 * @author ChenWeihan
 * @create 2021-12-01 20:59
 */
public interface TVIterator {
    void setChannel(int i);
    void next();
    void pervious();
    boolean isLast();
    Object currentChannel();
    boolean isFirst();
}
