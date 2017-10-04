package com.jleetutorial.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;
import org.junit.Test;

import java.util.Date;

import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;

public class PongResponseTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();
    private static final String FILENAME = "fixtures/pong-response.json";

    @Test
    public void serializesToJSON() throws Exception {
        // Arrange
        String actual = MAPPER.writeValueAsString(new PongResponse("pong"));

        // Act
        String expected = MAPPER.writeValueAsString(MAPPER.readValue(fixture(FILENAME), PongResponse.class));

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void deserializesFromJSON() throws Exception {
        // Arrange
        PongResponse actual = new PongResponse("pong");

        // Act
        PongResponse expected = MAPPER.readValue(fixture(FILENAME), PongResponse.class);

        // Assert
        assertThat(expected).isEqualTo(actual);
    }
}
