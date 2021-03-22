pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                sh "mvn clean complie"
            }
        }
        stage('Test'){
            steps{
                sh "mvn test"
            }
        }
    }
}
