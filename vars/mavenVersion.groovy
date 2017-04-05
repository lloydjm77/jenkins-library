def call() {
    def mvn = tool 'maven'
    echo "${mvn}"
    sh "${mvn}/bin/mvn -version"
}
