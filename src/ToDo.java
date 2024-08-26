import java.util.LinkedList;
import java.io.*;

class UserChoice{
    int choice,size,taskremove,taskmodify;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void menu()throws IOException {
        System.out.println("Press 1 To Add Task");
        System.out.println("Press 2 To Remove Task");
        System.out.println("Press 3 To Modify Task");
        System.out.println("Press 4 To Print Task");
        choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1:
            LinkedList<String> linkedlist = new LinkedList<String>();
            System.out.println("How Many Task You Want To Add");
            size = Integer.parseInt(br.readLine());

            for (int i = 1; i <= size; i++) {
                System.out.println("Enter " + i + " Your Task");
                linkedlist.add(br.readLine());
            }
            break;

            case 2:
                System.out.println("Which Task You Want To Remove");
                taskremove = Integer.parseInt(br.readLine());
                for (int i =1; i<=size; i++){
                    linkedlist.remove(taskremove);
                }

            case 3:
                System.out.println("What YOu want to modify");
                taskmodify = Integer.parseInt(br.readLine());
                linkedlist
        }


    }

        public void Remove() throws IOException{
            for (int i=1; i<=size; i++){
                System.out.println("Which Task Do You Want To Remove");

            }
        }
}



public class ToDo {
    public static void main(String[] args) throws IOException {
        UserChoice uc = new UserChoice();
        uc.menu();

    }

}
