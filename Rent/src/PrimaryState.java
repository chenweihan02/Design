/**
 * @author ChenWeihan
 * @create 2021-12-05 13:55
 */
public class PrimaryState extends AbstractState{

    public PrimaryState(AbstractState state) {
        this.user = state.user;
        this.point = state.getPoint();
        this.stateName = "新手上路";
    }

    public PrimaryState(User user) {
        this.point = 0;
        this.user = user;
        this.stateName = "新手上路";
    }


    @Override
    public void checkState(int score) {
        if (point >= 5000) {
            user.setState(new HighState(this));
        }
        else if (point >= 1000) {
            user.setState(new MiddleState(this));
        }
    }
}
