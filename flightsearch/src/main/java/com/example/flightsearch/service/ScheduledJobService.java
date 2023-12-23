// Runs every 5 minutes to fetch flight information from a mock third-party API.

package com.example.flightsearch.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledJobService {

    @Scheduled(cron = "*/5 * * * * *") // Run the job every 5 minutes
    public void fetchDataFromExternalAPI() {
        System.out.println("Scheduled job executed: Fetch data from external API");
    }

}
