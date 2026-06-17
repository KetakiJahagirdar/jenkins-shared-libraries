def call(String url,String branch){
echo 'Cloning projekt'
git url: "${url}",branch:"${branch}"
echo "Cloning successfull"
}
