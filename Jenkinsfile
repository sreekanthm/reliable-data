node{
         stage('SCM Checkout'){
           git 'https://github.com/sreekanthm/reliable-data.git'
         }
         stage('Mvn Package'){
	   def mvnHome = tool name: 'maven-3', type: 'maven'
           def mvnCMD = "${mvnHome}/bin/mvn"
	   sh "${mvnCMD} clean package"
	}
}
