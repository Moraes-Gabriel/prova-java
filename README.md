# prova-java

Passos para iniciar o programa utilizando docker: 

docker network create prova

docker build -t prova-java .

docker run -p 8080:8080 --name prova-java --network prova prova-java