18 Retake Exam
==============

---
---

Andrey's
========

---
---

Exam for the [“Java Web Development Basics” course \@
SoftUni](https://softuni.bg/trainings/2445/java-web-basics-september-2019).
Submit your solutions on the course page, so that you can be evaluated by your
fellow colleagues.

**Andrey's** is an shop application. There are several requirements you must
follow in the implementation.

Database Requirements
---------------------

The **Database** of the **Andrey's** application needs to support **2
entities**:

### User

-   Has an **Id – UUID-string**

-   Has a **Username**

-   Has a **Password**

-   Has an **Email**

### Product

-   Has an **Id – UUID-string**

-   Has a **Name**

-   Has a **Description**

-   Has a **Price**

-   Has a **Category – option between (Shirt, Denim, Shorts ,Jacket)**

-   Has a **Sex – option between (Male and Female)**

>   Implement the entities with the **correct datatypes** and implement
>   **repositories** for them.

Page Requirements
-----------------

### Index Page (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71505214-12d60a00-2885-11ea-968d-b5a5a32e0988.png" alt="alt text" width="800" height=""></kbd>

### Login Page (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71505216-149fcd80-2885-11ea-833f-067fa6d9596d.png" alt="alt text" width="800" height=""></kbd>

### Register Page (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71505224-179abe00-2885-11ea-9d9a-e09204d2e27e.png" alt="alt text" width="800" height=""></kbd>

### Home Page (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71505231-19648180-2885-11ea-806c-7a5347c5e560.png" alt="alt text" width="800" height=""></kbd>

### Add Product (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71505234-1bc6db80-2885-11ea-8f75-caecb6e25b27.png" alt="alt text" width="800" height=""></kbd>

### Product Details Page (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/71505237-1d909f00-2885-11ea-8149-2f023b7c0e77.png" alt="alt text" width="800" height=""></kbd>

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
to **logout**, **add a Product**, **view details** about a **Product**,
**delete** a **Product**, and **view all Products**(**Home page**).

**Andray's button** in navbar should redirect to appropriate **URL depending**
on that if the user is logged in.

The **application** should provide **functionality** for **adding products**
with **category (Shirt, Denim, Shorts, Jacket) and sex(Male,Female)**

The **image** is combination between **category** and **sex**. When you click on
the image on **Home Page**, you should be redirected to **Details page**. On
**Details page** you should have **Delete button**.

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

-   **Users** (logged in) can access **Product Add** page.

-   **Users** (logged in) can access **Product Details** page.

-   **Users** (logged in) can access **Logout** functionality.

Scoring
-------

### Database – 10 points.

### Pages – 30 points.

### Functionality – 40 points.

### Security – 10 points.

### Code Quality – 10 points.

<br/>

### Solution: <a title="Andrey's" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/Java%20Web%20Basics%20-%20September%202019/18%20RetakeExamJavaWebBasic/retakeexamjavawebasic">Andrey's</a>

---