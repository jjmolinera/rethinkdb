// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class ConcatMap extends ReqlQuery {


    public ConcatMap(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public ConcatMap(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public ConcatMap(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.CONCAT_MAP, args, optargs);
    }
    protected ConcatMap(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static ConcatMap fromArgs(java.lang.Object... args){
        return new ConcatMap(new Arguments(args), null);
    }


}
