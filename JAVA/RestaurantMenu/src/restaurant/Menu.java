package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    //Setters
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //Getters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}
