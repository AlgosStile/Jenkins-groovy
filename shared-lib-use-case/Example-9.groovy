pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Hello Pipeline'
                script {
                    echo 'script..'

                    // Загрузка библиотеки с методами
                    def libLoop = load 'utils/loop.groovy'

                    // Выполнение метода getInfoGit с использованием Git Bash
                    bat '''
                    @echo off
                    "D:\\Program Files\\Git\\bin\\bash.exe" -c "git ls-remote -h https://github.com/AlgosStile/Jenkins-groovy.git"
                    '''

                    // Выполнение метода loopMethod
                    libLoop.loopMethod()

                    // Выполнение метода getInfoGitBranch с использованием Git Bash
                    bat '''
                    @echo off
                    "D:\\Program Files\\Git\\bin\\bash.exe" -c "git ls-remote -h https://github.com/AlgosStile/Jenkins-groovy.git"
                    '''
                }
            }
        }
    }
}
