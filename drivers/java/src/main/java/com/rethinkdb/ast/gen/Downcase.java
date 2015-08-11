// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class Downcase extends ReqlQuery {


    public Downcase(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Downcase(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Downcase(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.DOWNCASE, args, optargs);
    }
    protected Downcase(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Downcase fromArgs(java.lang.Object... args){
        return new Downcase(new Arguments(args), null);
    }


}
