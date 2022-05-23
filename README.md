# Project-ZoomCar-Clone

The primary goal of this project (ZoomCar-Clone) is to develop APIs
for the backend of a Car Rental System like ZoomCar application.
I will be using Java and Spring Boot Framework to develop this application backend.

### Requirements
- The system will support the renting of different types of cars varying from Standard to Luxury segments.
- Primarily there are two kinds of users for this application - *Member* and *Admin*.
- Both users should be able to access login/logout functionality and have
  a role based access to the APIs.
- An Admin should be able to add, modify or delete vehicles.
- Each vehicle should be added with a unique registration number and other details.
- Members should be able to search the vehicle inventory and reserve any available vehicle.
- Members should be able to cancel their reservations.
- The system should be able to retrieve information like which member took a particular vehicle or what vehicles have been rented out by a specific member.
- The system should collect a late-fee for vehicles returned after the due date.
- The system should maintain a vehicle log to track all events related to the vehicles.

### Usecases and API Endpoints
| API Method        | URI           | Usecase  |
| ------------- |:-------------:| :-----:|
| GET      | "/cars/list" | List of Car inventory |
| GET      | "/cars/{id}" | Get Car by carId |
| POST    | "/cars/add"      |   Add new car to Inventory |
| PUT      | /cars/modify/{id} | Edit a Car from inventory |
| DELETE      | "/cars/delete/{id}" | Delete a Car by carId |
| POST    | "/cars/add"      |   Add new car to Inventory |

| API Method        | URI           | Usecase  |
| ------------- |:-------------:| :-----:|
| POST    | "/reservation/create/"     |   Reserve a Car |
| GET      | "/reservation/{id}" | Get Reservation details |
| PUT    | "/reservation/modify/{id}"  |   Edit a Reservation |
| POST      | "/reservation/cancel/{id}" | Cancel a Reservation |

| API Method        | URI           | Usecase  |
| ------------- |:-------------:| :-----:|
| POST    | "/activity/pickUp"    |  Check Out a Car |
| POST    | "/activity/return"    |   Return a Car |

| API Method        | URI           | Usecase  |
| ------------- |:-------------:| :-----:|
| GET    | "/bill/{reservation-id}"    |  Get Bill for a specific reservation by Id |
| GET    | "/bill/id"    |   Get Bill by billId |


### Future Enhancements
This is an on-going project and I will be updating all the future enhancements to the
Issues tab. Check [here](https://github.com/Manju-panthangi/Zoom-Car-Clone/issues) for this list of upcoming features.
