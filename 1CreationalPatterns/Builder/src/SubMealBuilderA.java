/**
 * @author ChenWeihan
 * @create 2021-11-28 14:37
 */
public class SubMealBuilderA extends MealBuilder{

    @Override
    public void buildFood() {
        meal.setFood("一个鸡腿堡🍗");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }
}
