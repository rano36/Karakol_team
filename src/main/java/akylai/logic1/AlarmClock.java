package akylai.logic1;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        if (day >= 1 && day <= 5) {
            if (!vacation) {
                return "7:00";
            } else {
                return "10:00";
            }
        } else if (day == 0 || day == 6) {
            if (!vacation) {
                return "10:00";
            } else {
                return "off";
            }
        } else {
            return "Smth went wrong";
        }
    }
}