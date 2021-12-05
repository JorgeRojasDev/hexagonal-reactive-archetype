#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.notification.service;

import ${package}.domain.example.model.ExampleModel;
import io.github.jorgerojasdev.libraries.flux.notifier.service.abstraction.Notifier;

public interface NotificationExampleService extends Notifier<ExampleModel> {

}
