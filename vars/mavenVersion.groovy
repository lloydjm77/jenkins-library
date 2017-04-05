def call(config) {
    def mvn = tool 'maven'
    echo "${mvn}"
    echo "${config.goals}"
    sh "${mvn}/bin/mvn -version"
}
