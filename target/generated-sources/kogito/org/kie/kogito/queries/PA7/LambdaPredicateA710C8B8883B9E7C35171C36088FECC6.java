package org.kie.kogito.queries.PA7;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateA710C8B8883B9E7C35171C36088FECC6 implements org.drools.model.functions.Predicate2<org.kie.kogito.queries.LoanApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "ECA00E032343D0E962E0D4ADAF4839C9";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.queries.LoanApplication _this, Integer maxAmount) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.lessOrEqualNumbers(_this.getAmount(), maxAmount);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("amount <= maxAmount", "LoanRule_15", "C:\\Users\\rhett.a.smith\\Downloads\\kogito\\active-vscode\\decisiontable-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\queries\\LoanUnit.xls");
    }
}
