import javax.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.Components;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.enums.ParameterIn;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;

@OpenAPIDefinition(
    info = @Info(title = "title", version = "1"),
    components =
        @Components(parameters = {@Parameter(name = "queryParam1", in = ParameterIn.QUERY)}))
public class ExampleApplication extends Application {}
