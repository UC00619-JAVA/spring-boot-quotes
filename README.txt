UC00619 — Desenvolvimento em Java — Sessão 9
Desafio final — Citações do dia
Projeto: quotes  ·  Spring Boot 4.1.2  ·  Java 21  ·  Maven
================================================================

MAVEN WRAPPER (mvnw)
----------------------------------------------
O projeto já traz o Maven Wrapper (mvnw, mvnw.cmd e a pasta .mvn/wrapper).
Não é preciso instalar o Maven: na primeira vez, o wrapper descarrega o Maven 3.9.11
para ~/.m2/wrapper

    ./mvnw -v                       confirmar (mostra o Maven do wrapper e o Java)

Usar o wrapper em vez de mvn em todos os comandos acima:
    macOS / Linux:        ./mvnw clean package
    Windows (cmd):        mvnw.cmd clean package
    Windows (PowerShell): .\mvnw clean package

macOS / Linux, se der «Permission denied»:  chmod +x mvnw

Sem terminal: no IntelliJ, janela Maven → Lifecycle → duplo clique em clean, compile, test, package;
Plugins → spring-boot → spring-boot:run.


# TESTAR

No browser: http://localhost:8080/quotes
Ou no terminal: curl http://localhost:8080/quotes


# OUTROS COMANDOS ÚTEIS

java -version
echo %JAVA_HOME%
echo $JAVA_HOME