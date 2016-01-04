import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Notebook {
	private String nameNotebook;	
	private List<Task> taskCollection = new ArrayList<Task>();
	
	public Notebook() {
		nameNotebook = "My notebook";
	}
	
	public void addTask(Task obj) { 
		taskCollection.add(obj);
	 }

	public void removeTask(Task obj) { 
		taskCollection.remove(obj);
	 }

	public void showNotebook() { 
		System.out.println(this.getNameNotebook());
		for (Task task : taskCollection) {
			System.out.print(taskCollection.indexOf(task) + 1 + ") ");
			task.showInfoTask();
		}
	 }

	public String getNameNotebook() {
		return nameNotebook;
	}

	public void setNameNotebook(String nameNotebook) {
		this.nameNotebook = nameNotebook;	
	}
	
	public void sortingNotebook(){
		
	}
}