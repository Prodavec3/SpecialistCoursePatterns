package CodeExamples.Behavioral.Command.commands;

import CodeExamples.Behavioral.Command.logic.LogicFactory;

// ������� ��� ����������
public class VerifyCommand extends Command{

	@Override
	public void execute() {
		LogicFactory.instance.createVerifier().verify();
	}

}
