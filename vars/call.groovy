def call(String stage) {
	if ("${stage}" == "build"){
	    sh "mvn clean package"
	}
}
