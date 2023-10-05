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
        credentialsId: 'nexus3',
        groupId: 'in.ashokit',
        nexusUrl: 'YOUR_NEXUS_URL_HERE',
        protocol: 'http',
        repository: 'ajit-snapshot',
        version: '3.0-SNAPSHOT'
    )
}
