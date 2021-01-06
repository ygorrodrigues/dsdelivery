# Dev Superior Delivery
# Sobre o projeto
Esse projeto faz parte da Semana Dev Superior 2.0, sendo o backend do projeto completo.

## Tecnologia utilizada
A principal linguagem utilizada foi Java com o framework Spring Boot.

## Como utilizar

### Pré requisitos
- JDK 15
- IntelliJ ou outra ferramenta de edição
- Postman ou outra ferramenta de requisições
- PostgreSQL

### Rodando em diferentes modos
Para rodar em modos diferentes basta alterar o "spring.profiles.active=" localizado no arquivo application.properties
para dev, prod ou test, baseado nas outras application-properties existentes.
Sendo o dev rodando com Postgres local, test rodando com h2-console e prod utilizando alguma ferramenta externa de hospedagem.