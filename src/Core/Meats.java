package Core;

public class Meats extends Bakmi{

    private Integer meatSize;
    private String cutlet;

    public Meats(String id,String name, Double price, String size, Integer meatSize, String cutlet) {
        super(id,name, price, size);
        this.meatSize = meatSize;
        this.cutlet = cutlet;
    }

    public Integer getMeatSize() {
        return meatSize;
    }

    public void setMeatSize(Integer meatSize) {
        this.meatSize = meatSize;
    }

    public String getCutlet() {
        return cutlet;
    }

    public void setCutlet(String cutlet) {
        this.cutlet = cutlet;
    }

    public void printInfo() {
        System.out.println("=============================");
        System.out.println("ID         : " + this.getId());
        System.out.println("Name       : " + this.getName());
        System.out.println("Size       : " + this.getSize());
        System.out.println("Topping    : - ");
        System.out.println("Sauce      : - ");
        System.out.println("Cutlet     : " + this.getCutlet());
        System.out.println("Meat Size  : " + this.getMeatSize());
        System.out.println("Price      : " + this.getPrice());
        System.out.println("=============================");
    }

}
