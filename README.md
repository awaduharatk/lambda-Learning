# lambda-Learning

## LambdaでHelloWorldしてみる  

* jar作成  
  `$ ./gradlew buildZip`  
  `build/distributions`にzipで出力される

* パッケージ作成  
  `aws cloudformation package --template-file template.yaml --output-template-file output-sam.yaml --s3-bucket inspection-55 --s3-prefix deploy`

* デプロイ  
  `aws cloudformation deploy --template-file output-sam.yaml --stack-name SpringBootDemo --capabilities CAPABILITY_IAM`

* 確認  
  `aws cloudformation describe-stacks --stack-name SpringBootDemo`


* localで動かす  
  `sam local start-api --template local.yaml`
  初回は時間がかかるっぽい？  
  よくわかっていない  

## sampleを動かしてみる

* awsのsampleCode  
  https://github.com/awslabs/aws-serverless-java-container  
  `aws-serverless-java-container/samples/springboot2/pet-store`

* mvn  
  `mvn package`

* templete.yaml編集  
  CodeUriにmvnでビルドした.zipを指定する。

* パッケージ作成  
  `aws cloudformation package --template-file template.yaml --output-template-file output-sam.yaml --s3-bucket inspection-55`

* デプロイ  
  `aws cloudformation deploy --template-file /Users/mo/work/inspection/kda/aws-serverless-java-container/samples/springboot2/pet-store/output-sam.yaml --stack-name SpringBootSample --capabilities CAPABILITY_IAM`

* 確認  
  `aws cloudformation describe-stacks --stack-name SpringBootSample`



## Lambdaについての調査めも

* Java  
  利用可能。  
  Springbootも利用できる。が、エントリーポイントがHandlerとなるため、MainAppricationが動かない前提で開発する必要がある。  
  少し工夫が必要そう(https://dev.classmethod.jp/articles/spring-boot-aws-lambda-handler-appliation-context/)  
  * Spring Cloud Function  
    Lambda向けのSpringライブラリ。  
    LambdaでSpringを使うためのいろいろを吸収してくれるライブラリ？  
    
* Python



## 参考資料

### Lambdaについて

* black belt  
  https://www.slideshare.net/AmazonWebServicesJapan/20190402-aws-black-belt-online-seminar-lets-dive-deep-into-aws-lambda-part1-part2/


* AWS summit Tokyo  
  https://www.youtube.com/watch?v=aiH8Z7MGGL0


* example   
  * serverless-java-container  
    https://github.com/awslabs/aws-serverless-java-container

  * Quick Start  
    https://github.com/awslabs/aws-serverless-java-container/wiki/Quick-start---Spring-Boot2


### その他用語系

#### Cloudformation  
  * 公式  
    https://aws.amazon.com/jp/cloudformation/


#### AWS CodeStar  
  デプロイ関連をすべてAWS上で実行してくれる  
  コードをPushするだけでS3に配置して動くようにしてくれる？  
  https://aws.amazon.com/jp/codestar/


#### AWS SAM
  AWS SAMを利用してデプロイ可能  
  https://docs.aws.amazon.com/ja_jp/lambda/latest/dg/java-package.html#java-package-cloudformation

* 参考サイト
  * https://docs.aws.amazon.com/ja_jp/lambda/latest/dg/java-package.html

  * Spring Cloud Function  
    https://qiita.com/neruneruo/items/710a981c0ad3877e1988



## 開発環境等
* docker-lambda  
  aws環境へデプロイせずにローカルのDocker上で試せる  

