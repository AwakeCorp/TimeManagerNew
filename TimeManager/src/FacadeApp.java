
public class FacadeApp {
	
	public void qwerty(){
		TaskCreator taskCreator = new TaskCreator();
		Notebook notebook = new Notebook();
		Task task1 = taskCreator.createTask("getMoney", "20.01.2016", "Получить бабло на работе");
		Task task2 = taskCreator.createTask("PutinMod", "01.02.2016", "Получить власть на работе!!!");
		notebook.addTask(task1);
		notebook.addTask(task2);
		notebook.showNotebook();
	}
}
