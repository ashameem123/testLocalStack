package functions;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;


public class SNStoLambda implements RequestHandler<SNSEvent, Void> {

        public Void handleRequest(SNSEvent event, Context context) {
            System.out.println("====>> SNS Hello from Lambda!<<===");


            return null;
        }


    }

