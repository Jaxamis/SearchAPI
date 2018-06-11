package com.risksensetestproject;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;
import java.util.Map;




/**
 * @author seanr on 6/5/2018.
 * @project test-project
 */
public class RestAPI extends AbstractVerticle {

    private static Map<String, Jobs> jobs;

    @Override
    public void start() {


        //pseudo variables for the UI search terms
        int uiPayRate;
        String uiSearchTerm;
        Date uiPostedDate;
        String uiName;
        String uiAvail;
        String uiJobID;
        String uiExpLevel;
        String uiJobType;

        String query = "SELECT * FROM Jobs WHERE PayRate LIKE %"+uiPayRate+"% AND EnterDate = "+uiPostedDate+" AND JobID = "
                +uiJobID+" AND JobName LIKE %"+uiName+"% AND Description LIKE %"+uiSearchTerm+"% AND Avail = "+uiAvail+" AND ExpLevel = "
                +uiExpLevel+" AND JobType = "+uiJobType+" ;";




        Vertx vertx = Vertx.vertx();

        HttpServer httpServer = vertx.createHttpServer();

        Router router = Router.router(vertx);

        //used for querying the db with an http get request
        Route handler1 = router
                .get("/mydatabaseinstance.chidsq2ywj1a.us-east-2.rds.amazonaws.com/");


        //used for posting to the server
        Route hander2 = router
                .post("/hello")
                .consumes("*/json");


        httpServer
                .requestHandler(router::accept)
                .listen(2181);

    }
    public static String createQuery(String[] strArray) {
        /*  Take in the search criteria from the UI.
            break apart the passed search criteria
            process through the passed information and translate it to
            the SQL search query
            return the results

        */
        try {
            //first need to connect to database or send to kafka to be handled
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myURL = "mydatabaseinstance.chidsq2ywj1a.us-east-2.rds.amazonaws.com";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myURL, "sratlzaff", "linkin063089");




        }
        catch (Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        //begin the app
        new RestAPI().start();
    }


}

