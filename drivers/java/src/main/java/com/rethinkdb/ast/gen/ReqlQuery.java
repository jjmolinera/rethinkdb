// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class ReqlQuery extends ReqlAst {


    protected ReqlQuery(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */


    public Eq eq(java.lang.Object... fields) {
        return new Eq(this, new Arguments(fields), new OptArgs());
    }

    public Ne ne(java.lang.Object... fields) {
        return new Ne(this, new Arguments(fields), new OptArgs());
    }

    public Lt lt(java.lang.Object... fields) {
        return new Lt(this, new Arguments(fields), new OptArgs());
    }

    public Le le(java.lang.Object... fields) {
        return new Le(this, new Arguments(fields), new OptArgs());
    }

    public Gt gt(java.lang.Object... fields) {
        return new Gt(this, new Arguments(fields), new OptArgs());
    }

    public Ge ge(java.lang.Object... fields) {
        return new Ge(this, new Arguments(fields), new OptArgs());
    }

    public Not not(java.lang.Object... fields) {
        return new Not(this, new Arguments(fields), new OptArgs());
    }

    public Add add(java.lang.Object... fields) {
        return new Add(this, new Arguments(fields), new OptArgs());
    }

    public Sub sub(java.lang.Object... fields) {
        return new Sub(this, new Arguments(fields), new OptArgs());
    }

    public Mul mul(java.lang.Object... fields) {
        return new Mul(this, new Arguments(fields), new OptArgs());
    }

    public Div div(java.lang.Object... fields) {
        return new Div(this, new Arguments(fields), new OptArgs());
    }

    public Mod mod(java.lang.Object... fields) {
        return new Mod(this, new Arguments(fields), new OptArgs());
    }

    public Floor floor(java.lang.Object... fields) {
        return new Floor(this, new Arguments(fields), new OptArgs());
    }

    public Ceil ceil(java.lang.Object... fields) {
        return new Ceil(this, new Arguments(fields), new OptArgs());
    }

    public Round round(java.lang.Object... fields) {
        return new Round(this, new Arguments(fields), new OptArgs());
    }

    public Append append(java.lang.Object... fields) {
        return new Append(this, new Arguments(fields), new OptArgs());
    }

    public Prepend prepend(java.lang.Object... fields) {
        return new Prepend(this, new Arguments(fields), new OptArgs());
    }

    public Difference difference(java.lang.Object... fields) {
        return new Difference(this, new Arguments(fields), new OptArgs());
    }

    public SetInsert setInsert(java.lang.Object... fields) {
        return new SetInsert(this, new Arguments(fields), new OptArgs());
    }

    public SetIntersection setIntersection(java.lang.Object... fields) {
        return new SetIntersection(this, new Arguments(fields), new OptArgs());
    }

    public SetUnion setUnion(java.lang.Object... fields) {
        return new SetUnion(this, new Arguments(fields), new OptArgs());
    }

    public SetDifference setDifference(java.lang.Object... fields) {
        return new SetDifference(this, new Arguments(fields), new OptArgs());
    }

    public Slice slice(java.lang.Object... fields) {
        return new Slice(this, new Arguments(fields), new OptArgs());
    }

    public Skip skip(java.lang.Object... fields) {
        return new Skip(this, new Arguments(fields), new OptArgs());
    }

    public Limit limit(java.lang.Object... fields) {
        return new Limit(this, new Arguments(fields), new OptArgs());
    }

    public OffsetsOf offsetsOf(java.lang.Object... fields) {
        return new OffsetsOf(this, new Arguments(fields), new OptArgs());
    }

    public Contains contains(java.lang.Object... fields) {
        return new Contains(this, new Arguments(fields), new OptArgs());
    }

    public GetField getField(java.lang.Object... fields) {
        return new GetField(this, new Arguments(fields), new OptArgs());
    }

    public Keys keys(java.lang.Object... fields) {
        return new Keys(this, new Arguments(fields), new OptArgs());
    }

    public HasFields hasFields(java.lang.Object... fields) {
        return new HasFields(this, new Arguments(fields), new OptArgs());
    }

    public WithFields withFields(java.lang.Object... fields) {
        return new WithFields(this, new Arguments(fields), new OptArgs());
    }

    public Pluck pluck(java.lang.Object... fields) {
        return new Pluck(this, new Arguments(fields), new OptArgs());
    }

    public Without without(java.lang.Object... fields) {
        return new Without(this, new Arguments(fields), new OptArgs());
    }

    public Merge merge(java.lang.Object... fields) {
        return new Merge(this, new Arguments(fields), new OptArgs());
    }

    public Between between(java.lang.Object... fields) {
        return new Between(this, new Arguments(fields), new OptArgs());
    }

    public Reduce reduce(java.lang.Object... fields) {
        return new Reduce(this, new Arguments(fields), new OptArgs());
    }

    public Map map(java.lang.Object... fields) {
        return new Map(this, new Arguments(fields), new OptArgs());
    }

    public Filter filter(java.lang.Object... fields) {
        return new Filter(this, new Arguments(fields), new OptArgs());
    }

    public ConcatMap concatMap(java.lang.Object... fields) {
        return new ConcatMap(this, new Arguments(fields), new OptArgs());
    }

    public OrderBy orderBy(java.lang.Object... fields) {
        return new OrderBy(this, new Arguments(fields), new OptArgs());
    }

    public Distinct distinct(java.lang.Object... fields) {
        return new Distinct(this, new Arguments(fields), new OptArgs());
    }

    public Count count(java.lang.Object... fields) {
        return new Count(this, new Arguments(fields), new OptArgs());
    }

    public IsEmpty isEmpty(java.lang.Object... fields) {
        return new IsEmpty(this, new Arguments(fields), new OptArgs());
    }

    public Union union(java.lang.Object... fields) {
        return new Union(this, new Arguments(fields), new OptArgs());
    }

    public Nth nth(java.lang.Object... fields) {
        return new Nth(this, new Arguments(fields), new OptArgs());
    }

    public Bracket field(java.lang.Object... fields) {
        return new Bracket(this, new Arguments(fields), new OptArgs());
    }

    public InnerJoin innerJoin(java.lang.Object... fields) {
        return new InnerJoin(this, new Arguments(fields), new OptArgs());
    }

    public OuterJoin outerJoin(java.lang.Object... fields) {
        return new OuterJoin(this, new Arguments(fields), new OptArgs());
    }

    public EqJoin eqJoin(java.lang.Object... fields) {
        return new EqJoin(this, new Arguments(fields), new OptArgs());
    }

    public Zip zip(java.lang.Object... fields) {
        return new Zip(this, new Arguments(fields), new OptArgs());
    }

    public InsertAt insertAt(java.lang.Object... fields) {
        return new InsertAt(this, new Arguments(fields), new OptArgs());
    }

    public DeleteAt deleteAt(java.lang.Object... fields) {
        return new DeleteAt(this, new Arguments(fields), new OptArgs());
    }

    public ChangeAt changeAt(java.lang.Object... fields) {
        return new ChangeAt(this, new Arguments(fields), new OptArgs());
    }

    public SpliceAt spliceAt(java.lang.Object... fields) {
        return new SpliceAt(this, new Arguments(fields), new OptArgs());
    }

    public CoerceTo coerceTo(java.lang.Object... fields) {
        return new CoerceTo(this, new Arguments(fields), new OptArgs());
    }

    public TypeOf typeOf(java.lang.Object... fields) {
        return new TypeOf(this, new Arguments(fields), new OptArgs());
    }

    public Update update(java.lang.Object... fields) {
        return new Update(this, new Arguments(fields), new OptArgs());
    }

    public Delete delete(java.lang.Object... fields) {
        return new Delete(this, new Arguments(fields), new OptArgs());
    }

    public Replace replace(java.lang.Object... fields) {
        return new Replace(this, new Arguments(fields), new OptArgs());
    }

    public Funcall do_(java.lang.Object... fields) {
        return new Funcall(this, new Arguments(fields), new OptArgs());
    }

    public Or or(java.lang.Object... fields) {
        return new Or(this, new Arguments(fields), new OptArgs());
    }

    public And and(java.lang.Object... fields) {
        return new And(this, new Arguments(fields), new OptArgs());
    }

    public ForEach forEach(java.lang.Object... fields) {
        return new ForEach(this, new Arguments(fields), new OptArgs());
    }

    public Info info(java.lang.Object... fields) {
        return new Info(this, new Arguments(fields), new OptArgs());
    }

    public Match match(java.lang.Object... fields) {
        return new Match(this, new Arguments(fields), new OptArgs());
    }

    public Upcase upcase(java.lang.Object... fields) {
        return new Upcase(this, new Arguments(fields), new OptArgs());
    }

    public Downcase downcase(java.lang.Object... fields) {
        return new Downcase(this, new Arguments(fields), new OptArgs());
    }

    public Sample sample(java.lang.Object... fields) {
        return new Sample(this, new Arguments(fields), new OptArgs());
    }

    public Default default_(java.lang.Object... fields) {
        return new Default(this, new Arguments(fields), new OptArgs());
    }

    public ToJsonString to_json(java.lang.Object... fields) {
        return new ToJsonString(this, new Arguments(fields), new OptArgs());
    }

    public ToIso8601 toIso8601(java.lang.Object... fields) {
        return new ToIso8601(this, new Arguments(fields), new OptArgs());
    }

    public ToEpochTime toEpochTime(java.lang.Object... fields) {
        return new ToEpochTime(this, new Arguments(fields), new OptArgs());
    }

    public InTimezone inTimezone(java.lang.Object... fields) {
        return new InTimezone(this, new Arguments(fields), new OptArgs());
    }

    public During during(java.lang.Object... fields) {
        return new During(this, new Arguments(fields), new OptArgs());
    }

    public Date date(java.lang.Object... fields) {
        return new Date(this, new Arguments(fields), new OptArgs());
    }

    public TimeOfDay timeOfDay(java.lang.Object... fields) {
        return new TimeOfDay(this, new Arguments(fields), new OptArgs());
    }

    public Timezone timezone(java.lang.Object... fields) {
        return new Timezone(this, new Arguments(fields), new OptArgs());
    }

    public Year year(java.lang.Object... fields) {
        return new Year(this, new Arguments(fields), new OptArgs());
    }

    public Month month(java.lang.Object... fields) {
        return new Month(this, new Arguments(fields), new OptArgs());
    }

    public Day day(java.lang.Object... fields) {
        return new Day(this, new Arguments(fields), new OptArgs());
    }

    public DayOfWeek dayOfWeek(java.lang.Object... fields) {
        return new DayOfWeek(this, new Arguments(fields), new OptArgs());
    }

    public DayOfYear dayOfYear(java.lang.Object... fields) {
        return new DayOfYear(this, new Arguments(fields), new OptArgs());
    }

    public Hours hours(java.lang.Object... fields) {
        return new Hours(this, new Arguments(fields), new OptArgs());
    }

    public Minutes minutes(java.lang.Object... fields) {
        return new Minutes(this, new Arguments(fields), new OptArgs());
    }

    public Seconds seconds(java.lang.Object... fields) {
        return new Seconds(this, new Arguments(fields), new OptArgs());
    }

    public April april(java.lang.Object... fields) {
        return new April(this, new Arguments(fields), new OptArgs());
    }

    public Group group(java.lang.Object... fields) {
        return new Group(this, new Arguments(fields), new OptArgs());
    }

    public Sum sum(java.lang.Object... fields) {
        return new Sum(this, new Arguments(fields), new OptArgs());
    }

    public Avg avg(java.lang.Object... fields) {
        return new Avg(this, new Arguments(fields), new OptArgs());
    }

    public Min min(java.lang.Object... fields) {
        return new Min(this, new Arguments(fields), new OptArgs());
    }

    public Max max(java.lang.Object... fields) {
        return new Max(this, new Arguments(fields), new OptArgs());
    }

    public Split split(java.lang.Object... fields) {
        return new Split(this, new Arguments(fields), new OptArgs());
    }

    public Ungroup ungroup(java.lang.Object... fields) {
        return new Ungroup(this, new Arguments(fields), new OptArgs());
    }

    public Changes changes(java.lang.Object... fields) {
        return new Changes(this, new Arguments(fields), new OptArgs());
    }

    public ToGeojson toGeojson(java.lang.Object... fields) {
        return new ToGeojson(this, new Arguments(fields), new OptArgs());
    }

    public Distance distance(java.lang.Object... fields) {
        return new Distance(this, new Arguments(fields), new OptArgs());
    }

    public Intersects intersects(java.lang.Object... fields) {
        return new Intersects(this, new Arguments(fields), new OptArgs());
    }

    public Includes includes(java.lang.Object... fields) {
        return new Includes(this, new Arguments(fields), new OptArgs());
    }

    public Fill fill(java.lang.Object... fields) {
        return new Fill(this, new Arguments(fields), new OptArgs());
    }

    public PolygonSub polygonSub(java.lang.Object... fields) {
        return new PolygonSub(this, new Arguments(fields), new OptArgs());
    }

}
