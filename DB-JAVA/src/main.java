import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by stbormir on 27.03.2017.
 */
public class main {

    public static void main(String[] args) {

        try{
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://linuxserver:3306/DB3_stbormir?user=stbormir&password=mypass");

        Statement s = con.createStatement();
        ResultSet res;
        res = s.executeQuery("select * from bankDB");


            while((res.next())) {
                System.out.print("ID:");
                System.out.print(res.getString("id"));
       
            }
            con.close();



        }catch (Exception e) { e.printStackTrace();}
}

}
