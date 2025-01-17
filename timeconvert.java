public class timeconvert {

    public static String convertTo12HourFormat(String time24) {
        int hour = Integer.parseInt(time24.substring(0, 2));
        int minute = Integer.parseInt(time24.substring(3, 5));
        String period = (hour >= 12) ? "PM" : "AM";

        // Convert hour to 12-hour format
        if (hour == 0) {
            hour = 12; // Midnight case
        } else if (hour > 12) {
            hour -= 12; // PM hour
        }

        return String.format("%d:%02d %s", hour, minute, period);
    }

    public static void main(String[] args) {
        String time24 = "14:30"; // Example time in 24-hour format
    }
}
