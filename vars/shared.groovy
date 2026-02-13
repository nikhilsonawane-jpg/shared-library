def call(String username, String tag){
  sh 'docker build -t ${username}:${tag} .'
}
