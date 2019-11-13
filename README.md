# org.javacream.training.jenkins
Jenkins Training

# Setup Groovy


create a folder _training/groovy in personal folder

Start Visual Studio Code (category "Entwicklung") and open the _training/groovy folder

Inside VCE open a terminal window and execute

source /raum04/setup

execute groovy -version



# Check Nexus

Open a browser and navigate to http://10.8.4.41:8081, you should see the nexus repository manager app

# Setup Docker (use sudo if you are not root)

cp /raum04/daemon.json /etc/docker/daemon.json

service docker restart

docker login -u admin -p admin123 10.8.4.41:8082

docker login -u admin -p admin123 10.8.4.41:8083

docker login -u admin -p admin123 10.8.4.41:8084

Use 8084 for docker pull, 8083 for docker push


