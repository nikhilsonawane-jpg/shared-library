def call(String username, String tag){
  sh 'docker push ${username}:${tag}'
}
