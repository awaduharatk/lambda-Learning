# lambda-Learning
AWSLambda触ってみる


# 参考資料

#### Lambda

* black belt  
  https://www.slideshare.net/AmazonWebServicesJapan/20190402-aws-black-belt-online-seminar-lets-dive-deep-into-aws-lambda-part1-part2/


* AWS summit Tokyo  
  https://www.youtube.com/watch?v=aiH8Z7MGGL0


* example   
  * serverless-java-container  
    https://github.com/awslabs/aws-serverless-java-container

  * Quick Start  
    https://github.com/awslabs/aws-serverless-java-container/wiki/Quick-start---Spring-Boot2


#### Cloudformation  
  * 公式  
    https://aws.amazon.com/jp/cloudformation/


#### AWS CodeStar  
  デプロイ関連をすべてAWS上で実行してくれる  
  コードをPushするだけでS3に配置して動くようにしてくれる？  
  https://aws.amazon.com/jp/codestar/


### AWS SAM
  AWS SAMを利用してデプロイ可能  
  https://docs.aws.amazon.com/ja_jp/lambda/latest/dg/java-package.html#java-package-cloudformation


### sample

* awsのsampleCode  
  https://github.com/awslabs/aws-serverless-java-container  
  `aws-serverless-java-container/samples/springboot2/pet-store`

* mvn  
  `mvn package`

* templete.yml編集  
  CodeUriにmvnでビルドした.zipを指定する。

* パッケージ作成  
  `aws cloudformation package --template-file template.yml --output-template-file output-sam.yaml --s3-bucket inspection-55`

* デプロイ  
  `aws cloudformation deploy --template-file /Users/mo/work/inspection/kda/aws-serverless-java-container/samples/springboot2/pet-store/output-sam.yaml --stack-name SpringBootSample --capabilities CAPABILITY_IAM`

* 確認  
  `aws cloudformation describe-stacks --stack-name SpringBootSample`


### 参考サイト
  https://docs.aws.amazon.com/ja_jp/lambda/latest/dg/java-package.html



