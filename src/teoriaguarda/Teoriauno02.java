package teoriaguarda;



public class Teoriauno02 {
	public double areaCirculo(float radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	public double areaCirculoDefensive(float radius) {
		if (radius >= 0)
			return Math.PI * Math.pow(radius, 2);
		return -1;
	}

	public boolean areYouEven(float value) {
		return value % 2 == 0;
	}

	public boolean areYouEvenDefensive(float value) {
		if (value % 1 == 0)
			return value % 2 == 0;
		return false;
	}

	

	public static void main(String[] args) {
		Teoriauno02 teoriauno = new Teoriauno02();
	}
}
