// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class InnerJoin extends ReqlQuery {


    public InnerJoin(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public InnerJoin(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public InnerJoin(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.INNER_JOIN, args, optargs);
    }
    protected InnerJoin(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static InnerJoin fromArgs(java.lang.Object... args){
        return new InnerJoin(new Arguments(args), null);
    }


}
