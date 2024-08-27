import java.util.LinkedList;
import java.io.*;

class UserChoice{
    int choice,size,item,replace,midadd,midremove;
    String update,firstadd,midelement;
    char option;
    LinkedList<String> linkedlist = new LinkedList<String>();
    BufferedReader br ;

    public void menu()throws IOException {
       do{
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press 1 To Add Task");
        System.out.println("Press 2 To Add Task At First");
        System.out.println("Press 3 To Add Task At Middle");
        System.out.println("Press 4 To Remove Task");
        System.out.println("Press 5 To Remove Task From Middle");
        System.out.println("Press 6 To Remove Task From Last");
        System.out.println("Press 7 To Modify Task");
        System.out.println("Press 8 To Print Task");
        choice = Integer.parseInt(br.readLine());
        logic();
           System.out.println("Do You Want To Continue");
           option=(char) br.read();
       }
       while (option=='y'||option=='Y');
    }

    public void logic()throws IOException{
        switch (choice){
            case 1:
                Add();
                break;

            case 2:
                FirstAdd();
                break;

            case 3:
                MiddleAdd();
                break;
            case 4:
                Remove();
                break;

            case 5:
                MiddleRemove();
                break;

            case 6:
                LastRemove();
                break;

            case 7:
                Modify();
                break;

            case 8:
                Print();
        }
    }

    public void Add() throws IOException {

        System.out.println("How Many Task You Want To Add");
        size = Integer.parseInt(br.readLine());

        for (int i = 1; i <= size; i++) {
            System.out.println("Enter " + i + " Your Task");
            linkedlist.add(br.readLine());
        }

    }

    public void FirstAdd() throws IOException{
        System.out.println("Enter the task to add at first");
        firstadd = br.readLine();
        linkedlist.addFirst(firstadd);
    }

    public void MiddleAdd() throws IOException{
        System.out.println("Enter the index number to add task");
        midadd = Integer.parseInt(br.readLine());
        System.out.println("Enter the task");
        midelement = br.readLine();
        linkedlist.add(midadd,midelement);
    }

    public void Remove() throws IOException{
        System.out.println("Which Task You Want The Remove");
        item = Integer.parseInt(br.readLine());
        System.out.print(linkedlist.get(item));
        linkedlist.remove();
        System.out.println(" Has Been Removed");
    }

    public void MiddleRemove() throws IOException{
        System.out.println("Enter the index number to remove task");
        midremove = Integer.parseInt(br.readLine());
        linkedlist.remove(midremove);
    }

    public void LastRemove(){
        linkedlist.removeLast();
    }

    public void Modify() throws IOException{
        System.out.println("Enter the Task Number You Want To Replace");
        replace = Integer.parseInt(br.readLine());
        System.out.println("Add New Task");
        update = br.readLine();
        linkedlist.remove(replace);
        linkedlist.add(update);
        menu();
    }

    public void Print() throws IOException{
        System.out.println("Your Tasks Are:");
        for (String str : linkedlist){
            System.out.println(str);
        }
    }



}



public class ToDo {
    public static void main(String[] args) throws IOException {
        UserChoice uc = new UserChoice();
        uc.menu();

    }

}
