pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                tools {
                    maven 'Maven 3.8.2'
                }
                sh 'mvn clean test'
                echo 'The project is built!! Finish :D'
            }
        }
    }
}
