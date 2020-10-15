import java.util.*;

public class Address {
    private String country;
    private String state;
    private String city;
    private String street;
    private String building;
    private String housing;
    private String flat;

    void AddressSepByC(String rawAddress) {
        String[] address = rawAddress.split(",");
        this.country = address[0];
        this.state = address[1];
        this.city = address[2];
        this.street = address[3];
        this.building = address[4];
        this.housing = address[5];
        this.flat = address[6];
    }
    void AddressSepByG(String rawAddress) {
        StringTokenizer st = new StringTokenizer(rawAddress, ",.;-/");
        List<String> addressList = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            addressList.add(st.nextToken());
        }
        this.country = addressList.get(0);
        this.state = addressList.get(1);
        this.city = addressList.get(2);
        this.street = addressList.get(3);
        this.building = addressList.get(4);
        this.housing = addressList.get(5);
        this.flat = addressList.get(6);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", housing='" + housing + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
