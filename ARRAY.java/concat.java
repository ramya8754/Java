public class concat {

    public static void main(String[] args) {
        String s1 = "Java language";
        System.out.println(s1);
        s1.concat("is immutable");
        System.out.println(s1);
        s1 = s1.concat("is immutable ao assign in explicity");
        System.out.println(s1);
    // two type of concat
        String s2 = "Example";
        System.out.println(s1 + s2);
    }
}