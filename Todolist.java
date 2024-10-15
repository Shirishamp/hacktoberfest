import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> tasks;
    private Scanner scanner;

    public TodoList() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("=== To-Do List Menu ===");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Remove Task");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    public void addTask() {
        System.out.print("Enter task description: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("=== Your Tasks ===");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void removeTask() {
        viewTasks();
        if (tasks.isEmpty()) return;

        System.out.print("Enter task number to remove: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline

        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);
            System.out.println("Removed task: " + removedTask);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void run() {
        while (true) {
            showMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.run();
    }
}
