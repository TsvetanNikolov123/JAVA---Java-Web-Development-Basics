15 Workshop – Servlets & JSP
============================

MeTube v.2
==========

---
---

**MeTube** is like YouTube, “**ama ne bash**” like an old Bulgarian Sage once
said. You have been tasked to implement this application for literally no money,
by the richest man on earth. There are several requirements you must follow in
the implementation.

1.Database Requirements
-----------------------

The **Database** of the application needs to support **2 entities**:

### User

-   Has an **Username**

-   Has a **Password**

-   Has an **Email**

-   Has **Tubes** (a collection of **tubes**)

### Tube

-   Has a **Title**

-   Has an **Author**

-   Has an **Description**

-   Has an **Youtube Id –** This Id is only for the **youtube video**. It is not
    the **Entity’s id**.

-   Has **Views** (an **integer**, by default – **0**)

-   Has an **Uploader** (a **User**).

Implement the entities with the **correct datatypes**, and implement
**repositories** for them.

2.Templates
-----------

### Index Template (route = “/”) (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65547455-31dd9c80-df22-11e9-9f48-ef1c50fab480.png" alt="alt text" width="900" height=""></kbd>

### Login Template (route = “/login”) (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65547465-37d37d80-df22-11e9-90ad-4fd39a42ded0.png" alt="alt text" width="900" height=""></kbd>

### Register Template (route = “/register”) (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65547475-3a35d780-df22-11e9-8824-f5c48a5f86a2.png" alt="alt text" width="900" height=""></kbd>

### Home Template (route=”/home”) (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65547487-3f932200-df22-11e9-9401-8fa2792c2954.png" alt="alt text" width="900" height=""></kbd>

### Profile Template (route=”/profile”) (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65547501-4326a900-df22-11e9-86f7-e77b4f751a2a.png" alt="alt text" width="900" height=""></kbd>

### Tube Details Template (route=”/tube/details/{id}”) (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65547505-45890300-df22-11e9-9a5c-c41960d009e5.png" alt="alt text" width="900" height=""></kbd>

### Tube Upload Template (route=”/tube/upload”) (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65547517-4ae64d80-df22-11e9-8fb2-94367ddc2a8b.png" alt="alt text" width="900" height=""></kbd>

**NOTE**: All the templates have been given to you as **.html** files. You need
to make **.jsp** files from them.

**NOTE**: The templates do **NOT require additional CSS** for you to write. Only
**bootstrap** and the **given css** are enough.

Functional Requirements
-----------------------

The **Functionality Requirements** describe the functionality that the
**Application** must support.

The **application** should provide **Guest** (not logged in) users with the
functionality to:

-   **Login**

-   **Register**

-   **View** the **Index** page.

The **application** should provide **Users** (logged in) with the functionality
to:

-   Logout

-   **View** all **Tubes** (**Home** page)

    -   The **Home** page holds **image thumbnails**.

-   **View** their **Profile** (Clicking on [**Profile**] button on **Home**
    page)

    -   **Only** the **Tubes** uploaded by the **User** should be **viewed.**

    -   The **username** and the **email** of the **user** should be viewed in
        the **format specified** in the screenshots above**.**

-   **View details** about **Tube**

    -   (Clicking on a **Tube**’s picture on **Home** page)

    -   (Clicking on the [**Details**] button on **Profile** page)

    -   **Each time** you view **details** about a **Tube**, you should
        **increment** it’s **views** by **1**.

    -   The **Details** page holds a **video iframe**.

-   **Upload** a **Tube**.

    -   The upload is done with a **youtube video link**.

        -   (**Example**: “**https://www.youtube.com/watch?v=uGhKqb2Ow3E**”)

    -   The last segment of the video is its **id** - **uGhKqb2Ow3E**.

    -   You can use that **id** to **extract** the **thumbnail** in order to
        view it on the **Home** page.

    -   You can use that **id** to **create** an **iframe** in order to view it
        on the **Details** page.

    -   Check how to implement these things on the internet, if you do not know.

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

-   **Users** (logged in) can access **Profile** page.

-   **Users** (logged in) can access **Upload** functionality.

-   **Users** (logged in) can access **Details** functionality.

-   **Users** (logged in) can access **Logout** functionality.
<br/>

### Solution: <a title="MeTube v.2" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/15%20WORKSHOP%20JAVA%20EE%20SERVLETS%20%2B%20JSP%20%2B%20JPA/MeTube%20v.2/MeTubeV2">MeTube v.2</a>

---