/**
 * @author ChenWeihan
 * @create 2021-12-05 15:42
 */
public class MiddleState extends AbstractState{

    public MiddleState(AbstractState state) {
        this.user = state.user;
        this.point = state.getPoint();
        this.stateName = "老司机";
    }



    @Override
    public void checkState(int score) {
        if (point >= 5000) {
            user.setState(new HighState(this));
        }
        else if (point < 1000) {
            user.setState(new PrimaryState(this));
        }
    }
}
