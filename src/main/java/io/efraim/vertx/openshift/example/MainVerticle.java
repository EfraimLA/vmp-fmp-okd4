package io.efraim.vertx.openshift.example;

import io.vertx.reactivex.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() {
        vertx.createHttpServer()
                .requestHandler(httpServerRequest -> httpServerRequest.response().end("Ok"))
                .rxListen(8080)
                .subscribe(httpServerRequest -> System.out.println("Server started!"), Throwable::printStackTrace);
    }

}
