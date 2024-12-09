# LAB5

This project implements a program that models an airline with various types of aircraft, including passenger, cargo, and military planes. The program allows users to manage a fleet of aircraft, calculate the total capacity and cargo capacity of the fleet, and perform operations like sorting the fleet based on the range of the aircraft and filtering aircraft by fuel consumption. Each aircraft type has its own specific properties, such as passenger capacity for passenger planes and cargo capacity for cargo planes.

## Content

- [Requirements](#Requirements)
- [Installation](#Installation)
- [Startup](#Startup)
- [Using](#Using)
- [Examples](#Examples)

## Requirements

- JDK 17

## Installation

1. Clone the repository:
   
    ```bash
    git clone https://github.com/IK-24KudinaDiana/LAB5.git
    ```

2. Go to the project directory:
   
    ```bash
    cd LAB5
    ```

## Startup

- Compile and run the program from the command line:

    ```bash
    javac Main.java
    java Main
    ```

## Using

The program allows the user to manage a fleet of aircraft by adding different types of aircraft (passenger, cargo, military) to the fleet. It supports the following operations:

Total Capacity: The user can get the total passenger capacity of all aircraft in the fleet.
Total Cargo Capacity: The user can get the total cargo capacity of all aircraft in the fleet.
Sort by Range: The fleet can be sorted by the aircraft’s range (how far it can fly).
Filter by Fuel Consumption: The user can filter the aircraft based on their fuel consumption within a specific range (e.g., between 4 and 6 liters per 100 km).

### Input
- Aircraft models, fuel consumption, range, and capacity (for the specific type of aircraft).
- A range for filtering aircraft by fuel consumption.

### Output
- The total passenger capacity and total cargo capacity of the fleet.
- The sorted fleet based on the range of each aircraft.
- A list of aircraft that meet the fuel consumption criteria.

## Examples

Example of program execution:

```bash
Загальна місткість: 181
Загальна вантажопідйомність: 120000.0
Літаки після сортування за дальністю польоту:
F-16 - 2500.0 km
Antonov AN-124 - 4500.0 km
Boeing 737 - 5000.0 km
Літаки з витратою пального від 4 до 6:
F-16
Antonov AN-124
