package com.chkim.abstracFactory.after;

public class Mandoo {

    private String name;

    private String color;

    private String material;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Mandoo{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", material='" + material + '\'' + '}';
    }
}
