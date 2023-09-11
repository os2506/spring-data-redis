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
                bat 'mvn clean compile package'
            }
        }
        
        stage('Test') {
            steps {
                // Run tests
                bat 'mvn test'
            }
        }
        
    }
    
   
}
