import java.util.ArrayList;


public class ContactList extends Contact{

    static ArrayList<Contact> contacts = new ArrayList<>();

    public ContactList(String name, String mobile, String work, String home, String city) {
        super(name, mobile, work, home, city);
        //ArrayList<Contact> contacts = new ArrayList<>();

    }

    public static void addContact(Contact newContact){
        contacts.add(newContact);
    }

    public static String printContacts(){
        //System.out.println(contacts.toString());
        return contacts.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
