/**
 * @author ChenWeihan
 * @create 2021-12-01 19:26
 */
public interface AbstractPermission {
    public void modifyUserInfo();
    public void viewNote();
    public void publishNote();
    public void modifyNote();
    public void setLevel(int level);
}
