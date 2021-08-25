#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.example.service;

import ${package}.domain.example.model.ExampleModel;
import ${package}.domain.example.repository.ExampleRepository;
import ${package}.domain.example.${artifactId}.ExampleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExampleServiceImp implements ExampleService {

    private final ExampleRepository exampleRepository;

    @Override
    public ExampleModel getExampleModelExample() {
        return exampleRepository.getExampleModelExample();
    }
}
