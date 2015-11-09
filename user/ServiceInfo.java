/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.time.LocalDate;//????
import org.joda.time.*;


/**
 *
 * @author chanta
 */
public class ServiceInfo {
    private String login;
    private String password;
    private LocalDate calendar;
    private String email;

    public ServiceInfo(String login, String password, LocalDate calendar, String email) {
        this.login = login;
        this.password = password;
        this.calendar = calendar;
        this.email = email;
    }

    public LocalDate getCalendar() {
        return calendar;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setCalendar(LocalDate calendar) {
        this.calendar = calendar;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    @Override
    public boolean equals(Object object) {
        if (object ==null)
            return false;
         
        if (object == this) {
            return true;
        }
        if (!(object instanceof ServiceInfo)) {
            return false;
        }
        ServiceInfo info =(ServiceInfo)object;
        if ((this.getLogin().compareTo(info.getLogin())==0)&&(this.password.compareTo(info.getPassword())==0)
            &&(this.calendar.equals(info.getCalendar()))&&(this.email.compareTo(info.email))==0)
            return true;
        
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + this.getLogin().hashCode()+this.getPassword().hashCode();
        result = 37 * result + this.getEmail().hashCode()+this.getCalendar().hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append(" ServiceInfo: ").append(getLogin()).append(", ").append(getPassword()).append(", ")
                .append(getEmail()).append(" ").append(getCalendar()).append(" ");
        return buffer.toString();
    }
    
    
            
    
}
