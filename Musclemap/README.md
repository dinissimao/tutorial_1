
# Tutorial 1 - Hello Kotlin. Hello Mobile Android World!

**Cadeira: Computação Móvel  
**Aluno(s):Dinis Simão
**Data:15/03/2026
**URL do Repositório:**  

---

## 1. Introdução
Este trabalho tem como objetivo o desenvolvimento de uma aplicação móvel simples para Android utilizando **Kotlin** e **XML Views**.

O principal propósito do projeto é compreender a estrutura de um projeto Android, configurar o ambiente de desenvolvimento no **Android Studio** e implementar uma aplicação móvel básica.

A aplicação desenvolvida, denominada **MuscleMap**, apresenta um pequeno catálogo de exercícios de ginásio. O utilizador pode visualizar uma lista de exercícios e selecionar um deles para abrir um ecrã com informação detalhada.

---

## 2. Visão Geral do Sistema
A aplicação **MuscleMap** foi concebida para apresentar exercícios de fitness através de uma interface móvel simples.

Principais funcionalidades:

- Apresentação de uma lista de exercícios
- Visualização da imagem e categoria do exercício
- Possibilidade de selecionar um exercício
- Abertura de um novo ecrã com informação detalhada

A aplicação utiliza componentes padrão do Android como **Activities**, **RecyclerView** e **Data Classes em Kotlin**.

---

## 3. Arquitetura e Design
A arquitetura da aplicação segue uma estrutura típica de aplicações Android.

Componentes principais:

- **MainActivity** – responsável por apresentar a lista de exercícios
- **Exercise (Data Class)** – representa o modelo de dados do exercício
- **ExerciseAdapter** – faz a ligação entre os dados e o RecyclerView
- **ExerciseDetailActivity** – apresenta os detalhes do exercício selecionado

O componente **RecyclerView** é utilizado para mostrar listas de dados de forma eficiente.

---

## 4. Implementação
A implementação foi realizada utilizando **Kotlin** para a lógica da aplicação e **XML** para a definição da interface gráfica.

Principais módulos:

- `Exercise.kt` – define a estrutura de dados do exercício
- `MainActivity.kt` – inicializa a lista de exercícios e o RecyclerView
- `ExerciseAdapter.kt` – associa os dados à interface gráfica
- `ExerciseDetailActivity.kt` – apresenta os detalhes do exercício selecionado

A navegação entre ecrãs é realizada através de **Intents do Android**.

---

## 5. Testes e Validação
A aplicação foi testada utilizando o **emulador do Android Studio**.

Testes realizados:

- Verificação do arranque da aplicação
- Validação da apresentação da lista de exercícios
- Teste da seleção de exercícios
- Confirmação da abertura correta do ecrã de detalhes

Durante os testes não foram identificados erros funcionais significativos.

---

## 6. Instruções de Utilização
Passos para executar o projeto:

1. Instalar o **Android Studio**
2. Abrir a pasta do projeto
3. Permitir a sincronização do **Gradle**
4. Iniciar um emulador Android ou ligar um dispositivo
5. Premir **Run** para executar a aplicação

---

# Secções de Engenharia de Software Autónoma

## 7. Estratégia de Prompts
Foram utilizadas ferramentas de inteligência artificial para auxiliar na geração da estrutura do relatório e na explicação de alguns conceitos técnicos.

Os prompts foram utilizados para:

- Gerar a estrutura do relatório
- Explicar componentes do Android
- Organizar a documentação técnica

---

## 8. Fluxo de Trabalho com Agentes Autónomos
As ferramentas de IA auxiliaram na organização da documentação e na explicação de alguns passos do desenvolvimento.

No entanto, as tarefas principais como:

- Desenvolvimento do código
- Criação da interface
- Testes da aplicação

foram realizadas pelo estudante.

---

## 9. Verificação de Artefactos Gerados por IA
Todo o conteúdo gerado com apoio de ferramentas de IA foi **revisto manualmente** para garantir:

- Correção técnica
- Coerência com o projeto
- Conformidade com os requisitos do trabalho

---

## 10. Contribuição Humana vs IA

### Contribuição Humana
- Desenvolvimento da aplicação Android
- Implementação do código
- Testes e validação
- Decisões de design

### Contribuição da IA
- Apoio na estruturação do relatório
- Explicação de conceitos técnicos
- Apoio na organização da documentação

---

## 11. Uso Ético e Responsável
As ferramentas de inteligência artificial foram utilizadas de forma responsável apenas como apoio à documentação e explicação de conceitos.

O estudante é totalmente responsável pelo desenvolvimento e validação final do projeto.

---

## 12. Controlo de Versões e Histórico de Commits
O controlo de versões foi realizado utilizando **Git** e **GitHub**.

O repositório permite acompanhar as alterações realizadas no projeto ao longo do desenvolvimento.

---

## 13. Dificuldades e Lições Aprendidas
Durante o desenvolvimento do projeto foram encontradas algumas dificuldades, nomeadamente:

- Compreender a estrutura de um projeto Android
- Configurar corretamente o emulador
- Implementar o RecyclerView
- Gerir a navegação entre Activities

Este trabalho permitiu consolidar conhecimentos de **Kotlin** e desenvolvimento de aplicações móveis para Android.

---

## 14. Melhorias Futuras
Possíveis melhorias para versões futuras da aplicação:

- Adicionar mais exercícios
- Implementar funcionalidade de pesquisa
- Criar filtros por categorias
- Melhorar o design da interface

---

## 15. Declaração de Uso de IA (Obrigatório)
Ferramentas de IA utilizadas neste trabalho:

- **ChatGPT** – apoio na estrutura do relatório e explicação de conceitos

O estudante confirma que é responsável pelo conteúdo final do projeto.
