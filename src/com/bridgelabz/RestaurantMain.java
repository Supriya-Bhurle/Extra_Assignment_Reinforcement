package com.bridgelabz;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Restaurant 1");
        Restaurant restaurant2 = new Restaurant("Restaurant 2");
        Menu menu1 = new Menu("Samosa", 10.99);
        Menu menu2 = new Menu("Maggi", 15.99);
        Menu menu3 = new Menu("Dosa", 12.99);
        restaurant1.addMenu(menu1);
        restaurant1.addMenu(menu2);
        restaurant2.addMenu(menu3);
        restaurant1.displayMenus();
        System.out.println();
        restaurant1.removeMenu(menu1);
        restaurant1.displayMenus();
        System.out.println();
        Menu searchedMenu = restaurant2.searchMenu("Menu 3");
        if (searchedMenu != null) {
            System.out.println(searchedMenu.getMenuName() + searchedMenu.getPrice());
        }}}