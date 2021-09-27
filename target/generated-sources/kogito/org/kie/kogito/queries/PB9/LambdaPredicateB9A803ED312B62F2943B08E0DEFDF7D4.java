package org.kie.kogito.queries.PB9;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateB9A803ED312B62F2943B08E0DEFDF7D4 implements org.drools.model.functions.Predicate1<org.kie.kogito.queries.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "746557D89C969CD85F67E348033A1BA1";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.LoanApplication _this) throws java.lang.Exception {
        return !_this.isApproved();
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("!approved", "FindNotApprovedIdAndAmount", "C:\\Users\\rhett.a.smith\\Downloads\\kogito\\active-vscode\\decisiontable-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\queries\\LoanUnit.xls");
    }
}
