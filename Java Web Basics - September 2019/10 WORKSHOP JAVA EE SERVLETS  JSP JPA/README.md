10 Java EE Workshop – Servlets & JSP
====================================

---
---

West Compass Car Dealer Shop
----------------------------

---
---

West Compass Dealer Shop is an web application where you can add your car
offers. There are two main entities, Users and Cars .

## Database Requirements

The **Database** of the application needs to support **2 entities**:

### User

-   Has a **Username**

-   Has a **Password**

-   Has an **Email**

-   Has **Cars** (a collection of **cars**)

### Car

-   Has a **Brand**

-   Has a **Model**

-   Has a **Year**

-   Has an **Engine**

-   Has **User**

Implement the entities with the **correct datatypes**, and implement
**repositories** for them.

## Templates


### Index Template (route = “/index”) (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504217-3e56f580-2881-11ea-8eaf-bdb7a598cf2f.png" alt="alt text" width="800" height=""></kbd>

### Login Template (route = “/users/login”) (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504232-49118a80-2881-11ea-949d-0bf477fc769e.png" alt="alt text" width="800" height=""></kbd>

### Register Template (route = “/users/register”) (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504241-5464b600-2881-11ea-9ed3-8d6a8fcbb208.png" alt="alt text" width="800" height=""></kbd>

### Home Template (route=”/home”) (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504248-621a3b80-2881-11ea-89bb-9b38dee7deaf.png" alt="alt text" width="800" height=""></kbd>

### Cars Create Template (route=”/cars/create”) (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504259-6cd4d080-2881-11ea-9aab-6deced7cb1eb.png" alt="alt text" width="800" height=""></kbd>

### Cars All Template (route=”/cars/all”) (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504262-6f372a80-2881-11ea-8e95-7d54b0ffcfb4.png" alt="alt text" width="800" height=""></kbd>

**NOTE**: All the templates have been given to you as **.html** files. You need
to make **.jsp** files from them.

**NOTE**: The templates do **NOT require additional CSS** for you to write. Only
**bootstrap** and the **given css** are enough.

**NOTE:** To **include** the proper **CSS** use
"\$**{pageContext.request.contextPath}/css/style.css**".

## Functional Requirements

The **Functionality Requirements** describe the functionality that the
**Application** must support.

For **Index** you should use exactly "**/index"** as URL, not "**/**".

The **application** should provide **Guest** (not logged in) users with the
functionality to:

-   **Login**

-   **Register**

-   **View** the **Index** page.

The **application** should provide **Users** (logged in) with the functionality
to:

-   Logout

-   Home

-   **View** all **Cars** (**All Cars** page)

-   **Create** a **Car**.

The **application** should **store** its **data** into a **MySQL** database,
using **Hibernate** native.

## Security Requirements

The **Security Requirements** are mainly access requirements. Configurations
about which users can access specific functionalities and pages.

-   **Guest** (not logged in) users can access **Index** page.

-   **Guest** (not logged in) users can access **Login** page.

-   **Guest** (not logged in) users can access **Register** page.

-   **Users** (logged in) can access **Home** page.

-   **Users** (logged in) can access **Cars Create** page.

-   **Users** (logged in) can access **Cars All** page.

-   **Users** (logged in) can access **Logout** functionality.

<br/>

### Solution: <a title="West Compass Car Dealer Shop" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/Java%20Web%20Basics%20-%20September%202019/10%20WORKSHOP%20JAVA%20EE%20SERVLETS%20%20JSP%20JPA/carshop">West Compass Car Dealer Shop</a>

---