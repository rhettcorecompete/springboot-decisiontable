package org.kie.kogito.queries.PC3;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorC334F3C1ED089366EE2C8BBE89ADB705 implements org.drools.model.functions.Function1<org.kie.kogito.queries.LoanApplication, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4B535D6FD4968A0C49DA0CFD02F035DE";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(org.kie.kogito.queries.LoanApplication _this) {
        return _this.getId();
    }
}
