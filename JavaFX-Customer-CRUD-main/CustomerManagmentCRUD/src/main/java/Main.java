import DB.DBConnection;
import org.jasypt.util.text.BasicTextEncryptor;

import java.sql.Connection;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println(DBConnection.getInstance().getConnection());
        Starter.main(args);

        String key="12345";
        BasicTextEncryptor basictextencrypter =  new BasicTextEncryptor();
        String password="icet123";
        basictextencrypter.setPassword (key);
        String encryptpassword=basictextencrypter.encrypt(password);
        System.out.println(encryptpassword);

        String decryptpassword=basictextencrypter.decrypt(encryptpassword);
        System.out.println(decryptpassword);
    }
}