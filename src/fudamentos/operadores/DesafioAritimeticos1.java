package fudamentos.operadores;

public class DesafioAritimeticos1 {
    public static void main(String[] args) {
        double parteA = (6*(3+2));
        double parteAExpoente = Math.pow(parteA,2);
        double parteB = (3*2);
        double parteAB = parteAExpoente/parteB;

        double parteC =((1-5)*(2-7));
        double parteCDivisao = parteC / 2;
        double parteCExpoente = Math.pow(parteCDivisao, 2);
        double contaD = parteAB - parteAExpoente;
        double contaDExpoente = Math.pow(contaD, 3);
        double divisor = Math.pow(10,3);

        double resultadoFinal = contaDExpoente/divisor;
        System.out.println(resultadoFinal);
    }
}
