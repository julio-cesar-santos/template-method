public abstract class ProcessadorTexto {

    // O "Template Method" define o esqueleto do algoritmo.
    // É declarado como 'final' para impedir que subclasses alterem a ordem dos passos.
    public final String processar(String texto) {
        if (texto == null) return null;

        // 1. Extrair (Comum)
        char[] chars = extrairCaracteres(texto);

        // 2. Converter (Variável - implementado pelas subclasses)
        char[] charsProcessados = converterCaracteres(chars);

        // 3. Juntar (Comum)
        return juntarCaracteres(charsProcessados);
    }

    // Passo concreto: Extração dos caracteres (Passo 4 implementado aqui)
    private char[] extrairCaracteres(String texto) {
        System.out.println("[Base] Extraindo caracteres...");
        return texto.toCharArray();
    }

    // Passo concreto: Junção dos caracteres (Passo 4 implementado aqui)
    private String juntarCaracteres(char[] chars) {
        System.out.println("[Base] Juntando caracteres em String...");
        return new String(chars);
    }

    // Passo abstrato: Deve ser implementado pelas subclasses
    protected abstract char[] converterCaracteres(char[] chars);
}