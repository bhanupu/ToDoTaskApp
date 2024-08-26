import java.util.Scanner;

class UserChoice{
    Scanner sc = new Scanner(System.in);
    int choice;
    public void menu(){
        System.out.println("Press 1 To Add Task");
        System.out.println("Press 2 To Remove Task");
        System.out.println("Press 3 To Modify Task");
        System.out.println("Press 4 To Print Task");
        choice = sc.nextInt();
    }
}



public class ToDo {


}
