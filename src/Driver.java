
public class Driver {

    public static void main(String[] args) {

        //InputCollector.menu();
        Contact c1 = new Contact("Alex","7789398420","Illustrator","New West","Vancouver");
        ContactList.contacts.add(c1);
        Contact c2 = new Contact("Alex","7789398420","Illustrator","New West","Vancouver");
        ContactList.contacts.add(c2);

        InputCollector.getUserInput();

        System.out.println(ContactList.printContacts());
    }
}
