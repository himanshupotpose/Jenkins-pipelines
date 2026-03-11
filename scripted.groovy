node {
    stage('PULL') {
        git branch: 'Jenkins-pipelines', url: 'https://github.com/himanshupotpose/branching-strategy-project.git'
        
    }
    stage('BUILD') {
        echo 'BUILD SUCCESS'
        
    }
    stage('test') {
        echo 'TEST SUCCESS'
        
    }
    stage('Deploy') {
        echo 'DEPLOY SUCCESS'
        
    }
}