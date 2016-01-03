import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Task {
	private String taskDecription; 
	private String taskName;
	private Calendar taskDate;

	Task(String taskName, int day, int month, int year, String taskDecription){
		this.taskName = taskName;
		this.taskDate = Calendar.getInstance();		
		this.taskDate.set(year, month, day);
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
	public Calendar getTaskDate() {
	 	return taskDate; 
	}

	public void setTaskDate(int day, int month, int year) { 
		this.taskDate.set(year, month, day); 
	} 
	
	public void showInfoTask(){
		System.out.println(this.getTaskName() + " " +
							this.taskDate.get(Calendar.DATE)+"." +
							this.taskDate.get(Calendar.MONTH)+ "." + 
							this.taskDate.get(Calendar.YEAR) + " " + 
							this.getTaskDecription());
	}

}