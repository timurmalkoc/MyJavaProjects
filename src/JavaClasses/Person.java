package JavaClasses;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=0 && age<100)
            this.age = age;
        else
            this.age = 0;
    }

    public boolean isTeen(int age){
        if (age>12 && age<20)
            return true;
        return false;
    }


    public String fullName(){
        if (firstName.isEmpty()&& lastName.isEmpty())
            return "";
        else if(firstName.isEmpty())
            return this.lastName;
        else if(lastName.isEmpty())
            return this.firstName;
        return firstName + " " +lastName;
    }
}
