package user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class WorkUser
{
    public class MethodsWorkUser
    {
    private ArrayList<User>  arrUsers;
    public void addUser(String name, String surname, String country, String sity, String login, String password, LocalDate calendar, String email, GregorianCalendar bDay)
    {
// пока не сделана проверка на существование уже такого элемента(по логину и ящику!!!!!!!!!!!!!!!!
        
        Initials initials =new Initials(name,surname);
        Address address =new Address(country, sity);
        ServiceInfo serviceInfo =new ServiceInfo( login, password, calendar, email);
	User us = new User(initials, address, bDay, serviceInfo);
	arrUsers.add(us);
    }

    public User editUser(String name, String surname, String country, String sity, String login, String password, LocalDate calendar, String email, GregorianCalendar bDay)
    { 
	User tmp=this.search(login);
	if(tmp!=null)
	{
            Initials initials =new Initials(name,surname);
            Address address =new Address(country, sity);
            ServiceInfo serviceInfo =new ServiceInfo( login, password, calendar, email);
		tmp.setInitials(initials);
		tmp.setAddress(address);
                tmp.setbDay(bDay);
                tmp.setServiceInfo(serviceInfo);
                return tmp;
	}
	else
	{
		return null;//пользователь не найден
        }
    
    }
    public User deleteUser(String login)
    { 
	User tmp=this.search(login);
	if(tmp!=null)
	{
            arrUsers.remove(tmp);            
	}
	else
	{
		return null;// пользователь не найден
	}
    }
    
   
    }
    public User search(String login){
        int i=0;
	while((arrUsers.get(i).getServiceInfo().getLogin()!=login)&&(i<arrUsers.size()))
	{
		i++;
	}
        if(i<arrUsers.size())
	{
            return arrUsers.get(i);            
	}
        return null;
    }
    
    public String viewUsers(){
        //опка непонятно как будет осуществляться вывод на экран, 
        //поэтому выкидываю просто строку со всеми данными пользователей
        StringBuilder buffer=new StringBuilder();
        for(int i : allUsers) bufer.append(allUsers.get(i).toString());
        return buffer;
        
    }
}