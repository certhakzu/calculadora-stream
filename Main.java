import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Double> operandos1 = List.of(20.0, 10.0, 30.0);
        List<Double> operandos2 = List.of(10.0, 5.0, 2.0);

        List<Double> sumas = new ArrayList<>();
        List<Double> restas = new ArrayList<>();
        List<Double> multiplicaciones = new ArrayList<>();
        List<Double> divisiones = new ArrayList<>();

        Integer indice = 0;

        sumas = operandos1.stream()
                .map(valor -> valor + operandos2.get(operandos1.lastIndexOf(valor))).collect(Collectors.toList());
        System.out.println(sumas);

        restas = operandos1.stream()
                .map(valor -> valor - operandos2.get(operandos1.lastIndexOf(valor))).collect(Collectors.toList());
        System.out.println(restas);

        multiplicaciones = operandos1.stream()
                .map(valor -> valor * operandos2.get(operandos1.lastIndexOf(valor))).collect(Collectors.toList());
        System.out.println(multiplicaciones);

        divisiones = operandos1.stream()
                .map(valor -> valor / operandos2.get(operandos1.lastIndexOf(valor))).collect(Collectors.toList());
        System.out.println(divisiones);
    }
}
