package CodeExamples.Structural.Facade;

import CodeExamples.Structural.Facade.facades.AppCreatorFacade;
import CodeExamples.Structural.Facade.facades.SimpleAppCreatorFacade;

public class Program {

	public static void main(String[] args) {
		
		AppCreatorFacade facade = new SimpleAppCreatorFacade();
		facade.showApp("Login", "@OK", "Password", "@Verify");

	}

}
