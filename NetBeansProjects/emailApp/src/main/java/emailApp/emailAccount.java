package emailApp;

/**
 *
 * @author abdullahwarraich
 */
import java.util.Random;

public class emailAccount {
    
    private String firstName;
    private String lastName;
    private String department;
    private String companyName;
    private String emailAddress;
    private String password;
    
    // constructor to recieve relevant information
    public emailAccount(String firstName, String lastName, String department, String companyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.companyName = companyName;
    }
    
    // Generate company email address based on information
    public void generateCompanyEmail() {
        this.emailAddress = (this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+this.companyName+".com");
    }
    
    // Generate random 8-character password
    public void generatePassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();
        
        for (int i = 0; i < 9; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            randomString.append(randomChar);
        }

        this.password = randomString.toString();
    }
    
    // Change password
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
    
    // Retrieve email address
    public String getEmail() {
        return this.emailAddress;
    }
    
    // Retrieve password
    public String getPassword() {
        return this.password;
    }
}
