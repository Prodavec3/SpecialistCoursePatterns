package CodeExamples.Behavioral.Mediator.controllers;

import CodeExamples.Behavioral.Mediator.widgets.UIComponent;

public interface Mediator {
	void notify(UIComponent sender, String event);

}
