import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator();

        List<String> ipAddresses = Arrays.asList(
                "0.0.0.0",
                "255.0.255.255",
                "a.b.c.ddd",
                "1.2.3.456",
                "1a.23.0.255",
                "012.01.0.0",
                "0,0,0.0",
                "125..202.0.255"
        );

        List<String> hostNames = Arrays.asList(
                "https://another-host-name.org.ua:8080",
                "http://host-name.cm.ua.org",
                "hostname.ua",
                "http://0372.ua",
                "asodaosdo"
        );

        List<String> emails = Arrays.asList(
                "something@gmail.com",
                "123sooo@mail.ru",
                "soo-soo.fo@@yandex.ru",
                "..gllgl",
                "@mail.ru",
                "...@mail.ru",
                "oooo23.23a@gmail.com"
        );

        List<String> sockets = Arrays.asList(
                "http://socketone.com:60000",
                "http://localhost:8080",
                "https://-socket:8080",
                "http://sok3t",
                "http://soo#::08"
        );

        List<String> names = Arrays.asList(
                "Alexey",
                "123",
                "Alex123",
                "Andrew",
                "O. J. Smith"
        );

        System.out.println("[IP]");
        for (String str : ipAddresses)
            System.out.println(str + " is IP: " + validator.isIP(str));

        System.out.println();
        System.out.println("[Host names]");
        for (String str : hostNames)
            System.out.println(str + " is host name: " + validator.isHost(str));

        System.out.println();
        System.out.println("[Sockets]");
        for (String str : sockets)
            System.out.println(str + " is a socket: " + validator.isSocket(str));

        System.out.println();
        System.out.println("[Emails]");
        for (String str : emails)
            System.out.println(str + " is an email: " + validator.isEmail(str));

        System.out.println();
        System.out.println("[Names]");
        for (String str : names)
            System.out.println(str + " is a name: " + validator.isName(str));
    }
}
