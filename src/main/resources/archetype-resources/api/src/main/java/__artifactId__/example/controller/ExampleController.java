#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.example.controller;

import ${package}.${artifactId}.example.mapper.ExampleDtoMapper;
import ${package}.domain.example.model.ExampleModel;
import ${package}.domain.example.usecase.ExampleService;
import lombok.AllArgsConstructor;
import org.open${artifactId}tools.${artifactId}.ExampleApi;
import org.open${artifactId}tools.model.ExampleModelDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/example")
public class ExampleController implements ExampleApi {

    private final ExampleService exampleService;

    private final ExampleDtoMapper exampleDtoMapper;

    @Override
    public Flux<ExampleModelDto> getExampleFlux(ServerWebExchange exchange) {
        ExampleModel exampleModel = exampleService.getExampleModelExample();
        return Flux.just(exampleDtoMapper.mapToDto(exampleModel));
    }

    @Override
    public Mono<ExampleModelDto> getExampleMono(ServerWebExchange exchange) {
        ExampleModel exampleModel = exampleService.getExampleModelExample();
        return Mono.just(exampleDtoMapper.mapToDto(exampleModel));
    }
}
