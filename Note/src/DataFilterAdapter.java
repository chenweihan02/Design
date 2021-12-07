/**
 * @author ChenWeihan
 * @create 2021-12-04 21:09
 */
public class DataFilterAdapter extends DataOperation {

    private DataFilter dataFilter;

    public DataFilterAdapter() {
        this.dataFilter = new DataFilter();
    }

    @Override
    public String doDataFilter(String data) {
        return dataFilter.doDataFilter(data);
    }
}
