import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = new String[0];
        try {
            components = data.split("\\s+");
        }catch (ArrayIndexOutOfBoundsException noSplit) {
            System.out.println("\nWrong format of request. Correct format:" +
                    "add Василий Петров vasily.petrov@gmail.com +79215637722");
        }

        if (components.length != 4) {
            throw new IllegalArgumentException("\nWrong format of request. Correct format:" +
                    "add Василий Петров vasily.petrov@gmail.com +79215637722");
        }

        if(!checkEmail(components[INDEX_EMAIL])){
            throw new IllegalArgumentException("\nWrong format of e-mail. Correct format:" +
                    "add Василий Петров vasily.petrov@gmail.com +79215637722");
        }

        if(!checkNumber(components[INDEX_PHONE])) {
            throw new IllegalArgumentException("\nWrong format of number. Correct format:" +
                    "add Василий Петров vasily.petrov@gmail.com +79215637722");
        }

        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {

        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {

        storage.remove(name);
    }

    public Customer getCustomer(String name) {

        return storage.get(name);
    }

    public int getCount() {

        return storage.size();
    }

    public boolean checkNumber(String phone) {
        String number = phone.replaceAll("[^0-9]", "");
        String pattern = "^((\\+7|7|8)+([0-9]){10})$";
        return number.matches(pattern);
    }

    public boolean checkEmail(String email) {
        String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:" +
                "[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\" +
                "[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:" +
                "[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4]" +
                "[0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:" +
                "[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]"+
                "|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

        Pattern checkEmail = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = checkEmail.matcher(email);

        return matcher.find();
    }
}