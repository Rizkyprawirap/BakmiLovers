package Core;

public abstract class Bakmi {

    private String name;
    private Double price;
    private String size;
    private String id;

    public Bakmi( String id,String name, Double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void printInfo();

}
