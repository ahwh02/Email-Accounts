package emailApp;

/**
 *
 * @author abdullahwarraich
 */
public class emailApp {
    
    public static void main(String[] args) {
        emailAccount account = new emailAccount("Abdullah","Warraich","engineering","xyz");
        
        account.generateCompanyEmail();
        System.out.println("Email address: " + account.getEmail());
        
        account.generatePassword();
        System.out.println("Password: " + account.getPassword());
        
        account.setPassword("Password123%");
        System.out.println("New password: " + account.getPassword());
    }
    
}
