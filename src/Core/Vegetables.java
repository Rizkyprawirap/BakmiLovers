package Core;

public class Vegetables extends Bakmi{

    private String vegeTopping;
    private String vegeSauce;

    public Vegetables(String id, String name, Double price, String size, String vegeTopping, String vegeSauce) {
        super(id, name, price, size);
        this.vegeTopping = vegeTopping;
        this.vegeSauce = vegeSauce;
    }

    public String getVegeTopping() {
        return vegeTopping;
    }

    public void setVegeTopping(String vegeTopping) {
        this.vegeTopping = vegeTopping;
    }

    public String getVegeSauce() {
        return vegeSauce;
    }

    public void setVegeSauce(String vegeSauce) {
        this.vegeSauce = vegeSauce;
    }

    @Override
    public void printInfo() {
        System.out.println("=============================");
        System.out.println("ID         : " + this.getId());
        System.out.println("Name       : " + this.getName());
        System.out.println("Size       : " + this.getSize());
        System.out.println("Topping    : " + this.getVegeTopping());
        System.out.println("Sauce      : " + this.getVegeSauce());
        System.out.println("Cutlet     : - ");
        System.out.println("Meat Size  : - ");
        System.out.println("Price      : " + this.getPrice());
        System.out.println("=============================");
    }
}
