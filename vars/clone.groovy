def call (String url, String branch){
  echo "Clonning the code"
  git url: "${url}", branch: "${branch}"
  echo "Clonning the code successful"
}
