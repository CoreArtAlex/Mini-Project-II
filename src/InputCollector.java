import java.util.Objects;
import java.util.Scanner;

public class InputCollector extends Contact{

    static String inName;
    static String inMobile;
    static String inWork;
    static String inHome;
    static String inCity;

    public InputCollector(String  name, String  mobile, String  work, String  home, String  city) {
        super(name, mobile, work, home, city);
        inName = getName();
        inMobile = getMobile();
        inWork = getWork();
        inHome = getHome();
        inCity = getCity();
    }

    public static void menu(){
        System.out.println("+==== Contact App ====+");
        System.out.println("| 1. List All Contacts|");
        System.out.println("| 2. Add New Contact  |");
        System.out.println("| 3. Remove Contact   |");
        System.out.println("| 4. Update Contact   |");
        System.out.println("| 5. Quit             |");
        System.out.println("+=====================+");
    }

    public static void getUserInput(){
        for (int i = 0; i <= 50; i++) {
            InputCollector.menu();
            System.out.println("Enter your Option:");
            Scanner prompt = new Scanner(System.in);
            String entrance = prompt.nextLine();

            if (Objects.equals(entrance, "2")) {
                System.out.println("Enter Name:");
                inName = Contact.addContact();
                System.out.println("Enter Mobile:");
                inMobile = Contact.addContact();
                System.out.println("Enter Work:");
                inWork = Contact.addContact();
                System.out.println("Enter Home:");
                inHome = Contact.addContact();
                System.out.println("Enter City:");
                inCity = Contact.addContact();
                ContactList.addContact(new Contact(inName, inMobile, inWork, inHome, inCity));
            }

            if (Objects.equals(entrance, "5")) {
                System.out.println("Bye Bye!");
                System.exit(0); // Zero because it's a successful termination
            }

            if (Objects.equals(entrance, "1")) {
                try {
                    for (int j = 0; j <= ContactList.contacts.size(); j++) {
                        System.out.println("{" + j + ContactList.contacts.get(j) + "}");
                    }
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("Exception Catch!!");
                }
                //System.out.println(ContactList.printContacts());
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
