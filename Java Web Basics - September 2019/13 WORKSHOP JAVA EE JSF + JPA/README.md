13 Workshop: JSF
================

Sboj.gb
=======

---
---

**Sboj.gb** is an application for job offers. You have been tasked to implement
this application for an unusually low price, by an unusually rich client. There
are several requirements you must follow in the implementation.

Database Requirements
---------------------

The **Database** of the **Sboj.gb** application needs to support **2 entities**:

### User

-   Has an **Username**

-   Has a **Password**

-   Has an **Email**

### Job Application

-   Has a **Sector**

-   Has a **Profession**

-   Has a **Salary**

-   Has a **Description**

Implement the entities with the **correct datatypes**, and implement
**repositories** for them.

Page Requirements
-----------------

### Index Page (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504708-24b6ad80-2883-11ea-8fee-ca47270d7f9b.png" alt="alt text" width="800" height=""></kbd>

### Login Page (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504712-284a3480-2883-11ea-8f37-eb6f33ace93b.png" alt="alt text" width="800" height=""></kbd>

### Register Page (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504713-2b452500-2883-11ea-888c-62ff4802013e.png" alt="alt text" width="800" height=""></kbd>

### Home Page (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504717-2e401580-2883-11ea-9497-6f5354fba71b.png" alt="alt text" width="800" height=""></kbd>

### Add Job Page (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504719-313b0600-2883-11ea-8e77-bbf4a9b8edf6.png" alt="alt text" width="800" height=""></kbd>

### Job Details Page (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504723-3435f680-2883-11ea-94c8-346d3bdd3c69.png" alt="alt text" width="800" height=""></kbd>

### Job Delete Page (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71504727-3730e700-2883-11ea-9704-3c2b4041a6f2.png" alt="alt text" width="800" height=""></kbd>

The templates have been given to you in the application skeleton, so make sure
you implement the pages correctly.

**NOTE**: The templates should look **EXACTLY** as shown above.

**NOTE**: The templates do **NOT require additional CSS** for you to write. Only
**bootstrap** and the **given css** are enough.

Functional Requirements
-----------------------

The **Functionality Requirements** describe the functionality that the
**Application** must support.

The **application** should provide **Guest** (not logged in) users with the
functionality to **login**, **register** and **view** the **Index** page.

The **application** should provide **Users** (logged in) with the functionality
to **logout**, **create** a **Job**, **view details** about a **Job**,
**delete** a **Job**, and **view all Jobs** (**Home page**).

The **application** should provide **functionality** for **adding jobs** with
**only 5 sectors** – “**Medicine**”, “**Car**”, “**Food**”, “**Domestic**”,
“**Security**”.

The **application** should **store** its **data** into a **MySQL** database,
using **Hibernate** native.

Security Requirements
---------------------

The **Security Requirements** are mainly access requirements. Configurations
about which users can access specific functionalities and pages.

-   **Guest** (not logged in) users can access **Index** page.

-   **Guest** (not logged in) users can access **Login** page.

-   **Guest** (not logged in) users can access **Register** page.

-   **Users** (logged in) can access **Home** page.

-   **Users** (logged in) can access **Job Details** page.

-   **Users** (logged in) can access **Job Delete** page.

-   **Users** (logged in) can access **Add Job** page.

-   **Users** (logged in) can access **Logout** functionality.

<br/>

### Solution: <a title="Sboj.gb" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/Java%20Web%20Basics%20-%20September%202019/13%20WORKSHOP%20JAVA%20EE%20JSF%20%2B%20JPA/jsfworkshop">Sboj.gb</a>

---