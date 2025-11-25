public class TudoMaiuscula extends ProcessadorTexto {

    @Override
    protected char[] converterCaracteres(char[] chars) {
        System.out.println("[TudoMaiuscula] Convertendo para UPPERCASE...");
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
        return chars;
    }
}