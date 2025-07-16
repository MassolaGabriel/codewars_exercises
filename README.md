# Repositório de Exercícios Codewars

Este repositório compila as soluções desenvolvidas para diversos desafios de programação obtidos na plataforma [Codewars](https://www.codewars.com/). Os exercícios estão categorizados por linguagem de programação e nível de dificuldade, conforme o sistema "Kyu".

## Conceituação do Codewars e Níveis de Dificuldade (Kyu)

Codewars constitui uma plataforma educacional projetada para aprimorar as habilidades de programação de desenvolvedores por meio de desafios de codificação denominados "Katas". A complexidade de um Kata é classificada utilizando um sistema hierárquico composto por "Kyu" e "Dan".

* **Kyu (級 - Classe/Grau):** Esta classificação denota a dificuldade para programadores iniciantes e de nível intermediário. Inversamente proporcional ao número Kyu, a facilidade do Kata é maior.

  * <span style="background-color: #DC143C; color: white; padding: 2px 5px; border-radius: 3px; font-weight: bold;">1 Kyu:</span> Representa o nível de dificuldade mais elevado antes da transição para as classificações Dan.

  * <span style="background-color: #FF4500; color: white; padding: 2px 5px; border-radius: 3px; font-weight: bold;">2 Kyu:</span> Desafios de alta complexidade que exigem um conhecimento aprofundado e a aplicação de técnicas avançadas.

  * <span style="background-color: #FF6347; color: white; padding: 2px 5px; border-radius: 3px; font-weight: bold;">3 Kyu:</span> Katas intrincados que avaliam a capacidade de resolução de problemas e o design de algoritmos.

  * <span style="background-color: #FFA500; color: black; padding: 2px 5px; border-radius: 3px; font-weight: bold;">4 Kyu:</span> Problemas que demandam otimização e a formulação de soluções mais eficientes.

  * <span style="background-color: #FFD700; color: black; padding: 2px 5px; border-radius: 3px; font-weight: bold;">5 Kyu:</span> Desafios que requerem uma compreensão sólida de algoritmos e estruturas de dados.

  * <span style="background-color: #90EE90; color: black; padding: 2px 5px; border-radius: 3px; font-weight: bold;">6 Kyu:</span> Nível intermediário, introduzindo conceitos mais avançados e estruturas de dados diversificadas.

  * <span style="background-color: #87CEEB; color: black; padding: 2px 5px; border-radius: 3px; font-weight: bold;">7 Kyu:</span> Ainda direcionado a iniciantes, porém com desafios ligeiramente mais elaborados.

  * <span style="background-color: #ADD8E6; color: black; padding: 2px 5px; border-radius: 3px; font-weight: bold;">8 Kyu:</span> O nível de dificuldade mais acessível, ideal para aqueles que estão iniciando seus estudos em uma linguagem de programação.

* **Dan (段 - Nível/Etapa):** Após a conclusão do 1 Kyu, os níveis de dificuldade progridem para as classificações Dan (e.g., 1 Dan, 2 Dan), as quais simbolizam maestria e apresentam um grau de desafio significativamente superior.

## Requisitos de Execução dos Exercícios

Para compilar e executar os exercícios contidos neste repositório, é necessário dispor dos seguintes componentes:

* **Java Development Kit (JDK):** A maioria dos exercícios presentes neste repositório foi desenvolvida em Java. É imprescindível que o JDK esteja instalado em seu ambiente. O download pode ser realizado no [site oficial da Oracle](https://www.oracle.com/java/technologies/downloads/) ou através de gerenciadores de pacotes como `sdkman` ou `brew`.

  Para verificar a versão do JDK instalada, execute os seguintes comandos:

  ```bash
  java -version
  javac -version
  ```

* **Ambiente de Desenvolvimento Integrado (IDE) ou Editor de Texto:** Embora não seja um requisito mandatório, a utilização de uma IDE como IntelliJ IDEA, Eclipse ou VS Code, com as extensões Java apropriadas, pode otimizar substancialmente os processos de compilação e execução dos arquivos.

## Estrutura do Projeto

Os exercícios são tipicamente organizados em diretórios que correspondem ao nível Kyu e, em alguns casos, ao nome específico do Kata.

```
.
├── kyu8
│   └── somaMultiplos
│       └── SomadeMultiplos.java
└── kyu7
    └── ...
```

## Procedimento de Execução de um Exercício (Exemplo Java)

Cada arquivo `.java` encapsula a solução para um Kata específico. Para testar um exercício localmente, é possível compilá-lo e executá-lo via linha de comando ou utilizando sua IDE.

**Exemplo: `SomadeMultiplos.java`**

Este arquivo representa um exemplo de Kata classificado como 8 Kyu.

```java
package kyu8.somaMultiplos;

public class SomadeMultiplos {
    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException("O valor N e M deve ser maior que 0");
        }

        long sum = 0;

        for (int i = n; i <= m; i += n) {
            sum += i;
        }
        return sum;
    }
}
```

Para compilar e executar este arquivo (assumindo que o diretório atual seja `kyu8/somaMultiplos`):

1. **Compilação:**

   ```bash
   javac SomadeMultiplos.java
   ```

2. **Execução (para validação da lógica, a inclusão de um método `main` ou a utilização de um framework de teste seria necessária):**
   No contexto do Codewars, a submissão da função é realizada para ser testada contra casos de teste predefinidos. Para testes locais, pode-se inserir um método `main` temporário:

   ```java
   package kyu8.somaMultiplos;

   public class SomadeMultiplos {
       public static long sumMul(int n, int m) {
           if (n <= 0 || m <= 0) {
               throw new IllegalArgumentException("O valor N e M deve ser maior que 0");
           }

           long sum = 0;

           for (int i = n; i <= m; i += n) {
               sum += i;
           }
           return sum;
       }

       public static void main(String[] args) {
           // Exemplo de uso para teste local
           System.out.println("sumMul(2, 9): " + sumMul(2, 9)); // Resultado esperado: 2+4+6+8 = 20
           System.out.println("sumMul(3, 10): " + sumMul(3, 10)); // Resultado esperado: 3+6+9 = 18
       }
   }
   ```

   Subsequentemente, a compilação e execução podem ser realizadas:

   ```bash
   javac SomadeMultiplos.java
   java kyu8.somaMultiplos.SomadeMultiplos
   ```

## Contribuições

Incentiva-se a exploração das soluções existentes e a proposição de aprimoramentos. Caso possua soluções alternativas ou deseje adicionar um Kata, solicita-se a abertura de um *pull request*.
