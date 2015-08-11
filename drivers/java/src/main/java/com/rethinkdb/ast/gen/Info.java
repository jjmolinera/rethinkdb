// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class Info extends ReqlQuery {


    public Info(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Info(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Info(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.INFO, args, optargs);
    }
    protected Info(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Info fromArgs(java.lang.Object... args){
        return new Info(new Arguments(args), null);
    }


}
