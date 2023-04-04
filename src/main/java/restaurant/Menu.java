package restaurant;
public class Menu {
    private String item;
    private String lastUpdated;

    public Menu(String item) {
        this.item = item;
        this.lastUpdated = "04-01-2023";   // default value "April 1, 2023"
    }

    public void setName(String item) { this.item = item; }
    public void setLastUpdated(String lastUpdated) { this.lastUpdated = lastUpdated; }

    public String getName() { return item; }
    public String getLastUpdated() {
        return lastUpdated;
    }
}
