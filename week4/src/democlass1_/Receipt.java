package src.democlass1_;

    public 

public class Receipt {

    public static void main(String[] args) {

    }

    public void addOrder(Otder order){ //add new order on productlist, but array cannot change so use lenght +1
        Order[] newOrderList = new Order[this.orders.length+1];
        for (int i = 0; i < this.orders.length; i++){
            newOrderList[i] = this.order[i];
        }
        newOrderList[newOrderList.length - 1] = order;
        this.orders =
    }


}
