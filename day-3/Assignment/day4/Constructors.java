package Assignment.day4;

public class Constructors {
    public static void main(String[] args) {

        char[] ch = {'j', 'a', 'v', 'a'};
        String s1 = new String(ch);

        byte[] b = {97, 98, 99};
        String s2 = new String(b);

        System.out.println(s1 + " " + s2);

        String s = "javaprogramme";

        s = s.replace('j', 'l');
        System.out.println(s);

        System.out.println(s.substring(4));
    }
}
