pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                .sh 'mvn clean test'
                echo 'The project is built!! Finish :D'
            }
        }
    }
}
