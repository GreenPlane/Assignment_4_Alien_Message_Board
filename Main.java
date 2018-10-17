import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter message board post:");

        String post = scan.nextLine();

        int input1 = 0, input2 = 0, input3 = 0;

        String username = post.substring(0, post.indexOf('-'));

        int index = 0;

        while (index < post.length()) {
            if (post.contentEquals("^^")){
                input1++;
            }
            if (post.contentEquals("qey")) {
                input2++;
            }
            if (post.charAt(index) == '$') {
                input3++;
            }
            index++;
        }


        if (input1 > 0 || input2 > 0 || input3 > 0){
            System.out.println("Results\n"+ "BAD\n" + username);
            System.out.println("^^:" + input1);
            System.out.println("qey:" + input2);
            System.out.println("$:" + input3);
        }


    }
}
