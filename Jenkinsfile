pipeline {
    agent any

      parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
  
    stages {
        stage("init") {
            steps {
                echo 'initing the app'
            }
        }
        
        stage("build") {
            steps {
                echo 'building the app'
            }
        }
        
        stage("test") {
           steps{
               echo 'testing the app'
        }
        }
        
        stage("deploy") {
            steps {
                echo 'deploying the app'
            }
        }
    }
}
