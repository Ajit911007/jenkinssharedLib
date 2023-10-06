def call() {
    nexusArtifactUploader (
        artifacts: [
            [
                artifactId: '01-maven-web-app',
                classifier: '',
                file: 'target/01-maven-web-app.war',
                type: 'war'
            ]
        ],
        credentialsId: 'nexus-credentials',
        groupId: 'in.ashokit',
        nexusUrl: 'http://13.41.240.110:8081/repository/ajit-snapshot/',
        protocol: 'http',
        repository: 'ajit-snapshot',
        version: '3.0-SNAPSHOT'
    )
}
