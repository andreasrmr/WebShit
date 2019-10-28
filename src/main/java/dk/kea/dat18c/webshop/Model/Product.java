package dk.kea.dat18c.webshop.Model;

public class Product {
    private int idproducts;
    private String name;
    private int price;
    private String description;

    public Product(int idproducts, String name, int price, String description) {
        this.idproducts = idproducts;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getIdproducts() {
        return idproducts;
    }

    public void setIdproducts(int idproducts) {
        this.idproducts = idproducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
