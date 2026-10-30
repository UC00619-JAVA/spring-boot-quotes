package com.example.quotes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private static final Logger log = LoggerFactory.getLogger(QuoteController.class);

    private final List<String> quotes = List.of(
            "First make it work, then make it better.",
            "Read the error message.",
            "Small steps every day.",
            "Tests are your safety net.",
            "Every expert was once a beginner."
    );

    private final Random random = new Random();
    private int served = 0;

    @GetMapping("/quotes")
    public String quote() {
        int index = random.nextInt(quotes.size());
        served++;

        log.debug("Choosing between {} quotes", quotes.size());
        log.info("Quote #{} served (index {})", served, index);

        if (served % 10 == 0) {
            log.warn("{} quotes served. Time for a break!", served);
        }
        return quotes.get(index);
    }

    @GetMapping("/stats")
    public String stats() {
        log.info("Stats requested");
        return "Quotes served: " + served;
    }
}
