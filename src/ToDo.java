import java.util.LinkedList;
import java.io.*;

class UserChoice{
    int choice,size,item,replace;
    String update;
    char option;
    LinkedList<String> linkedlist = new LinkedList<String>();
    BufferedReader br ;

    public void menu()throws IOException {
        do {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Press 1 To Add Task");
            System.out.println("Press 2 To Remove Task");
            System.out.println("Press 3 To Modify Task");
            System.out.println("Press 4 To Print Task");
            choice = Integer.parseInt(br.readLine());
            logic();
            System.out.println("Do you want to continue");
            option=(char) br.read();
        }
        while (option=='y'||option=='Y');
        menu();
    }

    public void logic()throws IOException{
        switch (choice){
            case 1:
                Add();
                break;
            case 2:
                Remove();
                break;

            case 3:
                Modify();
                break;

            case 4:
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

    public void Remove() throws IOException{
        System.out.println("Which Task You Want The Remove");
        item = Integer.parseInt(br.readLine());
        linkedlist.remove(item);
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
        menu();
    }

}



public class ToDo {
    public static void main(String[] args) throws IOException {
        UserChoice uc = new UserChoice();
        uc.menu();

    }

}