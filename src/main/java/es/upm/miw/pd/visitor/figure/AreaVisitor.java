package es.upm.miw.pd.visitor.figure;

public class AreaVisitor extends Visitor {

	@Override
	public double visitTriangle(Triangle triangle) {
		return triangle.getBase() * triangle.getHeight() * 0.5;
	}

	@Override
	public double visitCircle(Circle circle) {
		return Math.PI * circle.getRadius() * circle.getRadius();
	}

	@Override
	public double visitSquare(Square circle) {
		return circle.getSide() * circle.getSide();
	}

}