package restaurant;

public class MenuItem {
    private String name;
    private String category;
    private String description;
    private Double price;
    private Boolean newItem;

    public MenuItem(String name, String category, String description,
                    Double price, Boolean newItem) {
        this.category = category;
        this.description = description;
        this.price = price;
        this.newItem = newItem;
    }
    public MenuItem(String name, String category, Double price) {
        this.category = category;
        this.price = price;
        this.description = "not available";
        this.newItem = true;
    }

    public void setCategory(String category) { this.category = category; }
    public void setDescription(String description) { this.description = description; }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }

    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
    public Double getPrice() {
        return price;
    }
    public Boolean getNewItem() {
        return newItem;
    }

}
