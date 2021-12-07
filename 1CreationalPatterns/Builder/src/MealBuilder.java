/**
 * @author ChenWeihan
 * @create 2021-11-28 14:36
 */
public abstract class MealBuilder {
    protected Meal meal = new Meal();

    public abstract void buildFood();
    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}
