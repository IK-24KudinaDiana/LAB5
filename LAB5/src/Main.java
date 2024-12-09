import java.util.List;

/**
 * Головний клас програми.
 */
public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline();

        airline.addAircraft(new PassengerAircraft("Boeing 737", 3.5, 5000, 180));
        airline.addAircraft(new CargoAircraft("Antonov AN-124", 5.2, 4500, 120000));
        airline.addAircraft(new MilitaryAircraft("F-16", 6.0, 2500, 1));

        System.out.println("Загальна місткість: " + airline.getTotalCapacity());
        System.out.println("Загальна вантажопідйомність: " + airline.getTotalCargoCapacity());

        airline.sortAircraftByRange();
        System.out.println("Літаки після сортування за дальністю польоту:");
        airline.printFleet();

        System.out.println("Літаки з витратою пального від 4 до 6:");
        List<Aircraft> filteredAircraft = airline.findAircraftByFuelConsumption(4, 6);
        for (Aircraft aircraft : filteredAircraft) {
            System.out.println(aircraft.getModel());
        }
    }
}