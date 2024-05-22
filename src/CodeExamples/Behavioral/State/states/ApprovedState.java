package CodeExamples.Behavioral.State.states;

import CodeExamples.Behavioral.State.documents.Document;

public class ApprovedState extends State {

	public ApprovedState(Document doc) {
		super(doc);
	}

	@Override
	public String toString() {
		return "Approved";
	}

}
