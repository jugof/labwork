public class Interval {
    private int minute;
    private int seconds;

    public Interval(int m, int s) {
        minute = m;
        seconds = s;
    }

    public int getInterval(){
        int m = seconds / 60;
        int s = seconds % 60;
        return ((m+minute)*60) + s;
    }
}
