import java.util.Scanner;

public class Contact {

    private String  name;
    private String  mobile;
    private String  work;
    private String  home;
    private String  city;

    public Contact(String  name, String  mobile, String  work, String  home, String  city){
        this.name = name;
        this.mobile = mobile;
        this.work = work;
        this.home = home;
        this.city = city;
        setName(name);
        setMobile(mobile);
        setWork(work);
        setHome(home);
        setCity(city);
    }

    public static String  addContact(){
        // Add Scanner
        Scanner addContact = new Scanner(System.in);
        return addContact.nextLine();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", work='" + work + '\'' +
                ", home='" + home + '\'' +
                ", city='" + city + '\'' +
                '}'+'\n';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
