package io.github.mcendon.restaurant.menubackend.model;

import java.util.List;

public class MenuModel {
    private String name;
    private int price;
    private String currency;
    private String photo;
    private String description;
    private List<Integer> days;
    private String validFrom;
    private String validTo;
    private String timeFrom;
    private String timeTo;
    private int stars;

    public String getName() {
        return name;
    }

    public MenuModel setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public MenuModel setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public MenuModel setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public MenuModel setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MenuModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<Integer> getDays() {
        return days;
    }

    public MenuModel setDays(List<Integer> days) {
        this.days = days;
        return this;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public MenuModel setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public String getValidTo() {
        return validTo;
    }

    public MenuModel setValidTo(String validTo) {
        this.validTo = validTo;
        return this;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public MenuModel setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
        return this;
    }

    public String getTimeTo() {
        return timeTo;
    }

    public MenuModel setTimeTo(String timeTo) {
        this.timeTo = timeTo;
        return this;
    }

    public int getStars() {
        return stars;
    }

    public MenuModel setStars(int stars) {
        this.stars = stars;
        return this;
    }
    
}
