
public class FacadeApp {
	
	public void qwerty(){
		TaskCreator taskCreator = new TaskCreator();
		Notebook notebook = new Notebook();
		Task task1 = taskCreator.createTask("getMoney", 20, 00, 2016, "�������� ����� �� ������");
		Task task2 = taskCreator.createTask("PutinMod", 01, 01, 2016, "�������� ������ �� ������!!!");
		Task task3 = taskCreator.createTask("Kaka", 30, 11, 2015, "������� ������ � ���");
		
		notebook.addTask(task1);
		notebook.addTask(task2);
		notebook.addTask(task3);
		notebook.showNotebook();
	}
}
