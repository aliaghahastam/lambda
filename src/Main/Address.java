package Main;

public class Address {

    private String alley;
    private String street;
    private int zone;
    private  String city;
    private String postalCode;

    protected Address(String alley, String street, int zone,
                      String city, String postalCode) {
        this.alley = alley;
        this.street = street;
        this.zone = zone;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "\nAddress{" +
                "alley='" + alley + '\'' +
                ", street='" + street + '\'' +
                ", zone='" + zone + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public int getZone() {
        return zone;
    }
}
