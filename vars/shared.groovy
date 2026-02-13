def call(string username, string tag){
  sh 'docker build -t ${username}:${tag}'
}
