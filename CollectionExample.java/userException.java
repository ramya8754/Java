class UserException{
    public static void main(String[] args) {
        String name = "Ram";
        try {
            ValidUserName(name);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        } finally {
            System.out.println("Finally block: " + name);
        }
    }

    public static void ValidUserName(String name) throws Exception {
        if (name.equals("Ram")) {
            throw new Exception("Invalid user name");
        }
    }
}
