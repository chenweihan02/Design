import java.util.Date;

/**
 * @author ChenWeihan
 * @create 2021-12-04 21:05
 */
public abstract class DataOperation {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public abstract String doDataFilter(String data);
}
