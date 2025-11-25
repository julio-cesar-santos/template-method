public class TesteProcessamento {
    public static void main(String[] args) {
        String fraseOriginal = "O Padrão Template Method é Útil";

        System.out.println("--- Teste 1: Tudo Maiúsculo ---");
        ProcessadorTexto processadorMaiusculo = new TudoMaiuscula();
        String resultadoMaiusculo = processadorMaiusculo.processar(fraseOriginal);
        System.out.println("Resultado: " + resultadoMaiusculo);

        System.out.println("\n--- Teste 2: Tudo Minúsculo ---");
        ProcessadorTexto processadorMinusculo = new TudoMinuscula();
        String resultadoMinusculo = processadorMinusculo.processar(fraseOriginal);
        System.out.println("Resultado: " + resultadoMinusculo);
    }
}