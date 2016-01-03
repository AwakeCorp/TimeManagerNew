
public class Main {

	public static void main(String[] args) {
		TaskCreator taskCreator = new TaskCreator();
		Task task1 = taskCreator.addTask("getMoney", "20.01.2016", "Получить бабло на работе");
		task1.showInfoTask();
		
	}

}