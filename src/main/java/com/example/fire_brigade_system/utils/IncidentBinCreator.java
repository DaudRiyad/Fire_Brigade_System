package com.example.fire_brigade_system.utils;

import com.example.fire_brigade_system.Models.Incident;
import java.util.Arrays;
import java.util.List;

public class IncidentBinCreator {
    public static void main(String[] args) {
        try {
            // Create sample incidents
            List<Incident> sampleIncidents = Arrays.asList(
                    new Incident("001", "Elm Street", "House on fire", "Active"),
                    new Incident("002", "Market Road", "Electrical fire in shop", "Resolved"),
                    new Incident("003", "City Hall", "False alarm, all clear", "Investigating")
            );
            // Save to bin file
            IncidentStorageUtil.saveIncidents(sampleIncidents, "incidents.bin");
            System.out.println("incidents.bin created with " + sampleIncidents.size() + " incidents.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
