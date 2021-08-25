#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.example.entity;

import lombok.Data;

@Data
public class ExampleEntity {
    private Integer exampleId;

    private String exampleName;
}
