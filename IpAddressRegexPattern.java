import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class IpAddressRegexPattern{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
			System.out.println("Enter Your Ip Address :");
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
			System.out.println("Enter Your Ip Address :");
        }

    }
}
class MyRegex{
    String ips = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    String pattern = ips + "\\."+ips + "\\."+ips + "\\."+ips;
}