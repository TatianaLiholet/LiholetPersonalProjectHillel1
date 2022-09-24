package lesson16.product;

public abstract class Product {
    private String name;
    private int code;
    private int price;
    private String category;
    private String operationSystem;

    public Product(String name, int code, int price, String category) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.category = category;
    }

    public Product(String name, int code, int price, String category, String operationSystem) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.category = category;
        this.operationSystem = operationSystem;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
