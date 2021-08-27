pipeline {
    agent any
    tools { 
        maven 'My_Maven' 
        jdk 'My_Java' 
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
