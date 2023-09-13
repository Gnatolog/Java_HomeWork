package org.example.srp2;
public class Order {

    //region Constructor
    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public Order(){

    }
    //endregion

    // region Getter and Setter(Properties)
    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }
    //endregion

    //region protected Files
    protected String clientName;
    protected String product;
    protected int qnt;
    protected int price;
   //endregion

}
