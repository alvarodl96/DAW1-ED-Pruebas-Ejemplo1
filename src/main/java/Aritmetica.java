// José Antonio Muñoz Jiménez - Junio 2018

public class Aritmetica {

  public static int suma (int sumando1, int sumando2) {
        return (sumando1+sumando2);
  }

  public static int resta  (int minuendo, int sustraendo) {
        return (minuendo-sustraendo);
  }

  public static int multiplicacion (int  numero1, int numero2) {
        return (numero1*numero2);
  }

  public static float division (int dividendo, int divisor) {
        return (float)(dividendo/(float)divisor);
  }
  
  public static int potencia (double base, double exponente) {
	  return (int)Math.pow(base,exponente);
  }

}

