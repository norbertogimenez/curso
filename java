sudo add-apt-repository ppa:linuxuprising/java
sudo apt update
sudo apt install oracle-java10-installer


export JAVA_HOME="/usr/lib/jvm/java-16-oracle"
export PATH=$JAVA_HOME/bin:$PATH


===================================================================================
ferramentas gradle e maven

https://gradle.org
Installing manually
downlaod
versao 7xx  binario .zip

https://maven.apache.org/download.cgi
Binary zip archive 	apache-maven-3.8.1-bin.zip

===================================================================================

IntelliJ IDEA  - IDE de desenvolvimento

https://www.jetbrains.com/pt-br/idea/download/#section=linux

download o community  .tarz
===================================================================================

 Instalação
 
 sudo su
 
 mkdir /opt/gradle
 
 
 chmod 777 gradle
 
 
 unzip no diretorio  do gradle
 
 unzip -d /opt/gradle gradle-7.1.1-bin.zip
 
 gradle 7.1.1

 export PATH=$PATH:/opt/gradle/gradle-7.1.1/bin
 
 
 
  gradle -v  
 
 ferramenta mais nova
 
 ======================================================================================
 Maven o mesmo processo que o gradle
 
 criar a pasta
 
 copiar o arquivo bin
  
  unzip -d /opt/maven apache-maven-3.8.1-bin.zip
  
 export PATH=$PATH:/opt/maven/apache-maven-3.8.1/bin
  
  verificar
  mvn -v
  
 ferramenta mais antiga 
 
 ======================================================================================
 diferencas em versoes e ferramentas
 
 gradle wrapper
 
 ./gradlew -v
 
 
 ========================================================
 
 paths
 
 export PATH=$PATH:/opt/gradle-7.1.1/bin
 export PATH=$PATH:/opt/maven/apache-maven-3.8.1/bin
 export PATH=$PATH:/opt/idea/idea-IC-211.7628.21/bin
 
 
 
 ===========================================================
 
 
 idea para rodar a ide
/idea.sh
 
 
 
 
 
 
 
 
 
 ============================================================
 
  gradle init 
​
Select type of project to generate:
 1: basic
 2: application
 3: library
 4: Gradle plugin
Enter selection (default: basic) [1..4] 1
​
Select build script DSL:
 1: Groovy
 2: Kotlin
Enter selection (default: Groovy) [1..2] 1
​
Project name (default: java_project): my_first_gradle_project  
​
> Task :init
Get more help with your project: Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.1/samples
​
BUILD SUCCESSFUL in 1m 39s
2 actionable tasks: 2 executed
​

Listei o conteúdo da pasta e observei que as pastas e o arquivo equivalentes aos que o professor criou com o comando gradle wrapper, foram criados ao executar o comando gradle init:

❯ ls                   
build.gradle gradle gradlew gradlew.bat settings.gradle
❯ ls gradle/wrapper
gradle-wrapper.jar gradle-wrapper.properties


========================================================================================================================

sdkman


apt update

apt install curl unzip zip nano

$ curl -s "https://get.sdkman.io" | bash

Follow the instructions on-screen to complete installation.
Next, open a new terminal or enter:

$ source "$HOME/.sdkman/bin/sdkman-init.sh"

 
  1-
  
  sdk list java
 
  2- ache a versao
  
  sdk install java identifier***
  
  3
  
  sdk use java identifier****
  sdk use java 11.0.11.hs-adpt
 
 
 
 
 
 docker container run -it -m512M --entrypoint bash openjdk:7-jdk 
 
 
 
 sudo groupadd docker
 sudo usermod -aG docker $USER
  echo$USER
  
 docker run helllo-world
 
 docker images
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

