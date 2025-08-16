import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private static DataStore instance;

    private List<Incident> incidents = new ArrayList<>();
    private List<Unit> units = new ArrayList<>();

    private DataStore() {
        // Fake demo data
        incidents.add(new Incident(1, "Dhaka", "Fire in building", "Pending"));
        incidents.add(new Incident(2, "Chittagong", "Gas leak", "In Progress"));

        units.add(new Unit(1, "Engine 1", "Truck"));
        units.add(new Unit(2, "Rescue 3", "Ambulance"));
    }

    public static DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }

    public List<Incident> getIncidents() { return incidents; }
    public List<Unit> getUnits() { return units; }

    public void addIncident(Incident incident) { incidents.add(incident); }
    public void addUnit(Unit unit) { units.add(unit); }
}
