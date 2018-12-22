package Shop.ProductsTypes;

public enum ProductType {
    DRINKS("Drinks"), ELECTRONICS("Electornics"), PRODUCTS("Products"),CHEMISTRY("Chemistry");

    private String description;

    public String getDescription() {
        return description;
    }

    ProductType(String description) {
        this.description = description;
    }
}
