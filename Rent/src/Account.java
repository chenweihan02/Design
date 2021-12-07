/**
 * @author ChenWeihan
 * @create 2021-12-05 13:24
 */
public abstract class Account {
    private String userId; // 用户id
    private String username; // 用户名
    private String password; // 密码
    private String telNo; // 手机号
    private String idCardNo; // 身份证

    public Account(String userId, String username, String password, String telNo, String idCardNo) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.telNo = telNo;
        this.idCardNo = idCardNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }
}
