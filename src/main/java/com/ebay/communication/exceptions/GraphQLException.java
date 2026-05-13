package com.ebay.communication.exceptions;

import java.util.List;

/**
 * Exception thrown when a GraphQL query returns errors.
 */
public class GraphQLException extends SdkException {
    private final List<String> errors;

    public GraphQLException(List<String> errors) {
        super("GraphQL errors: " + String.join(", ", errors));
        this.errors = List.copyOf(errors);
    }

    public List<String> getErrors() {
        return errors;
    }
}
