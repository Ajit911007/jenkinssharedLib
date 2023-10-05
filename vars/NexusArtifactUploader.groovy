def call() {
    NexusArtifactUploader (
        artifacts: [
            [
                artifactId: '01-maven-web-app',
                classifier: '',
                file: 'target/01-maven-web-app.war',
                type: 'war'
            ]
        ],
        credentialsId: 'nexus3',
        groupId: 'in.ashokit',
        nexusUrl: 'http://3.8.138.57:8081/repository/ajit-snapshot/',
        protocol: 'http',
        repository: 'ajit-snapshot',
        version: '3.0-SNAPSHOT'
    )
}
