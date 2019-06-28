FROM openjdk:8
RUN apt-get update && apt-get install -y maven
WORKDIR /app
COPY . .
RUN mvn package -DskipTests=true
RUN chmod 777 ./entrypoint.sh
#プロジェクトをビルドし、実行するシェルが書かれている
ENTRYPOINT ["./entrypoint.sh"]
