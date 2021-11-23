package Arrays;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }
    public boolean addContact(Contact contact){
        if (findContact(contact)>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContact.add(contact);
        System.out.println("Contact is added successfully");
        return true;
    }
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContact.add(contact);
        return true;

    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        System.out.println("current = "+ findContact(oldContact));
        myContact.set(findContact(oldContact),newContact);
        System.out.println(newContact.getName() + " added successfully");
        return true;

    }

    public boolean deleteContact(Contact contact){
        if (findContact(contact)<0){
            System.out.println("Contact is not in the list ");
            return false;
        }
        myContact.remove(findContact(contact));
        System.out.println("Contact is removed successfully");
        return true;
    }

    public boolean deleteContact(String name){
        if (findContact(name)<0){
            System.out.println("Contact is not in the list ");
            return false;
        }
        myContact.remove(findContact(name));
        System.out.println("Contact is removed successfully");
        return true;
    }

    private int findContact(Contact contact) {
        for (int i=0; i<myContact.size(); i++)
        {
            if (myContact.get(i).getName().equals(contact.getName()))
                return i;
            if (myContact.get(i).getPhoneNumber().equals(contact.getPhoneNumber()))
                return i;
        }
        return -1;
    }

    private int findContact(String name, String phone){
        for (int i=0; i<myContact.size(); i++){
            if(myContact.get(i).getName().equals(name))
                return i;
            else if (myContact.get(i).getPhoneNumber().equals(phone))
                return i;
        }
        return -1;
    }
    private int findContact(String name){
        for (int i=0; i<myContact.size(); i++){
            if(myContact.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }
    public boolean queryContact(String name, String phone){
        if (findContact(name,phone)>=0)
            return true;
        return false;
    }
    public boolean queryContact(String name){
        if (findContact(name)>=0)
            return true;
        return false;
    }

    public void printContact(){
        System.out.println("Contact List");
        for (int i=0; i<myContact.size(); i++)
            System.out.println((i+1) + " . " +
                    myContact.get(i).getName() + " -> " +
                    myContact.get(i).getPhoneNumber());
    }
    public void add(){
        Contact contact = new Contact("timur","123");
        myContact.add(contact);
    }

}
