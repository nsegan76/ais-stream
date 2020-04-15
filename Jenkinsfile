def gradle(command) {
        bat "./gradlew ${command}"
}

node {

    stage('SCM Checkout') {
  git changelog: false,
  poll: false,
  url: 'https://github.com/nsegan76/ais-stream.git'

}

stage('Build Project') {
   //git add -f gradle/wrapper/gradle-wrapper.jar
   bat 'cd ais-stream'
   bat 'gradle clean build docker'
   echo '${env.BUILD_NUMBER}'
}

/*stage('Push image') {
   docker.withRegistry('https://registry.hub.docker.com',
                       'centrifuge-docker-hub', 'dockerhub') {
            app.push('${env.BUILD_NUMBER}')
            app.push("latest")
        }
        echo "Trying to Push Docker Build to DockerHub"
}*/

stage('Deploy & Start Docker Image') {
   bat 'docker run -p 9001:9001 -t ais-stream:1.0'
}


}
