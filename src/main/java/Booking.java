public class Booking {
    private int numberOfNights;
    private Bedroom bedroom;

    public Booking(Bedroom bedroom, int numberOfNights) {
        this.numberOfNights = numberOfNights;
        this.bedroom = bedroom;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public int totalCost(){
        return this.bedroom.getRoomType().getPrice() * this.numberOfNights;
    }

}

