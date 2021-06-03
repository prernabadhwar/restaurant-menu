package restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private Category category;
    private boolean newItem;

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    //Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isNewItem() {
        return newItem;
    }
}
