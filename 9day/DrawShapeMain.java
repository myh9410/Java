package extendsex;

import java.awt.Frame;
import java.awt.Graphics;


class Point{
	int x,y;
	
	public Point(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
}

class Circle{
	Point center;	//포함	Circle has a Point
	int radius;
	public Circle(Point center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}
}

class Triangle{
	Point p1,p2,p3;	//포함 Triangle has a Point

	public Triangle(Point p1, Point p2, Point p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
}

public class DrawShapeMain extends Frame{

	public DrawShapeMain() {
		super("내가 그린 도형");
		setBounds(850, 200, 400, 400);//setSize+setLocation
		setVisible(true);
	}
	
	@Override	//콜백 메서드,	일정 조건이 성립되면 명시적인 호출이 없어도 자동 수행된다.
	public void paint(Graphics g) {
		Point p1 = new Point(50,100);
		Point p2 = new Point(350,100);
		Point p3 = new Point(200,300);
		
		Triangle tri = new Triangle(p1, p2, p3);
		
		
//		g.drawLine(50, 100, 350, 100);
//		g.drawLine(50, 100, 200, 300);
//		g.drawLine(200, 300, 350, 100);

		g.drawLine(tri.p1.x, tri.p1.y, tri.p2.x, tri.p2.y);
		g.drawLine(tri.p1.x, tri.p1.y, tri.p3.x, tri.p3.y);
		g.drawLine(tri.p3.x, tri.p3.y, tri.p2.x, tri.p2.y);
		
		Circle cen = new Circle(new Point(70, 50), 140);
		// cen -> center.x	cen -> center.x	cen->radius
		g.drawOval(cen.center.x, cen.center.y, cen.radius, cen.radius);
		
		
		
		
		
//		for (int i =0; i<20; i++){
//			g.drawLine(50+i, 100+i, 350+i, 100+i);
//			g.drawLine(50+i, 100+i, 200+i, 300+i);
//			g.drawLine(200+i, 300+i, 350+i, 100+i);
//			try{
//				Thread.sleep(200);
//			}catch(Exception e){}
//		}
	}
	public static void main(String[] args) {
		new DrawShapeMain(); 
	}

}
