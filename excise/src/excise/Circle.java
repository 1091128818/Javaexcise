package excise;

class Circle {
	private double radius;
	public static String name="����һ��Բ";
	public static String getName() {
		return name;
	}
	public Circle(double radius) {
		getName();
		this.radius=radius;
	}
	public double findArea() {
		return Math.PI*radius*radius;
		}
		public void display() {
			System.out.println("name:"+name+"radius:"+radius);
		}
		
	}

