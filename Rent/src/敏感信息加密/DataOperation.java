package 敏感信息加密;

/**
 * @author ChenWeihan
 * @create 2021-12-05 22:20
 */
public abstract class DataOperation {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public abstract String doEncrypt(String data);
    public abstract String deEncrypt(String data);
}
