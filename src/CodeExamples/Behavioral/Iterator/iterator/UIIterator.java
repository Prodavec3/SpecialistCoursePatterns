package CodeExamples.Behavioral.Iterator.iterator;

import CodeExamples.Behavioral.Iterator.widgets.UIComponent;

public interface UIIterator {
	UIComponent getNext();
	boolean hasMore();
}
