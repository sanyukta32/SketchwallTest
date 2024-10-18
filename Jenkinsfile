pipeline {
    agent any

    stages {
        stage('Checkuout Project') {
            steps {
                git "https://github.com/sanyukta32/SketchwallTest.git"
                echo 'Pulling Repository..'
            }
        }
        stage('Run Tests') {
            steps {
                echo 'Running Test Cases..'
            
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
