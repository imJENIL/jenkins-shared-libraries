def call (String Project_Name, String Image_tag, String Docker_Hub_User){
  echo "Building The code"
  sh "docker build -t ${Docker_Hub_User}/${Project_Name}:${Image_tag} ."
  echo "Building code Successful"
}
