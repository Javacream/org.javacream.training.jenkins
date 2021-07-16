package snippets

def endpointAddress = "https://raw.githubusercontent.com/Javacream/org.javacream.training.jenkins/itzbund_15.7.2021/declarative-pipelines.md"

println(endpointAddress.toURL().text)
