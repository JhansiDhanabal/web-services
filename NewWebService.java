package webservice;
import java.sql.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
@WebService(serviceName = "NewWebService")
public class NewWebService {
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "username") String txt,@WebParam(name = "password") String txt1){
        boolean flag=false;
        try{
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/check");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("select * from valid");
            while(rs.next()){
                String name=rs.getString("users");
                String pass=rs.getString("pass");
                if(txt.equals(name) && txt1.equals(pass)){
                    flag=true;
                    break;
                }
            }
            c.close();
            if(flag) 
                return "VALID USERS";
            else
                return "INVALID USERS";
        }
        catch(Exception e){
            return "can't established connection";
        }
    }
}
