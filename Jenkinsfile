pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from version control (e.g., Git)
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                // Build your Maven project
                bat 'build.bat'
            }
        }
        
        stage('Test') {
            steps {
                // Run tests
                bat 'test.bat'
            }
        }
        
    }
    
   
}
