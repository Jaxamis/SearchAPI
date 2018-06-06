package com.risksensetestproject;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

import java.util.Map;

/**
 * @author seanr on 6/5/2018.
 * @project test-project
 */
public class RestAPI extends AbstractVerticle {

    private static Map<String,Jobs> jobs;

    @Override
    public void start() {
            Vertx vertx = Vertx.vertx();

            HttpServer httpServer = vertx.createHttpServer();

            Router router = Router.router(vertx);

        Route handler1 = router
                .get("/mydatabaseinstance.chidsq2ywj1a.us-east-2.rds.amazonaws.com/");



        httpServer
                .requestHandler(router::accept)
                .listen(3306);

    }

    public static void main(String[] args) {
        //begin the app
        new RestAPI().start();
    }
}
