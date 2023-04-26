package client;
import java.util.Scanner;
public class valid {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("ENTER USERNAME : ");
        String u=o.next();
        System.out.println("ENTER PASSWORD : ");
        String p=o.next();
        System.out.println(hello(u.toLowerCase(),p.toLowerCase()));
    }
    private static String hello(java.lang.String username, java.lang.String password) {
        webservice.NewWebService service = new webservice.NewWebService();
        webservice.NewWebService port = service;
        return port.hello(username, password);
    }
}
