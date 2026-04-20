pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t helloworld-app .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker stop helloworld-container || true'
                sh 'docker rm helloworld-container || true'
                sh 'docker run -d -p 8083:8080 --name helloworld-container helloworld-app'
            }
        }
    }
}