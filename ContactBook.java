import java.util.ArrayList;

public class Contact {
    public String name;
    public String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

public class ContactBook {
    public ArrayList<Contact> contacts;

    public ContactBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(String name, String email) {
        Contact contact = new Contact(name, email);
        this.contacts.add(contact);
    }

    public void removeContact(String name) {
        for (Contact contact : this.contacts) {
            if (contact.name.equals(name)) {
                this.contacts.remove(contact);
                break;
            }
        }
    }

    public Contact searchContact(String name) {
        for (Contact contact : this.contacts) {
            if (contact.name.equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void listContacts() {
        for (Contact contact : this.contacts) {
            System.out.println("Name: " + contact.name + ", Email: " + contact.email);
        }
    }
}




### Documentation
    # Candidate are expected to identify Code Smell, Error Handling, Duplciate Code, Testing
    1. Public Data: The name and email fields in the Contact class and the contacts field in the ContactBook class are public. This violates the principle of encapsulation. These fields should be private and accessed via getter and setter methods.
    2. Duplicate Code: The removeContact and searchContact methods have similar code. This could be refactored to avoid duplication.
    3. Lack of Error Handling: The methods do not handle potential errors. For example, what happens if the contact to be removed does not exist?
    4. Lack of Input Validation: The addContact method does not validate the input. The name should be a string and the email should be a valid email address.
    5. Lack of Documentation: The class and its methods lack comments. Good code should always be well-documented.
    6. Lack of Testing: There are no unit tests. The candidate could write some tests to verify the functionality of the class.
