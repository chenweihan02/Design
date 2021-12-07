/**
 * @author ChenWeihan
 * @create 2021-11-28 14:38
 */
public class KFCWaiter {
    private MealBuilder mb;

    public void setMealBuilder(MealBuilder mb) {
        this.mb = mb;
    }

    public Meal construct() {
        mb.buildDrink();
        mb.buildFood();
        return mb.getMeal();
    }
}
