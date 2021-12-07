/**
 * @author ChenWeihan
 * @create 2021-12-05 15:43
 */
public class HighState extends AbstractState{
    public HighState(AbstractState state) {
        this.user = state.user;
        this.point = state.getPoint();
        this.stateName = "秋名山车神";
    }


    @Override
    public void checkState(int score) {
        if (point < 1000) {
            user.setState(new PrimaryState(this));
        }
        else if (point < 5000) {
            user.setState(new MiddleState(this));
        }
    }
}
