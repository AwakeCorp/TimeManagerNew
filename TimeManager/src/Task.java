

public class Task {
	public String taskDecription; 
	public String taskName;
	public String taskDate;

	Task(String taskName, String taskDate, String taskDecription){
		this.taskName = taskName;
		this.taskDate = taskDate;
		this.taskDecription = taskDecription;
	}

	public String getTaskDecription() {
	 	 return taskDecription; 
	}
	public void setTaskDecription(String taskDecription) { 
		 this.taskDecription = taskDecription; 
	}
	public String getTaskName() {
	 	 return taskName; 
	}
	public void setTaskName(String taskName) { 
		 this.taskName = taskName; 
	}
	public String getTaskDate() {
	 	 return taskDate; 
	}
	public void setTaskDate(String taskDate) { 
		 this.taskDate = taskDate; 
	} 
	
	public void showInfoTask(){
		System.out.println(this.getTaskName()+ " " + this.getTaskDate()+ " " + this.getTaskDecription());
	}

}