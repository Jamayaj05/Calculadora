public double multiplicacion (double a, double b){
    return a*b;
}

public double potencia(double numero, int exponente) {
    if (exponente < 0) {
        double resultadoPositivo = potencia(numero, -exponente);
        return 1 / resultadoPositivo;
    }if else (exponente == 0) {
        return 1;
    }

    double total = 1;
    for (int i = 0; i < exponente; i++) {
        total *= numero;
    }
    return total;
}