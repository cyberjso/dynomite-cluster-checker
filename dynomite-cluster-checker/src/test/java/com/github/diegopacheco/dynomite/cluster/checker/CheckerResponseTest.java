package com.github.diegopacheco.dynomite.cluster.checker;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CheckerResponseTest {

    @Test
    public void shouldNotBreakWhenThereIsNoInsertTime() {
        CheckerResponse checkerResponse = new CheckerResponse("172.28.198.18:8102:rack1:default_dc:100", null, "0", false, "localhost");
        String content = checkerResponse.toPrettyTelemetryJson();
        assertTrue(content.contains("\"server\":\"localhost\""));
        assertTrue(content.contains("\"seeds\":\"172.28.198.18:8102:rack1:default_dc:100\""));
        assertTrue(content.contains("\"getTime\":\"0\""));
        assertTrue(content.contains("\"insertError\":\"0\""));
        assertTrue(content.contains("\"getError\":\"0\""));
        assertTrue(content.contains("\"consistency\":\"1\""));
    }

}

