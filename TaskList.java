import java.util.PriorityQueue;

public class TaskList {
	PriorityQueue<Task> primaryList = new PriorityQueue<>();

	void addTask(String name) {
		Task t = new Task(name);
		this.primaryList.add(t);
	}
	
	void markDone() {}
}
