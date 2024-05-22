package CodeExamples.Structural.Bridge;

import CodeExamples.Structural.Bridge.platforms.Database;
import CodeExamples.Structural.Bridge.platforms.MicrosoftSQLDB;
import CodeExamples.Structural.Bridge.platforms.MySQLDB;
import CodeExamples.Structural.Bridge.ui.UserInterface;
import CodeExamples.Structural.Bridge.ui.AdminInterface;

public class Program {
	
	public static void main(String[] args) {
		/*	������� ��������� ���������� � ����� ������
		 *  ��������� ������ ����� �������� � ����� (��� �����)
		 *  ������ ��� ������ (���� ���������� - ���������) �
		 *  ����� ��� (��� �����) ���������������� ���������� 
		 *  (���������������� � ����������������) ������������
		 *  ���������� �� ���� ������. 
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
