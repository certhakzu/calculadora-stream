import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {

    public static final Logger logger = Logger.getLogger(String.valueOf(Main.class));


    public static void main(String[] args) {

        List<Double> operandos1 = List.of(20.0, 10.0, 30.0);
        List<Double> operandos2 = List.of(10.0, 5.0, 2.0);

        List<Double> sumas = new ArrayList<>();
        List<Double> restas = new ArrayList<>();
        List<Double> multiplicaciones = new ArrayList<>();
        List<Double> divisiones = new ArrayList<>();


        sumas = sumar(operandos1, operandos2);
        logger.log(Level.INFO, "Suma = " + sumas);

        restas = restar(operandos1, operandos2);
        logger.log(Level.INFO, "Resta = " + restas);

        multiplicaciones = multiplicar(operandos1, operandos2);
        logger.log(Level.INFO, "Multiplicacion = " + multiplicaciones);

        divisiones = dividir(operandos1, operandos2);
        logger.log(Level.INFO, "Division = " + divisiones);
    }

    private static List<Double> sumar(List<Double> array1, List<Double> arra2){
        return array1.stream()
                .map(valor -> valor + arra2.get(array1.lastIndexOf(valor)))
                .collect(Collectors.toList());
    }

    private static List<Double> restar(List<Double> array1, List<Double> arra2){
        return array1.stream()
                .map(valor -> valor - arra2.get(array1.lastIndexOf(valor)))
                .collect(Collectors.toList());
    }

    private static List<Double> multiplicar(List<Double> array1, List<Double> arra2){
        return array1.stream()
                .map(valor -> valor * arra2.get(array1.lastIndexOf(valor)))
                .collect(Collectors.toList());
    }

    private static List<Double> dividir(List<Double> array1, List<Double> arra2){
        return array1.stream()
                .map(valor -> valor / (arra2.get(array1.lastIndexOf(valor))))
                .collect(Collectors.toList());
    }
}
