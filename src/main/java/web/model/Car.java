package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int series;
    private String ownerName;

    public Car() {
    }

    public Car(String model, int series, String ownerName) {
        this.model = model;
        this.series = series;
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
