def mvnCommand = "C:\\_training\\tools\\apache-maven-3.5.4-bin\\bin\\mvn"
def pomLocation = "org.javacream.training.jvm/pom.xml"
def mavenGoals = " install "

node {
      git 'https://github.com/Javacream/org.javacream.training.jvm'
      bat mvnCommand + mavenGoals + "-f " + " " + pomLocation 
    
}