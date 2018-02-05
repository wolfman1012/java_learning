package palindome;

//import com.sun.org.apache.xpath.internal.operations.String;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;


public class Main extends Palindrome {

    //@Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }


    public static void main(String[] args) throws IOException {

        Palindrome palProcess = new Palindrome();
        palProcess.setString("test");

        while(!"return 0".equals(palProcess.getString())) {
                System.out.println("Input a string. Type 'Return 0' to exit");
                Scanner fromUser = new Scanner(System.in);
                String intermediate = new String();
                intermediate = fromUser.nextLine();
                palProcess.setString(intermediate);

                if("return 0".equals(palProcess.getString())){
                    System.out.println("Goodbye");
                    System.exit(0);
                }
                else
                if(intermediate.isEmpty()){
                    System.out.println("Incorrect Input");
                    //System.out.println("Input a string. Type 'Return 0' to exit");
                    fromUser = new Scanner(System.in);
                }
                else
                if(palProcess.isPalindrome()==true){
                    System.out.println("Palindrome");
                }
                else
                if (palProcess.isPalindrome()==false){
                    System.out.println("Not a Palindrome");
                }

            }
        }
    }

