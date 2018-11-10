package com.tkx.tian_demo.morphia;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class ConnectConfig {

    final private Morphia morphia = new Morphia();

    final public Datastore datastore = morphia.createDatastore(new MongoClient(), "tian_demo");

    public void initialize(){

        morphia.mapPackage("com.tkx.tian_demo.morphia");

    }


}
