import java.util.ArrayList;
import java.util.List;

public class Notebook {
	
	public List<Task> taskCollection = new ArrayList<Task>();
	
	public void addTask(Task obj) { 
		taskCollection.add(obj);
	 }

	public void removeTask(Task obj) { 
		taskCollection.remove(obj);
	 }

	public void showNotebook() { 
		for (Task task : taskCollection) {
			task.showInfoTask();
		}
	 }

}