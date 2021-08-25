#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.example.repository;

import ${package}.domain.example.model.ExampleModel;
import ${package}.domain.example.repository.ExampleRepository;
import ${package}.${artifactId}.example.entity.ExampleEntity;
import ${package}.${artifactId}.example.mapper.ExampleEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ExampleRepositoryImp implements ExampleRepository {

    private final ExampleEntityMapper exampleEntityMapper;

    @Override
    public ExampleModel getExampleModelExample() {
        ExampleEntity exampleEntity = new ExampleEntity();
        exampleEntity.setExampleId(1);
        exampleEntity.setExampleName("Example 1");
        return exampleEntityMapper.mapFromEntity(exampleEntity);
    }
}
