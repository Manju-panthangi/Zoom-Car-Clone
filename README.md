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
- User
 
> Search catalog: To search for vehicles by type and availability.
>
> GET - "Zoomcar-Clone/search"
> 
> Register new account/Cancel membership: To add a new member or cancel an existing membership.
>
> POST - "Zoomcar-Clone/register"
> 
> Reserve vehicle: To reserve a vehicle.
>
> POST - "Zoomcar-Clone/reserve"
>
> Check-out vehicle: To rent a vehicle.
>
> POST - "Zoomcar-Clone/checkOut"
> 
> Return a vehicle: To return a vehicle.
>
> POST - "Zoomcar-Clone/return"
- Admin

Has all the access of user.
> Add/Remove/Edit vehicle
> 
> POST - "Zoomcar-Clone/Admin/Add"
