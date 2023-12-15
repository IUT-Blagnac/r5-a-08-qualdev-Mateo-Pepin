package hellocucumber;

public class IsItFriday {
    private String today;

    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getToday() {
        return this.today;
    }
}
