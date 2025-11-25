#Histórico de prompts

A IA utilizada para a realização desta atividade foi o Google Gemini 3 Pro

Quero que você resolva o seguinte problema aplicando corretamente o padrão de projeto Template Method, seguindo as etapas abaixo de maneira clara e organizada.

Os objetivos são unificar o comportamento comum dos processadores de texto, reduzir duplicação e demonstrar o funcionamento.
Tarefa
Você deve reestruturar duas classes existentes:

TudoMaiuscula
TudoMinuscula
Ambas realizam o mesmo processo geral:

Extrair caracteres do texto.
Converter caracteres (para MAIÚSCULO ou para minúsculo).
Juntar caracteres de volta em String.
O padrão Template Method deve ser aplicado para que:

As etapas extrair caracteres e juntar caracteres sejam implementadas na classe base.
A etapa converter caracteres seja implementada pelas subclasses, pois varia entre maiúsculo e minúsculo.
Passos que você deve seguir
Passo 1 — Criar classe abstrata base
Crie uma classe abstrata chamada ProcessadorTexto contendo:

Um método template público chamado processar(String texto) que:
Extrai caracteres
Converte caracteres (chama método abstrato)
Junta caracteres
Retorna o resultado final
Métodos concretos:
extrairCaracteres(String texto)
juntarCaracteres(char[] chars)
Um método abstrato:
converterCaracteres(char[] chars)

Esse método será especializado pelas subclasses.
Passo 2 — Ajustar TudoMaiuscula
Crie uma classe TudoMaiuscula que estende ProcessadorTexto e implementa:

converterCaracteres() para transformar cada char usando Character.toUpperCase().
Passo 3 — Ajustar TudoMinuscula
Crie uma classe TudoMinuscula que estende ProcessadorTexto e implementa:

converterCaracteres() usando Character.toLowerCase().
Passo 4 — Implementar métodos faltantes
Os métodos que estavam //TODO devem agora ser implementados na classe base:

Extrair String.toCharArray()
Juntar com new String(chars)
Passo 5 — Criar classe de demonstração
Crie uma classe TesteProcessamento com main() que:

Cria instância de TudoMaiuscula
Cria instância de TudoMinuscula
Processa uma frase exemplo nas duas versões
Exibe o resultado no console
Passo 6 — Código final esperado
No fim, gere os códigos completos:

ProcessadorTexto.java
TudoMaiuscula.java
TudoMinuscula.java
TesteProcessamento.java
Observações importantes
Use nomes simples e diretos, pois o objetivo é apenas demonstrar o padrão.
Mantenha o template claro e fácil de entender.
Não esqueça de colocar mensagens de teste no console para visualizar o funcionamento.
Esse é o prompt completo que você deve seguir.

Resposta: 

Aqui está a solução completa para o problema proposto, aplicando o padrão de projeto **Template Method**.

O padrão foi utilizado para definir o esqueleto do algoritmo na classe pai (`ProcessadorTexto`), garantindo que a estrutura geral (extrair -\> converter -\> juntar) seja preservada, enquanto delega a implementação específica da conversão para as subclasses.

-----

### Passo 1: Classe Abstrata Base (`ProcessadorTexto.java`)

Esta classe define o **Template Method** (`processar`) e implementa os passos comuns que não variam.

```java
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
```

-----

### Passo 2: Subclasse Maiúscula (`TudoMaiuscula.java`)

Esta classe estende a base e fornece a implementação específica para converter para caixa alta.

```java
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
```

-----

### Passo 3: Subclasse Minúscula (`TudoMinuscula.java`)

Esta classe fornece a implementação específica para converter para caixa baixa.

```java
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
```

-----

### Passo 5: Classe de Demonstração (`TesteProcessamento.java`)

Esta classe executa o código e valida o funcionamento do padrão.

```java
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
```

-----

### Resultado Esperado no Console

Ao rodar a classe `TesteProcessamento`, a saída demonstrará a reutilização de código da classe base e a especialização das subclasses:

```text
--- Teste 1: Tudo Maiúsculo ---
[Base] Extraindo caracteres...
[TudoMaiuscula] Convertendo para UPPERCASE...
[Base] Juntando caracteres em String...
Resultado: O PADRÃO TEMPLATE METHOD É ÚTIL

--- Teste 2: Tudo Minúsculo ---
[Base] Extraindo caracteres...
[TudoMinuscula] Convertendo para lowercase...
[Base] Juntando caracteres em String...
Resultado: o padrão template method é útil
```

-----

### Resumo das Melhorias

  * **Redução de Duplicação:** A lógica de transformar String em Array e Array em String agora reside em um único lugar (`ProcessadorTexto`).
  * **Extensibilidade:** Se você quiser criar um processador "TudoInvertido" (Reverse), basta estender a classe base e implementar apenas o método `converterCaracteres`.
  * **Controle:** A classe base controla o fluxo (o *como* os passos são orquestrados) através do método `processar`.

Gostaria que eu criasse mais uma variação (por exemplo, um Inversor de Texto) para testar a flexibilidade dessa estrutura?
