package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String restaurantName;
    private List<Menu> menus;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
        this.menus = new ArrayList<>();
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void removeMenu(Menu menu) {
        menus.remove(menu);
    }

    public void displayMenus() {
        for (Menu menu : menus) {
            System.out.println(menu.getMenuName() + " - " + menu.getPrice());
        }
    }

    public Menu searchMenu(String menuName) {
        for (Menu menu : menus) {
            if (menu.getMenuName().equals(menuName)) {
                return menu;
            }
        }
        return null;
    }
}
