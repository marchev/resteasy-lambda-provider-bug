package org.marchev;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.junit.Test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.ext.ContextResolver;

public class LambdaProviderTest
{
    @Test
    public void registerLambdaProvider() {
        ClientBuilder.newBuilder()
            .register((ContextResolver<ObjectMapper>) type -> new ObjectMapper().registerModule(new JodaModule()))
            .build();
    }
}
