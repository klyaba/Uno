/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author chanta
 */
public class Address {
    private String country;
    private String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }
    public Address(){
        AddressInitializer addInit =new SimpleAddressInitializer();
        addInit.initDefaultAddress();
    }
//    public Address() {
//        this.country = "";
//        this.city = "";
//    }
    

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object object) {
        if (object ==null)
            return false;
         
        if (object == this) {
            return true;
        }
        if (!(object instanceof Address)) {
            return false;
        }
        Address address = (Address)object;
        if ((this.getCity().compareTo(address.getCity())==0)&&(this.getCountry().compareTo(address.getCountry())==0)){
            return true;
        }
          return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + this.getCity().hashCode()+this.getCountry().hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append(" Address: ").append(getCity()).append(", ").append(getCountry()).append(" ");
        return buffer.toString();
    }
    
    
    
}
