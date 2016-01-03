

public class TaskCreator {
	
	public Task createTask(String taskName, String taskDate, String taskDecription) { 
		return new Task(taskName, taskDate, taskDecription);
	 }
	
	public void deleteTask(Task obj) { 
		obj.taskDate = null;
		obj.taskDecription = null;
		obj.taskName = null;
	} 

}