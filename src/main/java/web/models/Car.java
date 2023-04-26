package web.models;

public class Car {

    private Long id;
    private String model;
    private int series;
    private String owner;

    public Car() {

    }

    public Car(long id, String model, int series, String owner) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.owner = owner;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                ", owner='" + owner + '\'' +
                '}';
    }
}
