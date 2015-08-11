// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/gen/Datum.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;

import org.json.simple.JSONArray;


public class Datum extends ReqlQuery {

    protected final java.lang.Object datum;


    public Datum(java.lang.Object arg) {
        super(null, TermType.DATUM, null, null);
        datum = arg;
    }



    @Override
    protected JSONArray build() {
        // Overridden because Datums are leaf-nodes and therefore
        // don't contain lower ReqlAst objects.
        JSONArray list = new JSONArray();
        list.add(datum);
        return list;
    }

}
