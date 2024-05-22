package CodeExamples.Behavioral.Command.iterator;

import CodeExamples.Behavioral.Command.widgets.UIComponent;

public interface UIIterator {
	UIComponent getNext();
	boolean hasMore();
	

}
