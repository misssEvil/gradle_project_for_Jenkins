pipeline {
    agent any
  
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
               gradle test
        }
        
        stage("deploy") {
            steps {
                echo 'deploying the app'
            }
        }
    }   
}
