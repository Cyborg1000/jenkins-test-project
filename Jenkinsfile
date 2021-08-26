pipeline {
    agent any
    tools {
        maven 'Maven 3.2.5'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean test'
                echo 'The project is built!! Finish :D'
            }
        }
    }
}
