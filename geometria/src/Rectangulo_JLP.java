/**
 * 
 * @author Jonathan lopez pastor 
 *@version 1.2
 *
 */
public class Rectangulo_JLP extends FiguraGeometrica_JLP {
	private double l1;
	private double l2;
	/**
	 * le da nuevos valores
	 * @param tipoFigura le pasas el String
	 * @param lG valor que le pasas
	 * @param lP valor que le pasas
	 */
	public Rectangulo_JLP(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * devuelve el resultado del area
	 */
	@Override
	
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * devuelve el perimetro 
	 */
	@Override
	
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
