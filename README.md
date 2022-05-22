# Zoom-Car-Clone
A car rental system similar to Zoomcar for the renting of cars for a short period of time ranging from few hours to weeks.

### System Requirements

- The system will support the renting of different types of cars.
- Each vehicle should be added with a unique barcode and other details.
- The system should be able to retrieve information like which member took a particular vehicle or what vehicles have been rented out by a specific member.
- The system should collect a late-fee for vehicles returned after the due date.
- Members should be able to search the vehicle inventory and reserve any available vehicle.
- Members should be able to cancel their reservations.
- The system should maintain a vehicle log to track all events related to the vehicles.

### Usecases and API Endpoints

GET - "/cars/list"

GET -"/cars/{id}"

POST - "/cars/add"

PUT - "/cars/modify/{id}"

DELETE - "/cars/delete/{id}"

GET - "/reservation/{id}"

POST - "/reservation/create/"

PUT - "/reservation/modify/{id}"

POST - "/reservation/cancel/{id}"

POST - "/activity/pickUp"

### Usecase Diagram

<img src="Assets/zoomcarClone_UsecaseDiagram - Copy.png" width="650">
