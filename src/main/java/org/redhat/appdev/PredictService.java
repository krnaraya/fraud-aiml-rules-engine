package org.redhat.appdev;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.inject.Inject;

@ApplicationScoped
public class PredictService {


    @Inject
    @RestClient
    PredictFraud predictFraudService;
    
    private static final Logger logger = LoggerFactory.getLogger(PredictService.class);

    public Transaction predictFraud(Transaction transaction) {
     
        logger.info("Transaction {} is being checking for fraud", transaction.toString());
        String data = "";

        //'V3', 'V4', 'V10', 'V11', 'V12', 'V14', 'V17'

        data = "{\"data\":{\"ndarray\":[[" + transaction.getV3() + "," + transaction.getV14() + "," + transaction.getV10() + "," + transaction.getV11() + "," + transaction.getV12() + "," + transaction.getV14() + "," + transaction.getV17() + "]]}}"; 
        

        logger.info("Sending data {} to prediction service", data.toString());
        
       // String frauddata = "{\"data\":{\"ndarray\":[[\"-4.47513271259153\",\"5.4676845487781\",\"-4.59495176285009\",\"5.27550585077254\",\"-11.3490285500915\",\"-8.13869488434773\",\"-10.2467554066001\"]]}}";

        PredictionResponse predictResponse = predictFraudService.post(data);

        if (predictResponse.getData().getNdarray().get(0).get(0) < predictResponse.getData().getNdarray().get(0).get(1)) {
            logger.info("Prediction response {} came out as fraud", predictResponse.getData().getNdarray().get(0).toString());
            transaction.setIsFraud(true);
        }
        else {
            logger.info("Prediction response {} came out as non-fraud", predictResponse.getData().getNdarray().get(0).toString());
            transaction.setIsFraud(false);
        }

        

        return transaction;
        
    }

}