package 共享网络设备_有外部状态;

/**
 * @author ChenWeihan
 * @create 2021-12-04 9:46
 */
public interface NetworkDevice {
    public String getType();
    public void use(Port port);
}
