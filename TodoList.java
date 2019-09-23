
public class TodoList extends ListAbstract{
	
	void addTask(String name) {
		Task t = new Task(name);
		this.primaryList.add(t);
	}
	
	void rmvTask(int idx) {
		//Task t = new Task(name);
		this.primaryList.remove(idx);
	}
	
}
