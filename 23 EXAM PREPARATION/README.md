23 Java Web Development Basics
==============================

Exam Preparation
================

Sboj.gb
=======

Exam Preparation problems for the [“Java Web Development Basics” course \@
SoftUni](https://softuni.bg/courses/java-web-development-basics). Submit your
solutions on the course page, so that you can be evaluated by your fellow
colleagues.

**Sboj.gb** is an application for job offers. You have been tasked to implement
this application for an unusually low price, by an unusually rich client. There
are several requirements you must follow in the implementation.

1.Database Requirements
-----------------------

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

<kbd><img src="https://user-images.githubusercontent.com/32310938/65579150-d8a45600-df7f-11e9-8829-e0d7a0e7dde2.png" alt="alt text" width="900" height=""></kbd>

### Login Page (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65579156-de01a080-df7f-11e9-8921-5ab36f67bfc1.png" alt="alt text" width="900" height=""></kbd>

### Register Page (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65579165-e35eeb00-df7f-11e9-8c9c-f38ad6f6cb0b.png" alt="alt text" width="900" height=""></kbd>

### Home Page (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65579175-e8239f00-df7f-11e9-84fa-5506c365c38e.png" alt="alt text" width="900" height=""></kbd>

### Add Job Page (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65579183-ece85300-df7f-11e9-91e3-950253aaf2b0.png" alt="alt text" width="900" height=""></kbd>

### Job Details Page (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65579189-f1ad0700-df7f-11e9-86d5-9c96ba0113a9.png" alt="alt text" width="900" height=""></kbd>

### Job Delete Page (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65579192-f40f6100-df7f-11e9-96bc-ea8d7a0dc876.png" alt="alt text" width="900" height=""></kbd>

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

### Solution: <a title="Sboj" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/23%20EXAM%20PREPARATION/sboj">Sboj</a>

---
