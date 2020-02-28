package functionalInterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "9999999");

        // Normal java function
        greetCustomer(maria);

        // Consumer Functional Interface
        greetCustomerConsumer.accept(maria);

    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + " , thanks for registering and number: "
                    + customer.customerPhoneNumber);


    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " , thanks for registering and number: " + customer.customerPhoneNumber);
    }


    static class Customer {

        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
