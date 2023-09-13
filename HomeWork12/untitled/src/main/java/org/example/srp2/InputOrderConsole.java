package org.example.srp2;

import java.util.Scanner;

public class InputOrderConsole {

    //region public Method
    public void inputFromConsole(){
        order.clientName = prompt("Client name: ");
        order.product = prompt("Product: ");
        order.qnt = Integer.parseInt(prompt("Quantity: "));
        order.price = Integer.parseInt(prompt("Price: "));
    }
    //endregion

    //region private Method
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    //endregion

    //region Constructor
    public InputOrderConsole(Order order) {
        this.order = order;
    }
    //endregion

    //region private Files
    private final Order order;
    //endregion

}
