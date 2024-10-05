
public class Product {
    String title;
    double price;
    int availableQuantity;

    public Product(String title, double price, int availableQuantity){
        this.title = title;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString(){
        return title+" | "+availableQuantity+" in  stock | "+price+" Taka";
    }
}
