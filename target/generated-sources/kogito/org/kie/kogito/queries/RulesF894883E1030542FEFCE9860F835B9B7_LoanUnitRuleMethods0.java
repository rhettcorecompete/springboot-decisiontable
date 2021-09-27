package org.kie.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.queries.LoanApplication;
import static org.kie.kogito.queries.RulesF894883E1030542FEFCE9860F835B9B7.*;

public class RulesF894883E1030542FEFCE9860F835B9B7_LoanUnitRuleMethods0 {

    /**
     * Rule name: LoanRule_13
     */
    public static org.drools.model.Rule rule_LoanRule__13() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LoanRule_13").unit(org.kie.kogito.queries.LoanUnit.class)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.P6D.LambdaPredicate6D5FFB0A93964E69410C68C3056CC799.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P10.LambdaExtractor1045C52769C8F93EC504D4B4D8101C2B.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_370B7E0FCDFC8A3C7B34041AAD66452B",
                                                                                                                     org.kie.kogito.queries.PC3.LambdaPredicateC388D64A20E0029A7E06FDDAF4068BFA.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P72.LambdaExtractor72C0BBAFE5538FB79C174CDE90373AAC.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_C756ECFAB3372DF62FB33D616A3015EB",
                                                                                                                                                org.kie.kogito.queries.PD4.LambdaPredicateD48BFCD96CA04DDBBD437F8700260451.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.P71.LambdaExtractor710B543719DED253FCF6A2178B4505D5.INSTANCE,
                                                                                                                                                                 2000),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.P1D.LambdaConsequence1DDCA5D0C7CA93E29CC147859746819E.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LoanRule_14
     */
    public static org.drools.model.Rule rule_LoanRule__14() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LoanRule_14").unit(org.kie.kogito.queries.LoanUnit.class)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.P6D.LambdaPredicate6D5FFB0A93964E69410C68C3056CC799.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P10.LambdaExtractor1045C52769C8F93EC504D4B4D8101C2B.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_370B7E0FCDFC8A3C7B34041AAD66452B",
                                                                                                                     org.kie.kogito.queries.PC3.LambdaPredicateC388D64A20E0029A7E06FDDAF4068BFA.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P72.LambdaExtractor72C0BBAFE5538FB79C174CDE90373AAC.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_BAB857FAD4CC698CC458B0F7A92C9D06",
                                                                                                                                                org.kie.kogito.queries.PD0.LambdaPredicateD0FD9D712855B8C31381323FC7175C04.INSTANCE,
                                                                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                                                                 org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                                                 DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                 org.kie.kogito.queries.P71.LambdaExtractor710B543719DED253FCF6A2178B4505D5.INSTANCE,
                                                                                                                                                                 2000),
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PF6.LambdaConsequenceF6E99E070D9BBA59A6C782B60C0FB376.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LoanRule_15
     */
    public static org.drools.model.Rule rule_LoanRule__15() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LoanRule_15").unit(org.kie.kogito.queries.LoanUnit.class)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.P6D.LambdaPredicate6D5FFB0A93964E69410C68C3056CC799.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P10.LambdaExtractor1045C52769C8F93EC504D4B4D8101C2B.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_0CC265FADCDC906830A28A36EE361EB5",
                                                                                                                     org.kie.kogito.queries.PD1.LambdaPredicateD19216E2A95E3A73224DABA464B1B2D6.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P72.LambdaExtractor72C0BBAFE5538FB79C174CDE90373AAC.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_707D479969E8B848EF9C3113B0EF99EB",
                                                                                                                                                var_maxAmount,
                                                                                                                                                org.kie.kogito.queries.PA7.LambdaPredicateA710C8B8883B9E7C35171C36088FECC6.INSTANCE,
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PF6.LambdaConsequenceF6E99E070D9BBA59A6C782B60C0FB376.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LoanRule_16
     */
    public static org.drools.model.Rule rule_LoanRule__16() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LoanRule_16").unit(org.kie.kogito.queries.LoanUnit.class)
                                                          .build(D.pattern(var_$l).expr("GENERATED_8410F19034E5F2EE9C1DFBADA3B2DBB8",
                                                                                        org.kie.kogito.queries.P6D.LambdaPredicate6D5FFB0A93964E69410C68C3056CC799.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P10.LambdaExtractor1045C52769C8F93EC504D4B4D8101C2B.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")).expr("GENERATED_0CC265FADCDC906830A28A36EE361EB5",
                                                                                                                     org.kie.kogito.queries.PD1.LambdaPredicateD19216E2A95E3A73224DABA464B1B2D6.INSTANCE,
                                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                      DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                      org.kie.kogito.queries.P72.LambdaExtractor72C0BBAFE5538FB79C174CDE90373AAC.INSTANCE,
                                                                                                                                      1000),
                                                                                                                     D.reactOn("deposit")).expr("GENERATED_9749F5AE083B9EE7BEB30A1033439430",
                                                                                                                                                var_maxAmount,
                                                                                                                                                org.kie.kogito.queries.P9B.LambdaPredicate9BD450FCDE22D749BDD9E30727653941.INSTANCE,
                                                                                                                                                D.reactOn("amount")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.P1D.LambdaConsequence1DDCA5D0C7CA93E29CC147859746819E.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LoanRule_17
     */
    public static org.drools.model.Rule rule_LoanRule__17() {
        final org.drools.model.Variable<org.kie.kogito.queries.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.queries.LoanApplication.class,
                                                                                                         DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                                         "$l",
                                                                                                         D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataF894883E1030542FEFCE9860F835B9B7.org_kie_kogito_queries_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.queries",
                                            "LoanRule_17").unit(org.kie.kogito.queries.LoanUnit.class)
                                                          .build(D.pattern(var_$l).expr("GENERATED_C570E3A565BEB9D33B4F22270CB9FB39",
                                                                                        org.kie.kogito.queries.PDF.LambdaPredicateDFFDDABCE1399B79DE614B6853A097C9.INSTANCE,
                                                                                        D.alphaIndexedBy(int.class,
                                                                                                         org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                         -1,
                                                                                                         org.kie.kogito.queries.P10.LambdaExtractor1045C52769C8F93EC504D4B4D8101C2B.INSTANCE,
                                                                                                         20),
                                                                                        D.reactOn("applicant")),
                                                                 D.on(var_$l).execute(org.kie.kogito.queries.PF6.LambdaConsequenceF6E99E070D9BBA59A6C782B60C0FB376.INSTANCE));
        return rule;
    }
}
