import java.util.ArrayList;
import java.util.PriorityQueue;

public abstract class ListAbstract {
	TskComparator tskComparator = new TskComparator();
	ArrayList<Task> primaryList = new ArrayList<Task>();
	//PriorityQueue<Task> primaryList = new PriorityQueue<>(tskComparator);

}
