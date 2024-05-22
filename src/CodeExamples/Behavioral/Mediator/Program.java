package CodeExamples.Behavioral.Mediator;

import CodeExamples.Behavioral.Mediator.controllers.WinController;
import static CodeExamples.Behavioral.Mediator.tests.User.verifyButton;

public class Program {

	public static void main(String[] args) {
		
		new WinController().generateWindow().draw();
		
		verifyButton.press(); // иммитация нажатия

	}

}
