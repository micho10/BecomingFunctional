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

  public static List<String> getEnabledCustomerNames() {
    ArrayList<String> outList = new ArrayList<String>();
    for (Customer customer : Customer.allCustomers) {
      if (customer.enabled) {
        outList.add(customer.name);
      }
    }
    return outList;
  }

  public static List<String> getEnabledCustomerStates() {
    ArrayList<String> outList = new ArrayList<String>();
    for (Customer customer : Customer.allCustomers) {
      if (customer.enabled) {
        outList.add(customer.state);
      }
    }
    return outList;
  }

  public static List<String> getEnabledCustomerPrimaryContacts() {
    ArrayList<String> outList = new ArrayList<String>();
    for (Customer customer : Customer.allCustomers) {
      if (customer.enabled) {
        outList.add(customer.primaryContact);
      }
    }
    return outList;
  }

  public static List<String> getEnabledCustomerDomains() {
    ArrayList<String> outList = new ArrayList<String>();
    for (Customer customer : Customer.allCustomers) {
      if (customer.enabled) {
        outList.add(customer.domain);
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

    printCustomerList();

  }


  public static void printCustomerList() {
    for (Customer customer : allCustomers) {
      System.out.println(customer);
    }
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    return builder.append("id: ").append(id)
            .append(" | name: ").append(name)
            .append(" | address: ").append(address)
            .append(" | state: ").append(state)
            .append(" | primaryContact: ").append(primaryContact)
            .append(" | domain: ").append(domain)
            .append(" | enabled: ").append(enabled)
            .toString();
  }

}