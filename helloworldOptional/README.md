# Assignment 1 --- Hello Kotlin. Hello Mobile Android World!

Course: Computação Móvel\
Student(s): Dinis Simão\
Date: 2026\
Repository URL: https://github.com/dinis6045/Trabalho-1-todos

------------------------------------------------------------------------

# 1. Introduction

Este trabalho tem como objetivo introduzir o desenvolvimento de
aplicações móveis Android utilizando a linguagem **Kotlin** e o ambiente
de desenvolvimento **Android Studio**.

O principal propósito deste assignment é compreender os conceitos
fundamentais do desenvolvimento Android, incluindo:

-   Estrutura de um projeto Android
-   Utilização de Kotlin como linguagem principal
-   Construção de interfaces gráficas com XML Views
-   Execução da aplicação em emuladores Android

A aplicação desenvolvida neste tutorial consiste numa aplicação simples
que demonstra os conceitos básicos necessários para iniciar o
desenvolvimento de aplicações móveis.

------------------------------------------------------------------------

# 2. System Overview

A aplicação desenvolvida é uma aplicação Android simples cujo objetivo é
demonstrar:

-   Estrutura básica de uma aplicação Android
-   Ligação entre interface gráfica (XML) e lógica da aplicação (Kotlin)
-   Execução da aplicação num dispositivo virtual Android

Principais funcionalidades:

-   Apresentar informação no ecrã através de TextView
-   Executar código Kotlin associado à Activity principal
-   Demonstrar o funcionamento de uma aplicação Android básica

------------------------------------------------------------------------

# 3. Architecture and Design

A arquitetura da aplicação segue a estrutura padrão de projetos Android.

Componentes principais:

### Activity

A aplicação utiliza uma **MainActivity**, responsável por iniciar a
aplicação e controlar a interface.

### Layout XML

A interface gráfica é definida no ficheiro:

activity_main.xml

Este ficheiro contém os elementos visuais da aplicação como TextView e
layouts.

### Estrutura do Projeto

app\
├── java\
│ └── MainActivity.kt\
│\
├── res\
│ ├── layout\
│ │ └── activity_main.xml\
│ │\
│ ├── drawable\
│ │\
│ └── values\
│ └── strings.xml\
│\
└── AndroidManifest.xml

------------------------------------------------------------------------

# 4. Implementation

A implementação foi realizada utilizando:

-   Kotlin
-   Android Studio
-   XML Views

### MainActivity.kt

Classe principal responsável por iniciar a aplicação.

Exemplo simplificado:

``` kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
```

### Interface Gráfica

A interface foi criada com XML permitindo separar a lógica da
apresentação.

------------------------------------------------------------------------

# 5. Testing and Validation

A aplicação foi testada utilizando o Android Emulator.

Testes realizados:

  Teste                            Resultado
  -------------------------------- -----------
  Aplicação inicia                 OK
  Interface aparece corretamente   OK
  Código executa sem erros         OK

Limitações:

-   Aplicação simples
-   Apenas demonstra conceitos básicos

------------------------------------------------------------------------

# 6. Usage Instructions

Requisitos:

-   Android Studio
-   JDK instalado
-   Android SDK

Passos:

1.  Clonar repositório
2.  Abrir projeto no Android Studio
3.  Sincronizar Gradle
4.  Executar aplicação no emulador

------------------------------------------------------------------------

# 7. Prompting Strategy

Ferramentas de IA foram utilizadas para apoio durante o desenvolvimento.

Exemplos de prompts utilizados:

-   How to create a basic Android app using Kotlin
-   How to connect XML layout with Kotlin code
-   Create README structure for mobile application

------------------------------------------------------------------------

# 8. Autonomous Agent Workflow

Processo seguido:

1.  Planeamento
2.  Criação do projeto
3.  Desenvolvimento da Activity
4.  Construção da interface
5.  Testes
6.  Documentação

------------------------------------------------------------------------

# 9. Verification of AI-Generated Artifacts

Todo o código foi verificado manualmente através de:

-   Compilação no Android Studio
-   Testes no emulador
-   Revisão manual

------------------------------------------------------------------------

# 10. Human vs AI Contribution

Contribuição humana:

-   Criação do projeto
-   Implementação
-   Testes
-   Publicação no GitHub

Contribuição da IA:

-   Apoio na escrita do relatório
-   Sugestões de código
-   Explicação de conceitos

------------------------------------------------------------------------

# 11. Ethical and Responsible Use

A utilização de ferramentas de IA foi feita apenas como suporte ao
desenvolvimento.

Todo o conteúdo foi verificado e validado antes da entrega.

------------------------------------------------------------------------

# 12. Version Control and Commit History

O controlo de versões foi realizado com Git e GitHub.

Foram realizados commits ao longo do desenvolvimento para guardar o
progresso.

------------------------------------------------------------------------

# 13. Difficulties and Lessons Learned

Principais dificuldades:

-   Estrutura de projetos Android
-   Configuração do emulador
-   Ligação XML e Kotlin

Competências adquiridas:

-   Desenvolvimento Android básico
-   Utilização de Kotlin
-   Uso de GitHub

------------------------------------------------------------------------

# 14. Future Improvements

Melhorias futuras:

-   Interface gráfica mais avançada
-   Navegação entre Activities
-   Integração com bases de dados
-   Melhor design

------------------------------------------------------------------------

# 15. AI Usage Disclosure

Ferramentas utilizadas:

-   ChatGPT

Utilização:

-   Explicação de conceitos
-   Sugestões de código
-   Apoio na documentação

O autor mantém total responsabilidade pelo conteúdo final.
