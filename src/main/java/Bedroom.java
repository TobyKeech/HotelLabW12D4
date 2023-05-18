import java.util.ArrayList;

public class Bedroom extends Room {
    private Integer number;

    public Bedroom(RoomType roomType, ArrayList<Guest>guests, int number){
        super(roomType, guests);
        this.number = number;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
