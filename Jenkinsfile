pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
             withMaven(maven : 'apache-maven-3.9.4') {
                // Checkout your source code from version control (e.g., Git)
                checkout scm
                }
            }
        }
        
        stage('Build') {
            steps {
              withMaven(maven : 'apache-maven-3.6.1') {
                bat'mvn clean compile package'
            	}
            }
        }
        
        stage('Test') {
            steps {
              withMaven(maven : 'apache-maven-3.9.4') {
                // Run tests
                bat 'mvn test'
                }
            }
        }
        
    }
    
   
}
