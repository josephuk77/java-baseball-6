package baseball.model;

// 스트라이크 볼을 저장하는 모델
public class Referee {
    private int strikes;
    private int balls;

    public Referee() {
        this.strikes = 0;
        this.balls = 0;
    }

    public Referee(int strikes, int balls) {
        this.strikes = strikes;
        this.balls = balls;
    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

}
