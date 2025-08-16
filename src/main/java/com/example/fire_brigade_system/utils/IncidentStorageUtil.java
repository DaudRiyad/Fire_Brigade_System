package com.example.fire_brigade_system.utils;

import com.example.fire_brigade_system.Models.Incident;

import java.io.*;
import java.util.List;

public class IncidentStorageUtil {

    // Save list of incidents to a file
    public static void saveIncidents(List<Incident> incidents, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(incidents);
        }
    }

    // Load list of incidents from file
    @SuppressWarnings("unchecked")
    public static List<Incident> loadIncidents(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Incident>) ois.readObject();
        }
    }
}
