package model;

public class Car {
    private String model;
    private String series;
    private String color;

    public Car(String model, String series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

}
