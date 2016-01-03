public class TaskCreator {
		
	public Task createTask(String taskName, int day, int month, int year, String taskDecription) {
		
		return new Task(taskName, day, month, year, taskDecription);
	} 
	
	public void deleteTask(Task obj) { 
		obj.setTaskDate(0, 0, 0);
		obj.setTaskDecription(null);
		obj.setTaskName(null);
	}

	

}