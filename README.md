Resposta da quinta questão da Lista Avaliativa II da disciplina Padrões de Objeto relativo ao padrão Facade. 

Processador de Textos
Considere os dois processadores de texto abaixo. Um é responsável por converter todos os
caracteres do texto em maiúsculo:
public class TudoMaiuscula {
public static String converterTextoEmMaiusculo(String entrada) {
char[] caracteres = extrairCaracteres(entrada);
char[] caracateresAgoraMaisculos = converterCaracteresEmMaiusculo(caracteres);
String resultado = juntarCaractaresAgoraMaiusculo(caracateresAgoraMaisculos);
return resultado;
}
private static char[] extrairCaracteres(String texto) {
// TODO Auto-generated method stub
return null;
}
private static char[] converterCaracteresEmMaiusculo(char[] chars) {
// TODO Auto-generated method stub
return null;
}
private static String juntarCaractaresAgoraMaiusculo(char[] chars) {
// TODO Auto-generated method stub
return null;
}
}
E o outro é responsável por converter todos os caracteres em minúsculo:
public class TudoMinuscula {
public static String converterTextoEmMinusculo(String entrada) {
char[] caracteres = extrairCaracteres(entrada);
char[] caracateresAgoraMinusculos = converterCaracteresEmMinusculo(caracteres);
String resultado = juntarCaractaresAgoraMinusculo(caracateresAgoraMinusculos);
return resultado;
}
private static String juntarCaractaresAgoraMinusculo(char[] chars) {
// TODO Auto-generated method stub
return null;
}
private static char[] converterCaracteresEmMinusculo(char[] chars) {
// TODO Auto-generated method stub
return null;
}
private static char[] extrairCaracteres(String texto) {
// TODO Auto-generated method stub
return null;
}
}
Aplique o padrão Template Method para unificar e simplificar os códigos acima. É necessário
também implementar os métodos que foram intencionalmente deixados em branco, e
demonstrar o funcionamento de sua solução.
