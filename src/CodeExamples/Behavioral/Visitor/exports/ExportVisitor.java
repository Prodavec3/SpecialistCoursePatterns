package CodeExamples.Behavioral.Visitor.exports;

import CodeExamples.Behavioral.Visitor.graph.Circle;
import CodeExamples.Behavioral.Visitor.graph.Point;

public interface ExportVisitor {
	void exportPoint(Point p);
	void exportCircle(Circle c);

}
