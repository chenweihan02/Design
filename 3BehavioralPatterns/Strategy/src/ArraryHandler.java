/**
 * @author ChenWeihan
 * @create 2021-12-04 8:56
 */
public class ArraryHandler {
    private Sort sortObj;
    public int[] sort(int arr[]) {
        sortObj.sort(arr);
        return arr;
    }

    public void setSortObj(Sort sortObj) {
        this.sortObj = sortObj;
    }
}
