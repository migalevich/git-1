package homeworkThread;

public class Parcel extends CargoShip {
     public int shipId;
     public String description;

    public Parcel(int shipId, String description) {
        this.shipId = shipId;
        this.description = description;
    }

    public Parcel() {
    }

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "shipId=" + shipId +
                ", description='" + description + '\'' +
                '}';
    }
}

