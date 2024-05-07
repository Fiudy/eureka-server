## Projeto de Microservices com Spring Boot

Neste projeto, mergulhamos no desenvolvimento de um sistema de microservices utilizando Spring Boot. Nosso objetivo principal foi superar os desafios enfrentados pela comunicação entre serviços distribuídos, simplificando sua gestão.

### Principais Tecnologias Utilizadas

- Java Spring Boot (3.2.4)
- Netflix Eureka
- REST APIs
- Maven
- Java Development Kit (JDK) 21
  

### Visão Geral do Projeto

Este repositório contém um conjunto de aplicações Java Spring Boot, com destaque para as seguintes:

1. **Servidor Eureka**: Responsável pela coordenação das chamadas entre as aplicações.
2. **Client A**: Aplicação que se comunica com o Client B via REST API para solicitar operações.
3. **Client B**: Realiza operações e comunica-se com o Client C.
4. **Client C**: Fornece números aleatórios através de um endpoint REST.

## Arquivos principais do Projeto

O projeto está estruturado da seguinte forma:

- **controllerA.java**: Controlador REST do serviço Cliente A, responsável por disponibilizar um endpoint para calcular a soma de números aleatórios.
- **controllerB.java**: Controlador REST do serviço Cliente B, encarregado de fornecer um endpoint para interagir com o Serviço Cliente C e realizar operações de soma.
- **controllerC.java**: Controlador REST do serviço Cliente C, que disponibiliza um endpoint para gerar um número aleatório.

### Desenvolvedor e Disciplina

Este projeto foi desenvolvido por Luis Guilherme de Oliveira Carvalho para a disciplina de Sistemas Distribuídos, ministrada pelo professor Everton Mendonça de Jesus na Universidade Católica de Salvador.

### Licença

Este projeto está licenciado sob a Apache-2.0.

