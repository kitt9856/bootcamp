
public enum OrderStatus {
    PAID(1),
    PENDING_FOR_SHIP(2),
    SHIPPING(3),
    DELIVERED(4),;

    private int value;

    private OrderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public int next() {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.getValue() == this.value + 1) // status is address reference
            {
                return status;
            }
        }
        return this;
    }

    public static void main(String[] args) {
        OrderStatus.PAID.next();

        for (OrderStatus status : OrderStatus.values()) { //.values() build-in method from Enum.class
            //Enum.toSting()
            System.out.println(status); //toString()
            System.out.println(status.name()); //return String format for enum value
            //toString will override so name() is orginal

        }
        System.out.println(OrderStatus.PAID.next().name());
        System.out.println(OrderStatus.PAID.next().next().name());

        //ordinal() -> ordering purpose
        //PAID(1)....
        System.out.println(OrderStatus.PAID.ordinal());
        System.out.println(OrderStatus.PENDING_FOR_SHIP.ordinal());
        System.out.println(OrderStatus.SHIPPING.ordinal());
        System.out.println(OrderStatus.DELIVERED.ordinal());

        System.out.println(OrderStatus.SHIPPING.compareTo(OrderStatus.SHIPPING));
        System.out.println(OrderStatus.SHIPPING.compareTo(OrderStatus.DELIVERED));
        System.out.println(OrderStatus.DELIVERED.compareTo(OrderStatus.SHIPPING));
        //compareTo from Enum

        //valueOf() static method
        //find the enum object,which has the same name you provided.
        System.out.println(OrderStatus.valueOf("PAID").name());
        //Runtime error
        System.out.println(OrderStatus.valueOf("PAI").name());//runtime error

        //procedual programming has input has output =>non OOP
    }

}
