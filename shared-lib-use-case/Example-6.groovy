@Library('test-library') _

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Hello Pipeline'
                script {
                    // Пример вызова функции из библиотеки
                    buildProject name: 'TestProject006'
                }
            }
        }
    }
}

