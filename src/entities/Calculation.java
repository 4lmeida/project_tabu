package entities;

public class Calculation {
	
	private Integer a;
	private Integer b;
	private Integer c;
	
	public Calculation() {
	}

	public Calculation(Integer a, Integer b, Integer c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public Integer getC() {
		return c;
	}

	public void setC(Integer c) {
		this.c = c;
	}
	
	public int total() {
		return a + b + c;
	}
	
	
	
}
