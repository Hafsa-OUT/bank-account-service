package org.sid.bank_account_service.exceptions;

import graphql.GraphQLError;
import graphql.schema.DataFetchingEnvironment;
import org.jspecify.annotations.Nullable;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import graphql.ErrorClassification;
import graphql.language.SourceLocation;
import org.springframework.stereotype.Component;

import java.util.List;

import java.util.Collections;
import java.util.List;
@Component
public class CustomerDataFetcherExceptionResolver extends DataFetcherExceptionResolverAdapter {
    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        return new GraphQLError() {
            @Override
            public String getMessage() {
                return ex.getMessage();
            }
            @Override
            public List<SourceLocation> getLocations (){
                return null;
            }
            @Override
            public ErrorClassification getErrorType(){
                return null;
            }
        };
    }
}
