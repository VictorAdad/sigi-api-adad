package sockets;

import akka.actor.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import models.Notificacion;

import play.Logger;
import play.libs.Json;

public class NotificationSocketActor extends AbstractActor {

    private static List<ActorRef> connections = new ArrayList<ActorRef>();

    private final ActorRef currentOut;

    public static Props props(ActorRef out) {
        return Props.create(NotificationSocketActor.class, out);
    }


    public NotificationSocketActor(ActorRef out) {
        // Logger.debug("=> NotificationSocketActor@addConn");
        this.connections.add(out);
        this.currentOut = out;
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
            .match(String.class, message -> {

                    JsonNode json   = Json.parse(message);
                    JsonNode notify = json.get("notify");
                    if(notify != null){
                        Notificacion object = Json.fromJson(notify, Notificacion.class);
                        object.save();
                        for (ActorRef out : this.connections) {
                            out.tell(message, self());
                        }
                    }
                }
            )
          .build();
    }

    public void postStop() throws Exception {
        Iterator<ActorRef> it= connections.iterator();
 
        while(it.hasNext()) {
            ActorRef out = it.next();
            if (out.equals(this.currentOut)) {
                it.remove();
            }
        }        

    }
}