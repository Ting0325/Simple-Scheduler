import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		int removeIdx,selIdx;
		String action, taskName;
		while(true) {
			System.out.println("choose action (add/show)");
			action = sc.next();
			switch(action) {
			case "add":	
						System.out.println("add task");
						taskName = sc.next();
						Task task = new Task(taskName);
						todoList.addTask(taskName);
						break;
			case "show":
						System.out.println(todoList.primaryList);
						break;
			case "remove":
						System.out.println("remove idx");
						removeIdx = sc.nextInt();
						todoList.rmvTask(removeIdx);
						break;
			case "select":
						System.out.println("select idx");
						selIdx = sc.nextInt();
						break;
			case "mark done":
						System.out.println("select idx");
						selIdx = sc.nextInt();
						todoList.primaryList.get(selIdx).markDone();
						break;
			default:	System.out.println("no such command");
						break;
			}
		}
	}
}
