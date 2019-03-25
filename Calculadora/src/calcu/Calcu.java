package calcu;

public class Calcu {

public double sumar (double a, double b) {
	return a+b;

}
public double resta (double a, double b) {
	return a-b;

}
public double multiplicar (double a, double b) {
	return a*b;

}
public String dividir (String a, String b) {
	String respuesta = "";
	try {
		respuesta = (Double.parseDouble(a)/ Double.parseDouble(b))+"";
}
	catch (Exception e) {
		respuesta ="Error al dividir por cero";
}
return respuesta;

}
}