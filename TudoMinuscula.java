public class TudoMinuscula extends ProcessadorTexto {

    @Override
    protected char[] converterCaracteres(char[] chars) {
        System.out.println("[TudoMinuscula] Convertendo para lowercase...");
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
        return chars;
    }
}