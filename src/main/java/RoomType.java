public enum RoomType {
    SINGLE(1, 100),
    DOUBLE(2, 200),
    TRIPLE(3, 250),
    FAMILY(4, 300),
    SUITE(6, 1000),
    CONFERENCE(10, 1500);

    private final int capacity;

    private final int price;

    RoomType(int capacity, int price){
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPrice(){ return this.price;}
}

