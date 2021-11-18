package Business;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Menu.Item;
import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employees = system.getEmployeeDirectory().createEmployee("RRH");   
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employees, new SystemAdminRole());
        
        //Initialising details for sample
        Employee customer = system.getEmployeeDirectory().createEmployee("Customer");
        UserAccount customerAccount = system.getUserAccountDirectory().createUserAccount("Kiran", "KiranC123", customer, new CustomerRole());
        Customer cust = new Customer(customerAccount);
        cust.setAddress("75 st Alphonsus Street");
        cust.setPhoneNumber(857415090);
        system.getCustomerDirectory().addCustomer(cust);
        
        // This is to initialise the delivery details - for sample
        Employee delivery = system.getEmployeeDirectory().createEmployee("Delivery");
        UserAccount deliveryAcc = system.getUserAccountDirectory().createUserAccount("Nithin", "Nithin123", delivery, new DeliverManRole());
        DeliveryMan deliveryAgent = new DeliveryMan(deliveryAcc);
        deliveryAgent.setAddress("76 st Alphonsus Street");
        deliveryAgent.setPhoneNumber(857415091);
        deliveryAgent.setStatus("Available");
        system.getDeliveryManDirectory().addDeliveryAgent(deliveryAgent);
        
        
        // This is to initialise the resturant details - for sample
        Employee restaurant = system.getEmployeeDirectory().createEmployee("Restaurant");
        UserAccount restaurantAcc = system.getUserAccountDirectory().createUserAccount("restaurant", "restaurant", restaurant, new AdminRole());
        
        Restaurant restaurantDetails = new Restaurant("Qdoba", "Boston ","Borak",
                                  802030909, restaurantAcc);
        ArrayList<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item("Burrito", 9.90, "Qdoba"));
        Menu menu = new Menu();
        menu.setMenu(itemList);
        restaurantDetails.setMenu(menu);
        system.getRestaurantDirectory().addRestaurant(restaurantDetails);
        
        return system;
    }
    
}
