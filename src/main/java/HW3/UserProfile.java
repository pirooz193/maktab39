package HW3;

import java.util.Scanner;

public class UserProfile {
    private String name;
    private String lastName;
    private String userName;
    private String passWord;
    private String emailAddress;
    private String province;
    private String cityName;
    private String street;
    private int phoneNumber;
    private long postalCode;
    private long mobileNumber;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPostalCode(long postalCode) {
        this.postalCode = postalCode;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    public void profile() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("ENTER YOUR NAME:");
        setName(scanner.nextLine());
        System.out.printf("ENTER YOUR LAST NAME:");
        setLastName(scanner.nextLine());
        System.out.printf("ENTER YOUR USERNAME :");
        setUserName(scanner.nextLine());
        System.out.printf("ENTER YOUR PASSWORD :");
        setPassWord(scanner.nextLine());
        System.out.printf("ENTER YOUR MOBILE NUMBER :\n+98");
        setMobileNumber(scanner.nextLong());
        System.out.println("ENTER YOUR EMAIL ADDRESS :");
        setEmailAddress(scanner.nextLine());
        setEmailAddress(scanner.nextLine());
        System.out.println("ENTER YOUR  ADDRESS :");
        System.out.printf(" .ENTER YOUR PROVINCE :");
        setProvince(scanner.nextLine());
        System.out.printf(" .ENTER YOUR CITY :");
        setCityName(scanner.nextLine());
        System.out.printf(" .ENTER YOUR STREET :");
        setStreet(scanner.nextLine());
        System.out.printf(" .ENTER YOUR POSTAL CODE :");
        setPostalCode(scanner.nextInt());
        System.out.println(" \n... THANK YOU ...");
    }


    public String getPassWord() {
        return passWord;
    }
}
