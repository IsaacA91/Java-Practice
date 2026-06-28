/*
HELLLO!!!
Thank you for checking my one of many  projects
This is for target practice
The purpose of it is to find a target, pretty self-explanatory
Down below I have different examples on this problem
Comment all of them out except the one you want to use
 */


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

boolean found = false;
Scanner scanner = new Scanner(System.in);

        ///Target Based on Hard coded Value
        int hardTarget = 5;
for(int i = 1; i < 21; i++){
    if(i == hardTarget){
        found = true;
        System.out.println("Taget found");
        break;
    }
}
if(!found){
    System.out.println("Target Not Found");
}

        ///Target found based on user input
//        System.out.println("Enter your Target: ");
//
//        int target = scanner.nextInt();
//        System.out.println(target);
//
//        for(int i = 1; i < 62; i++){
//            if(i == target){
//                found = true;
//                System.out.println("Target Found");
//                break;
//            }
//        }
//
//        if (!found){
//            System.out.println("Target Not Found");
//        }


        ////Target and length

//        System.out.println("Enter what number the search should end at");
//        int length = scanner.nextInt();
//
//        System.out.println("Enter Your Target");
//        int target = scanner.nextInt();
//
//        for (int i = 1; i <= length; i++){
//            if(i == target){
//                found = true;
//                System.out.println("Target found your length");
//                break;
//            }
//        }
//
//        if(!found){
//            System.out.println("This target does not exist in your length");
//        }



        scanner.close();
    }



}