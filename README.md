# Fraud AIML Rules Engine

This project uses Quarkus, the Supersonic Subatomic Java Framework and Kogito, a cloud native business automation and decision (rule) engine.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .
If you want to learn more about Quarkus, please visit its website: https://kogito.kie.org/.

## Prerequistes

If you have already done the below steps as part of your previous deployments, feel free to move to next section on packaging and running the application.

Install a Openshift 4.x Cluster - Refer https://docs.openshift.com/container-platform/4.5/welcome/index.html

Install the demo of MLOps from this repository https://github.com/rhappdev-demo/fraud_detection

Install the fraud transaction generator demo from this repository https://github.com/krnaraya/fraud-transaction-generator

This should have created a fraud-demo-dev namespace, if you provided "fraud-demo" as the project fix. Else naviagate to <prj_prefix>_dev namespace.

Install AMQ Streams Operator in Openshift Cluster on to this (<prj_prefix>_dev) namespace  - Refer https://access.redhat.com/documentation/en-us/red_hat_amq/7.7/html/deploying_and_upgrading_amq_streams_on_openshift/deploy-intro_str

Install a Kafka Cluster (name it my-cluster, if not feel free the update the application properties to the correct kafka configuration) from the AMQ streams operator - Refer https://access.redhat.com/documentation/en-us/red_hat_amq/7.7/html/deploying_and_upgrading_amq_streams_on_openshift/deploy-tasks_str#kafka-cluster-str

Install the Kogito Operator on this (<prj_prefix>_dev) namespace. 

In the OpenShift web console, go to Operators → OperatorHub in the left menu, search for and select Kogito, and follow the on-screen instructions to install the latest operator version.

After you install the Kogito Operator, in the OpenShift web console, go to Operators → Installed Operators and select Kogito.


## Packaging and running the application

Login to your openshift cluster - oc login <login_url>

Switch to you project (namesapace) - oc project <project_name> (<prj_prefix>_dev) namespace. for example., fraud-demo-dev where you have the seldon model api and kafka deployed.

```
oc apply -f scripts/fraud-aiml-rules-engine-build.yaml

```

This should have started the build process and a pod running to the build. Wait for it to complete.

Once the build is succeded and a image pushed to local openshift image registry, run the below command to spin of the container.


```
oc apply -f scripts/fraud-aiml-rules-engine-runtime.yaml

```


## Testing the application

Launch the Fraud AIML Rules Engine application that was deployed, Browse the URL that is exposed for the container as part of the deploy process. Navigate to <route_url>/transactions.html and this should show some counters on the html page with N/A.

Launch the Fraud transaction generator application that was deployed earlier, Browse the URL that is exposed for the container as part of the deploy process 

Select the CSV file to upload - Sample file (creditcard_1000.csv) is available in resources folder (https://github.com/krnaraya/fraud-transaction-generator/tree/master/src/main/resources) and click submit.

This will parse the csv, convert it into json file and produce the records to kafka and tell you haw many records were produced at the end.

If you navigate to the Fraud AIML Rules Engine application (<route_url>/transactions.html), you should see that the counters are showing the messages from kafka and how the rule engine has predicted the non fraudulent transactions and sorted the transactions as well