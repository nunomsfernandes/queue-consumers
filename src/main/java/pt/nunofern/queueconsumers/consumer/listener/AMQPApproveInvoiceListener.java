package pt.nunofern.queueconsumers.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import pt.nunofern.queueconsumers.model.ApproveInvoicePayload;

@Component
public class AMQPApproveInvoiceListener {

    @RabbitListener(queues = {"${queue.name}"}, messageConverter = "jsonConverter")
    public void receive(@Payload ApproveInvoicePayload payload) {
        System.out.println("Message " + payload);
    }
}
