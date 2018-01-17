package mk;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Letter {

    private String code;
    private String city;
    private String street;

    public Letter() {
    }

    public Letter(String code, String city, String street) {
        this.code = code;
        this.city = city;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "Letter{" +
                "code='" + code + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Letter letter = (Letter) o;

        if (code != null ? !code.equals(letter.code) : letter.code != null) return false;
        if (city != null ? !city.equals(letter.city) : letter.city != null) return false;
        return street != null ? street.equals(letter.street) : letter.street == null;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        return result;
    }
}
