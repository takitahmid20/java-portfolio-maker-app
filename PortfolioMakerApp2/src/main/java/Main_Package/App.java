package Main_Package;

import com.mycompany.portfoliomakerapp.LoginPage;
import com.mycompany.portfoliomakerapp.SignupPage;
import com.mycompany.db.Database;

public class App {
    public static void main(String[] args) {
        LoginPage loginObj = new LoginPage();
        loginObj.show();
        
        //Database.loadconnection();
    }
}
