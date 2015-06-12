import java.util.ArrayList;
import java.util.List;

public class Customer {

  static public ArrayList<Customer> allCustomers = new ArrayList<>();
  public Integer id = 0;
  public String name = "";
  public String address = "";
  public String state = "";
  public String primaryContact = "";
  public String domain = "";
  public Boolean enabled = true;

  public Customer() {
  }

  public static List<String> getEnabledCustomerField(String field) {
    ArrayList<String> outList = new ArrayList<>();
    for (Customer customer : Customer.allCustomers) {
      if (customer.enabled) {
        if (field.equals("name"))
          outList.add(customer.name);
        else if (field.equals("state"))
          outList.add(customer.state);
        else if (field.equals("primaryContact"))
          outList.add(customer.primaryContact);
        else if (field.equals("domain"))
          outList.add(customer.domain);
        else if (field.equals("address"))
          outList.add(customer.address);
        else
          throw new IllegalArgumentException("Unknown field");
      }
    }
    return outList;
  }



  /* TODO: Add a main function */
  public static void main(String args[]) {
    for (int i = 0; i < 20; i++) {
      Customer customer = new Customer();
      customer.id = i;
      customer.name = "customer" + i;
      customer.address = i + " address st.";
      customer.state = "state " + i;
      customer.primaryContact = "contact " + i;
      customer.domain = "domain " + i;
      customer.enabled = (i % 3) == 0;

      allCustomers.add(customer);
    }

    print(Customer.allCustomers.get(1));

  }


  public static void print(Customer customer) {
    System.out.printf("name: %s | address: %s | state: %s | contact: %s | domain: %s\n",
            customer.getEnabledCustomerField("name"),
            customer.getEnabledCustomerField("address"),
            customer.getEnabledCustomerField("state"),
            customer.getEnabledCustomerField("primaryContact"),
            customer.getEnabledCustomerField("domain")
            );
  }

}