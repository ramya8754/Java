public class CommentLine1 {
    public static void main(String[] args) {
        String Name = args[0];
        int age = Integer.parseInt(args[1]);
        // System.out.print(Name + " is "+ (age >= 18 ? " your are Eligible " : "Your not Eligible"));

        if( age >= 18){
            System.out.println("your are Eligible");
        }
        else{
            System.out.println("your are Not Eligible");
        }
        for( int i = 0 ; i < args.length ; i++){
            System.out.println(args[i]);
        }
        
    }
}