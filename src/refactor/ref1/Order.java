package refactor.ref1;
/*
Tarea: Refactorizar el método processOrder para utilizar un objeto
de parámetro que contenga itemName, quantity, price, y customerName.
 */


class Order {

    private class Pedido {

        String itemName;
        int quantity;
        double price;
        String customerName;

        public Pedido(String itemName, int quantity, double price, String customerName) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
            this.customerName = customerName;
        }
    }

    void processOrder(Pedido pedido) {
        // Procesamiento del pedido
    }
}
