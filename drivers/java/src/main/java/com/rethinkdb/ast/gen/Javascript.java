// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class Javascript extends ReqlQuery {


    public Javascript(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Javascript(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Javascript(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.JAVASCRIPT, args, optargs);
    }
    protected Javascript(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Javascript fromArgs(java.lang.Object... args){
        return new Javascript(new Arguments(args), null);
    }


}
