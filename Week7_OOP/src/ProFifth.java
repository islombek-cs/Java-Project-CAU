public class ProFifth {
    private int hours;
    private int minutes;
    private int seconds;

    public ProFifth(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public ProFifth addSeconds(int sec) {
        int newSeconds = this.seconds + sec;
        int newMinutes = this.minutes;
        int newHours = this.hours;

        if (newSeconds >= 60) {
            newMinutes += newSeconds / 60;
            newSeconds = newSeconds % 60;
        }

        if (newMinutes >= 60) {
            newHours += newMinutes / 60;
            newMinutes %= 60;
        }

        newHours %= 24; // Roll over if needed

        return new ProFifth(newHours, newMinutes, newSeconds);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
