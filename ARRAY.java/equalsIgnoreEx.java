public class equalsIgnoreEx{
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = "JAVA";
        String s4 = "Python";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));//True because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}