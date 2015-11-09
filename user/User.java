/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.util.GregorianCalendar;
/**
 *
 * @author chanta
 */
public class User {
    private Initials initials;
    private Address address;
    private GregorianCalendar bDay;
    private ServiceInfo serviceInfo;

    public User(Initials initials, Address address, GregorianCalendar bDay, ServiceInfo serviceInfo) {
        this.initials = initials;
        this.address = address;
        this.bDay = bDay;
        this.serviceInfo = serviceInfo;
    }

    public Initials getInitials() {
        return initials;
    }

    
    public Address getAddress() {
        return address;
    }

    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    public GregorianCalendar getbDay() {
        return bDay;
    }

    public void setInitials(Initials initials) {
        this.initials = initials;
    }

    
    public void setAddress(Address address) {
        this.address = address;
    }

    public void setServiceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public void setbDay(GregorianCalendar bDay) {
        this.bDay = bDay;
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
        User user =(User)object;
        
        if ((this.getInitials().equals(user.getInitials()))&&(this.address.equals(user.address))
                &&(this.bDay.equals(user.bDay))&&(this.serviceInfo.equals(user.serviceInfo))){
            return true;
        }
          return false;
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("User: ").append(getInitials().toString()).append(", ").append(bDay.toString())
                .append(", ").append(address.toString());
        return buffer.toString();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result =  this.getAddress().hashCode()+this.getServiceInfo().hashCode()+
                this.getInitials().hashCode()+getbDay().hashCode();
       
        return result;
    }
    
    

    
    
}
