// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class December extends ReqlQuery {


    public December(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public December(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public December(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.DECEMBER, args, optargs);
    }
    protected December(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static December fromArgs(java.lang.Object... args){
        return new December(new Arguments(args), null);
    }


}
