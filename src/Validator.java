import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    String validationHostName = "([a-z0-9]-*){1,63}\\.([a-z]){2,63}(\\.(([a-z]){2,63}))*";
    String validationIP = "((\\d|[1-9]\\d|1\\d{2}|2[0-4][0-9]|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d{2}|2[0-4][0-9]|25[0-5])";

    public boolean isIP(String ip){
        Pattern pattern = Pattern.compile(
                "^" + validationIP
                + "$"
        );

        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public boolean isHost(String hostName){
        Pattern pattern = Pattern.compile(
                "^" + "http(s)?://" + validationHostName + "$"
        );

        Matcher matcher = pattern.matcher(hostName);
        return matcher.matches();
    }

    public boolean isEmail(String email){
        Pattern pattern = Pattern.compile(
                "^" + "([a-zA-Z0-9](\\.[a-zA-Z0-9])*){6,32}@[a-z]{2,32}(\\.([a-z]{2,32})+)" + "$"
        );

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isSocket(String socket){
        Pattern pattern = Pattern.compile(
                "^" + "(http(s)?://)?" + "(" + validationIP + "|" + validationHostName + "|localhost):\\d{1,5}" + "$"
        );

        Matcher matcher = pattern.matcher(socket);
        return matcher.matches();
    }

    public boolean isName(String name){
        Pattern pattern = Pattern.compile(
                "^" + "[A-Z]([a-z]{1,64})$"
        );

        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
