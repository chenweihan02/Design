/**
 * @author ChenWeihan
 * @create 2021-12-04 8:58
 */
public class Client {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 7, 2, 4, 3};
        int result[];
        ArraryHandler arraryHandler = new ArraryHandler();
        Sort sort;
        sort = (Sort) XMLUtil.getBean();

        arraryHandler.setSortObj(sort);
        result = arraryHandler.sort(arr);

        for (int i = 0; i < result.length; i ++ ) {
            System.out.print(result[i] + ",");
        }
    }
}
