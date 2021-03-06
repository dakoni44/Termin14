package org.ftninformatika.termin14.model;

public class Fruit {

    public static Fruit[] fruits= {
            new Fruit(0,"limun", "kiseo je", "lemmon.jpg",1),
            new Fruit(1, "pomorandza", "ukusna je", "orange.jpg",5),
            new Fruit(2, "grejpfrut", "gorko je", "grapefruit.jpg",3.5f)};

    private int id;
    private String name;
    private String description;
    private String imageFileName;
    private float rating;


    public Fruit(int id, String name, String description, String imageFileName, float rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageFileName = imageFileName;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }


}
