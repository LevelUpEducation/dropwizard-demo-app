package com.jleetutorial.resource;

import com.jleetutorial.response.DateResponse;
import com.jleetutorial.response.PongResponseTest;
import com.jleetutorial.response.PongResponse;
import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.ClassRule;
import org.junit.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationResourceTest {

    @ClassRule
    public static final ResourceTestRule resource = ResourceTestRule.builder()
            .addResource(new ApplicationResource())
            .build();

    @Test
    public void getDateTest() {
        // Arrange
        DateResponse expected = new DateResponse(new Date());

        // Act
        DateResponse actual = resource.client().target("/api/date").request().get(DateResponse.class);

        // Assert
        assertThat(actual).isNotNull();
        assertThat(actual.getDate()).isAfter(expected.getDate());
    }

    @Test
    public void getPongTest() {
        // Arrange
        PongResponse expected = new PongResponse("pong");

        // Act
        PongResponse actual = resource.client().target("/api/pong").request().get(PongResponse.class);

        // Assert
        assertThat(actual).isNotNull();
        assertThat(actual).isEqualTo(expected);
    }
}
