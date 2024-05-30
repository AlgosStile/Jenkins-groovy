@Library('test-library') _

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Pipeline example-8'
                script {
                    def script_content = libraryResource 'org/scripts/scriptTest.sh'
                    writeFile file: './script.sh', text: script_content
                    // Используем bat для выполнения скрипта через командную оболочку Windows
                    bat '''
                    @echo off
                    "D:\\Program Files\\Git\\bin\\bash.exe" ./script.sh
                    '''
                }
            }
        }
    }
}
