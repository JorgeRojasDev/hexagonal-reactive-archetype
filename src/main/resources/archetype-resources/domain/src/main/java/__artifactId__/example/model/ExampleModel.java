#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.example.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ExampleModel {

    private final Integer exampleId;

    private final String exampleName;
}
