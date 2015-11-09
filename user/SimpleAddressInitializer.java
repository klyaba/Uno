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
public class SimpleAddressInitializer implements AddressInitializer{

    private Address address;

    public SimpleAddressInitializer() {
    }

    public SimpleAddressInitializer(Address address) {
        this.address = address;
    }
    
    public void initDefaultAddress(){
        address.setCity("");
        address.setCountry("");
     }
    
}
