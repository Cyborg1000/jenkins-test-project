pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bash 'mvn clean test'
                echo 'The project is built!! Finish :D'
            }
        }
    }
}
