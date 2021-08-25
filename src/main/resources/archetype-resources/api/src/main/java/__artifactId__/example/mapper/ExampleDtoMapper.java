#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.example.mapper;

import ${package}.domain.example.model.ExampleModel;
import org.mapstruct.Mapper;
import org.open${artifactId}tools.model.ExampleModelDto;

@Mapper(componentModel = "spring")
public interface ExampleDtoMapper {

    ExampleModelDto mapToDto(ExampleModel source);

    ExampleModel mapToDomain(ExampleModelDto source);
}
