# Tutorial 1 -- Hello Kotlin. Hello Mobile Android World!

## Course

Computação Móvel

## Student(s)

Dinis Simão

## Repository URL

https://github.com/dinis6045/Trabalho-1-todos

------------------------------------------------------------------------

# 1. Introduction

Este trabalho teve como objetivo introduzir os conceitos básicos do
desenvolvimento de aplicações móveis utilizando Kotlin e Android Studio.

A aplicação desenvolvida é uma aplicação simples do tipo Hello World,
cuja finalidade é demonstrar o funcionamento básico de uma aplicação
Android.

------------------------------------------------------------------------

# 2. System Overview

A aplicação consiste numa interface simples que apresenta informação ao
utilizador.

Principais características: - Interface gráfica simples - Utilização de
TextView - Aplicação desenvolvida em Kotlin - Layout criado com XML -
Execução em Android Emulator

------------------------------------------------------------------------

# 3. Architecture and Design

Estrutura principal do projeto:

Project │ ├── MainActivity.kt │ ├── res │ ├── layout │ │ └──
activity_main.xml │ │ │ └── values │ └── strings.xml │ └──
AndroidManifest.xml

------------------------------------------------------------------------

# 4. Implementation

A implementação foi realizada utilizando Kotlin para a lógica da
aplicação e XML para a interface gráfica.

Exemplo de código:

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}

------------------------------------------------------------------------

# 5. Testing and Validation

A aplicação foi testada utilizando o Android Emulator (Pixel 9 Pro).

Procedimentos: 1. Compilação da aplicação 2. Execução no emulador 3.
Verificação da interface

Resultado: a aplicação executou corretamente.

------------------------------------------------------------------------

# 6. Usage Instructions

Para executar o projeto:

1.  Abrir o Android Studio
2.  Abrir o projeto
3.  Selecionar um emulador
4.  Clicar em Run

------------------------------------------------------------------------

# 7. Prompting Strategy

Foram utilizadas ferramentas de IA para auxiliar na geração de exemplos
de código e resolução de erros.

------------------------------------------------------------------------

# 8. Autonomous Agent Workflow

Ferramentas de IA auxiliaram na geração de código, explicação de erros e
melhoria da estrutura do projeto.

------------------------------------------------------------------------

# 9. Verification of AI-Generated Artifacts

Todo o código gerado com apoio de IA foi revisto e testado manualmente.

------------------------------------------------------------------------

# 10. Human vs AI Contribution

Humano: - criação do projeto - testes - execução

IA: - ajuda na geração de código - explicação de erros

------------------------------------------------------------------------

# 11. Ethical and Responsible Use

O estudante verificou todo o código antes da entrega do trabalho.

------------------------------------------------------------------------

# Development Process

1.  Criação do projeto
2.  Implementação da interface
3.  Implementação da lógica
4.  Testes
5.  Publicação no GitHub

------------------------------------------------------------------------

# 12. Version Control and Commit History

O projeto foi versionado utilizando Git e armazenado no GitHub.

------------------------------------------------------------------------

# 13. Difficulties and Lessons Learned

Dificuldades: - configuração inicial do Android Studio - execução no
emulador

Aprendizagens: - estrutura de aplicações Android - utilização de Kotlin

------------------------------------------------------------------------

# 14. Future Improvements

-   melhorar interface
-   adicionar novas funcionalidades
-   adicionar navegação entre ecrãs

------------------------------------------------------------------------

# 15. AI Usage Disclosure

Este trabalho utilizou ferramentas de IA (ChatGPT, Copilot) como apoio
ao desenvolvimento. Todo o código foi revisto e validado pelo estudante.
