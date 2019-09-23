
public class Task {
	String name ;
	String line ="   ----------   ";
	boolean done = false;
	Task(String name){
		this.name = name;
	}
	
	public String toString() {
		return name + line + this.done+'\n';
	}
	
	void markDone() {
		this.done = true;
	}
	
	void markUndone() {
		this.done = false;
	}
}
