package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;
import org.drools.model.Query;

public class RulesF894883E1030542FEFCE9860F835B9B7_LoanUnit extends RulesF894883E1030542FEFCE9860F835B9B7 {

    @Override
    public String getName() {
        return super.getName() + ".LoanUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@2cf74e6b
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(RulesF894883E1030542FEFCE9860F835B9B7_LoanUnitRuleMethods0.rule_LoanRule__13(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_LoanUnitRuleMethods0.rule_LoanRule__14(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_LoanUnitRuleMethods0.rule_LoanRule__15(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_LoanUnitRuleMethods0.rule_LoanRule__16(),
                                       RulesF894883E1030542FEFCE9860F835B9B7_LoanUnitRuleMethods0.rule_LoanRule__17());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_FindApproved = query_FindApproved();

    final Query query_FindNotApprovedIdAndAmount = query_FindNotApprovedIdAndAmount();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_FindApproved() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        org.drools.model.Query FindApproved_build = queryDef_FindApproved.build(D.pattern(var_$l,
                                                                                          D.entryPoint("loanApplications")).expr("GENERATED_1DB11A9BDC0E975B2134FF23CDA3A1DA",
                                                                                                                                 org.kie.kogito.queries.P6C.LambdaPredicate6CF9873942A3E9FFDC8BFE75BAB4A7E6.INSTANCE,
                                                                                                                                 D.reactOn("approved")));
        return FindApproved_build;
    }

    private org.drools.model.Query query_FindNotApprovedIdAndAmount() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_GENERATED_$pattern_LoanApplication$104$ = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                                                              DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                                                              "GENERATED_$pattern_LoanApplication$104$",
                                                                                                                                              D.entryPoint("loanApplications"));
        final org.drools.model.Variable<java.lang.String> var_$id = D.declarationOf(java.lang.String.class,
                                                                                    DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.java_lang_String_Metadata_INSTANCE,
                                                                                    "$id");
        final org.drools.model.Variable<Integer> var_$amount = D.declarationOf(Integer.class,
                                                                               "$amount");
        org.drools.model.Query FindNotApprovedIdAndAmount_build = queryDef_FindNotApprovedIdAndAmount.build(D.pattern(var_GENERATED_$pattern_LoanApplication$104$,
                                                                                                                      D.entryPoint("loanApplications")).expr("GENERATED_873BBEADE9E88B7E5D92A91EEB1CF7FF",
                                                                                                                                                             org.kie.kogito.queries.PB9.LambdaPredicateB9A803ED312B62F2943B08E0DEFDF7D4.INSTANCE,
                                                                                                                                                             D.reactOn("approved")).bind(var_$id,
                                                                                                                                                                                         org.kie.kogito.queries.PC3.LambdaExtractorC334F3C1ED089366EE2C8BBE89ADB705.INSTANCE,
                                                                                                                                                                                         D.reactOn("id")).bind(var_$amount,
                                                                                                                                                                                                               org.kie.kogito.queries.P71.LambdaExtractor710B543719DED253FCF6A2178B4505D5.INSTANCE,
                                                                                                                                                                                                               D.reactOn("amount")));
        return FindNotApprovedIdAndAmount_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_FindApproved);
        queries.add(query_FindNotApprovedIdAndAmount);
    }
}
