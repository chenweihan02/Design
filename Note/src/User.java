/**
 * @author ChenWeihan
 * @create 2021-12-04 14:51
 */
public class User{
    private String userId; // 用户id
    private String name; // 用户名
    private String password; // 用户密码
    private String nick; // 昵称名字

    public User(String userId, String name, String password, String nick) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.nick = nick;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
