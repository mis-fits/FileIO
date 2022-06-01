package Contacts;

public class Contact {
    private String firstName;
    private String lastName;
    //    private String address;
    private String email;
    private String phone;

    public Contact(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
//        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getfirstName() {
        return this.firstName;
    }

    public String setfirstName() {
        return (this.firstName = firstName);
    }

    public String getlastName() {
        return this.lastName;
    }

    public String setlastName() {
        return (this.lastName = lastName);
    }

//    public String getAddress() {
//        return this.address;
//    }

//    public String setAddress(){
//        return (this.address = address);
//    }

    public String getEmail() {
        return this.email;
    }

    public String setEmail() {
        return (this.email = email);
    }

    public String getPhone() {
        return this.phone;
    }

    public String setPhone() {
        return (this.phone = phone);
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

//    public void viewContact() {
//        for (int index = 0; index < top; index++) {
//            System.out.println((index + 1) + " First Name " +
//                    contactlist.get(index).getFirstName());
//            System.out.println("Last Name " + contactlist.get(index).getLastName());
//            System.out.println("Address: " + contactlist.get(index).getAddress());
//            System.out.println("E-mail: " + contactlist.get(index).getEmail());
//            System.out.println("Phone: " + contactlist.get(index).getPhone());
//            System.out.println("Job Title " + contactlist.get(index).getJobTitle());
//            System.out.println("Organization " +  contactlist.get(index).
//                    getOrganization());
//            System.out.println("Date of Birth " + contactlist.get(index).
//                    getDateOfBirth());
//        }
    }

//    public void viewContacts() {
//        System.out.println(this.getfirstName());
//        System.out.println(this.getlastName());
//
//    }
}