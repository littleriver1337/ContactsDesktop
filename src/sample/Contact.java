package sample;

/**
 * Created by MattBrown on 10/20/15.
 */
public class Contact {
    String name;
    String phone;
    String email;

    public Contact(String email, String name, String phone) {
        this.email = email;
        this.name = name;
        this.phone = phone;
    }
    @Override
    public String toString(){
        return (String.format("%s %s %s", name, phone, email));
    }
}
