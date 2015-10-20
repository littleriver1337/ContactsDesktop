package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    TextField name;
    @FXML
    TextField phone;
    @FXML
    TextField email;

    @FXML
    Button addButton;
    @FXML
    Button removeButton;

    @FXML
    ListView listView;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        listView.setItems(contacts);
    }

    public void addContact(){
        Contact item = new Contact(name.getText(), phone.getText(), email.getText());
        contacts.add(item);
        name.setText("");
        phone.setText("");
        email.setText("");
        if (name.getText().equals("") & (phone.getText().equals("") & (email.getText().equals("")))){
        } else {
            contacts.add(item);
        }
    }
    public void removeContact(){
        Contact item = (Contact) listView.getSelectionModel().getSelectedItem();
        contacts.remove(item);
        if( item != null){
            contacts.remove(item);
        }
    }
}
