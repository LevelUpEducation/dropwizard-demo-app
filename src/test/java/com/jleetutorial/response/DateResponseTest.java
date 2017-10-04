package com.jleetutorial.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;
import org.junit.Test;

import java.util.Date;

import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;

public class DateResponseTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();
    private static final String FILENAME = "fixtures/date-response.json";

    @Test
    public void serializesToJSON() throws Exception {
        // Arrange
        String actual = MAPPER.writeValueAsString(new DateResponse(new Date(1483228800)));

        // Act
        String expected = MAPPER.writeValueAsString(MAPPER.readValue(fixture(FILENAME), DateResponse.class));

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void deserializesFromJSON() throws Exception {
        // Arrange
        DateResponse actual = new DateResponse(new Date(1483228800));

        // DateResponse
        DateResponse expected = MAPPER.readValue(fixture(FILENAME), DateResponse.class);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }
}
