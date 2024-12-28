public class Employee {
    private String fIO;
    private String jobTitle;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;

    Employee(String fIO, String jobTitle, String eMail, String phoneNumber, int salary, int age) {
        this.fIO = fIO;
        this.jobTitle = jobTitle;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    void getEmployee() {
        System.out.println("FIO: " + fIO + " Job Title: " + jobTitle + " eMail: " + eMail
                    + " pnone number: " + phoneNumber + " salary: " + salary + " age: " + age);

    }

}

