#Usa a imagem do Maven para compilar a app
FROM maven:3.8.6-eclipse-temurin-17 AS buildar
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

#Usa uma imagem do JDK para rodar o .jar gerado
FROM eclipse-temurin:17-jdk 
WORKDIR /app
COPY --from=buildar /app/target/*.jar app.jar
ENTRYPOINT [ "java","-jar","app.jar" ]