package org.kie.kogito.queries.P71;

import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.kie.kogito.queries.LoanApplication;
import org.kie.kogito.queries.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor710B543719DED253FCF6A2178B4505D5 implements org.drools.model.functions.Function1<org.kie.kogito.queries.LoanApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "6B257A59D5CB5DC270E5C723C5CFFF70";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.queries.LoanApplication _this) {
        return _this.getAmount();
    }
}
