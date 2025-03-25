def call(String build) {
	if ("${build} == "build"){
	    sh "mvn clean package"
	}
}
