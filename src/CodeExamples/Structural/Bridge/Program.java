package CodeExamples.Structural.Bridge;

import CodeExamples.Structural.Bridge.platforms.Database;
import CodeExamples.Structural.Bridge.platforms.MicrosoftSQLDB;
import CodeExamples.Structural.Bridge.platforms.MySQLDB;
import CodeExamples.Structural.Bridge.ui.UserInterface;
import CodeExamples.Structural.Bridge.ui.AdminInterface;

public class Program {
	
	public static void main(String[] args) {
		/*	Создать программу работающую с базой данных
		 *  Программа должна уметь работать с двумя (или более)
		 *  видами баз данных (слои реализации - платформы) и
		 *  иметь два (или более) пользовательских интерфейса 
		 *  (административный и пользовательский) отображающих
		 *  информацию из базы данных. 
		 */
		{
			Database db = new MicrosoftSQLDB();
			UserInterface ui = new UserInterface(db);
			
			ui.login("Sergey");
			ui.drawInterface();
		}
		{
			Database db = new MicrosoftSQLDB();
			UserInterface ui = new AdminInterface(db);
			
			ui.login("Sergey");
			ui.drawInterface();
		}
		{
			Database db = new MySQLDB();
			UserInterface ui = new UserInterface(db);
			
			ui.login("Sergey");
			ui.drawInterface();
		}
		{
			Database db = new MySQLDB();
			UserInterface ui = new AdminInterface(db);
			
			ui.login("Sergey");
			ui.drawInterface();
		}

	}

}
