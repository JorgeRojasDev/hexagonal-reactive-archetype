#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.example.mapper;

import ${package}.domain.example.model.ExampleModel;
import ${package}.${artifactId}.example.entity.ExampleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExampleEntityMapper {

    ExampleModel mapFromEntity(ExampleEntity source);

    ExampleEntity mapToEntity(ExampleModel source);
}
