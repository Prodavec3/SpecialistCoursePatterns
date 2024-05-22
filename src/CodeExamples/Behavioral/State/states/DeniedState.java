package CodeExamples.Behavioral.State.states;

import CodeExamples.Behavioral.State.documents.Document;

public class DeniedState extends State{

	public DeniedState(Document doc) {
		super(doc);
	}


	@Override
	public String toString() {
		return "Denied";
	}

}
