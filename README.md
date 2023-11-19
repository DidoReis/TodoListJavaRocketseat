Documentação do Projeto TodoList

Descrição
Este projeto é uma aplicação Java que implementa uma lista de tarefas (TodoList). A aplicação é empacotada em um contêiner Docker para facilitar a implantação.

Dockerfile
O Dockerfile do projeto tem duas fases:

Fase de compilação (build): Nesta fase, a imagem base é ubuntu:latest. O JDK 17 é instalado junto com o Maven. O código fonte é copiado para a imagem e o Maven é usado para compilar o projeto e gerar um arquivo JAR.

Fase de execução (runtime): Nesta fase, a imagem base é openjdk:17-jdk-slim, que é uma imagem mais leve que contém apenas o necessário para executar aplicações Java. O arquivo JAR gerado na fase de compilação é copiado para esta imagem. O contêiner expõe a porta 8080 e o comando para iniciar a aplicação é definido.

Como construir a imagem Docker  

Para construir a imagem Docker deste projeto, você pode usar o seguinte comando:  

docker build -t todolist .

Como executar o contêiner  

Para executar o contêiner deste projeto, você pode usar o seguinte comando:  

docker run -p 8080:8080 todolist

Com este comando, a aplicação estará disponível na porta 8080 do seu host.
