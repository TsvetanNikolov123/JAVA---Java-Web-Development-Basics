21 Workshop – JavaServer Faces
==============================

PANDA
=====

---
---

**PANDA** (**P**ackage **A**cceptance and **N**ational **D**elivery
**A**pplication) is a platform for package deliveries, which is a fast-rising
Start-Up, which lacks a web application. You have been employed by the **KFC**
(**K**ung-**F**u-**C**hicken) Corporation to implement a web platform for
**PANDA**.

1.Database Requirements
-----------------------

The **Database** of the **PANDA** application needs to support **3 entities**:

### User

-   Has an **Id** – a **UUID String** or an **Integer**.

-   Has an **Username**

-   Has a **Password**

-   Has an **Email**

-   Has an **Role** – can be one of the following values (“**User**”,
    “**Admin**”)

### Package

-   Has an **Id** – a **UUID String** or an **Integer**.

-   Has a **Description** – a string.

-   Has a **Weight** – a floating-point number.

-   Has a **Shipping Address** – a string.

-   Has a **Status** – can be one of the following values (“**Pending**”,
    “**Shipped**”, “**Delivered**”, “**Acquired**”)

-   Has an **Estimated Delivery Date** – A **LocalDateTime** object.

-   Has a **Recipient** – a **User** object.

### Receipt

-   Has an **Id** – a **UUID String** or an **Integer**.

-   Has a **Fee** – a decimal number.

-   Has an **Issued On** – a **LocalDateTime** object.

-   Has a **Recipient** – a **User** object.

-   Has a **Package** – a **Package** object.

Implement the entities with the **correct datatypes**.

2.Template Requirements
------------------------

### Guest Templates

These are the **templates** and **functionalities**, accessible by **Guests**
(**logged out** users).

#### Index Template (route = "/") (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550067-77509880-df27-11e9-9fb4-3517b1e4d2d8.png" alt="alt text" width="900" height=""></kbd>

#### Login Template (route = "/login") (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550085-80416a00-df27-11e9-8c53-d49fe60452e1.png" alt="alt text" width="900" height=""></kbd>

#### Register Template (route = "/register") (logged out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550103-89323b80-df27-11e9-8a35-cc2a9022b7c2.png" alt="alt text" width="900" height=""></kbd>

### User Templates

These are the **templates** and **functionalities**, accessible by **Users**
(**logged in** users with **Role** - **User**).

#### LoggedIn Index Template (route="/") (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550126-918a7680-df27-11e9-8ce2-d2f2162141d5.png" alt="alt text" width="900" height=""></kbd>

#### Package Details Template (route="/packages/details?id={id}") (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550185-b67ee980-df27-11e9-9234-5d3d9edbc550.png" alt="alt text" width="900" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550930-5c7f2380-df29-11e9-9aa6-53ff83b5b7f1.png" alt="alt text" width="350" height=""></kbd>
<kbd><img src="https://user-images.githubusercontent.com/32310938/65550236-d6161200-df27-11e9-8516-291ac9f6561c.png" alt="alt text" width="350" height=""></kbd>

**NOTE**:

-   If the **package’s status** is **Pending**, it should **NOT** have an
    **Estimated Delivery Date**, and “**N/A**” should be presented.

-   If the **package’s status** is **Shipped**, it will have an **Estimated
    Delivery Date**. In that case the **date** should presented instead of
    “**N/A**”. (Example: “**29/02/2016**”).

-   If the **package’s status** is **Delivered** or **Acquired**, instead of the
    **date**, “**Delivered**” should be presented.

#### Receipts Template (route="/receipts") (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550262-e928e200-df27-11e9-89d5-b6d5567e061c.png" alt="alt text" width="900" height=""></kbd>

#### Receipt Details Template (route="/receipts/details?id={id}") (logged in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550841-2b065800-df29-11e9-8566-16f970c011f6.png" alt="alt text" width="900" height=""></kbd>

### Admin Templates

These are the **templates** and **functionalities**, accessible by **Admins**
(**logged in** users with **Role** - **Admin**).

#### Admin Index Template (route="/") (logged in admin)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550870-3194cf80-df29-11e9-9ee0-f0cc606ac2a3.png" alt="alt text" width="900" height=""></kbd>

The navigation links above should lead to:

-   [**Pending**] – **Pending Packages**

-   [**Shipped**] – **Shipped Packages**

-   [**Delivered**] – **Delivered Packages**

-   [**Package**] – **Create Package**

#### Package Details Admin Template (route="/packages/details?id={id}") (logged in admin)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550894-43767280-df29-11e9-9e64-8e3ef194edae.png" alt="alt text" width="900" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550219-cac2e680-df27-11e9-8ec2-e84cf9aac90c.png" alt="alt text" width="350" height=""></kbd>
<kbd><img src="https://user-images.githubusercontent.com/32310938/65550944-656ff500-df29-11e9-9bf3-e4f7018cfbaf.png" alt="alt text" width="350" height=""></kbd>

**NOTE**:

-   If the **package’s status** is **Pending**, it should **NOT** have an
    **Estimated Delivery Date**, and “**N/A**” should be presented.

-   If the **package’s status** is **Shipped**, it will have an **Estimated
    Delivery Date**. In that case the **date** should presented instead of
    “**N/A**”. (Example: “**29/02/2016**”).

-   If the **package’s status** is **Delivered** or **Acquired**, instead of the
    **date**, “**Delivered**” should be presented.

#### Receipts Admin Template (route="/receipts") (logged in admin)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550960-74ef3e00-df29-11e9-882c-ff8b9e403a54.png" alt="alt text" width="900" height=""></kbd>

#### Receipt Details Admin Template (route="/receipts/details?id={id}") (logged in admin)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65551371-74a37280-df2a-11e9-81e2-4b499cc90e3f.png" alt="alt text" width="900" height=""></kbd>

#### Package Create Admin Template (route="/packages/create") (logged in admin)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550984-7fa9d300-df29-11e9-954c-8253f5b54276.png" alt="alt text" width="900" height=""></kbd>

**NOTE**: The **Recipients** field is a **dropdown menu**, with **all the
registered users** in the **application** (including **yourself**). The
**primarily selected option** should be "**-- Choose Recipient --**" and it
should be **disabled**, so that it **cannot** be **selected**.

#### Pending Packages Admin Template (route="/packages/pending") (logged in admin)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65550996-859fb400-df29-11e9-974a-ebe4624239c4.png" alt="alt text" width="900" height=""></kbd>

#### Shipped Packages Admin Template (route="/packages/shipped") (logged in admin)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65551008-8a646800-df29-11e9-8bae-a87492eb4262.png" alt="alt text" width="900" height=""></kbd>

#### Delivered Packages Admin Template (route="/packages/delivered") (logged in admin)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65551013-8f291c00-df29-11e9-942c-c97e3d856262.png" alt="alt text" width="900" height=""></kbd>

All of the templates will be given to you in the form of HTML files, so make
sure you implement your pages correctly.

**NOTE**: The templates should look **EXACTLY** as shown above.

**NOTE**: The templates do **NOT require additional CSS**. Only **bootstrap**
and the given **style.css** are enough.

**NOTE**: In the given **style.css** you’ll see some helpful classes
“**bg-panda**”, “**text-panda**”, “**border-panda**”. “**border-panda**” will
help you with the **border** of the **blocks** on the **Index Pages**.

3.Functional Requirements
-------------------------

The **Functionality Requirements** describe the functionality that the
**Application** must support.

The **application** should provide **Guest** (not logged in) users with the
functionality to:

-   **Login**

-   **Register**

-   **View** the **Guest Index** page

The **application** should provide **Users** (logged in) with the functionality
to:

-   **Logout**

-   **View** their **Packages**

-   **View details** about a **Package**

-   **View** their **Receipts**

-   **View details** about a **Receipt**

The **application** should provide **Admins** (logged in, with **role** -
**Admin**) with the functionality to:

-   **Logout**

-   **View** their **Packages**

-   **View details** about a **Package**

-   **View** their **Receipts**

-   **View details** about a **Receipt**

-   **View** all **Pending Packages**

-   **View** all **Shipped Packages**

-   **View** all **Delivered Packages**

-   **View details** about all **Delivered Packages**

-   **Ship Packages**

-   **Deliver Packages**

### Users

The **first registered User** should be **assigned** a **role** – "**Admin**".
Every **User** after that, should have a **role** – "**User**".

**Users** have **Packages**, which are **created** and **controlled** for them,
by an **Administrator**.

**Users** can **view Details** about their **own Packages**.

When a **Package** is **delivered**, a **User** can **acquire** it, at which
point a **Receipt** is **created** with **that Package** and **that User**.

**Users** can **view** their **Receipts**, and **details** about each
**Receipt**.

**Administrators** (role = "**Admin**") are essentially like normal **Users**.
They can also have **Packages**, which are **delivered**, **acquired** and they
also have **Receipts**.

**Administrators** can also **create Packages** for a specific **User**.

-   They can also **view** all **Pending Packages**, and they can **Ship** them.

-   They can also **view** all **Shipped Packages**, and they can **Deliver**
    them.

-   They can also **view** all **Delivered Packages**, and they can view
    **Details** about them.

### Packages

When **Packages** are **created**, they are **created** with a **Description**,
a **Weight**, a **Shipping Address** and a **Recipient User**.

-   Upon creation, the **Status** of a **Package** should be set to **Pending**.

-   Upon creation, the **Estimated Delivery Date** of a **Package** should be
    set to **NULL**.

#### Functionality

##### Pending Packages

A **Pending Package**, can be **Shipped** by an **Administrator**, by clicking
on the [**Ship**] button from the **Pending Packages** Page. At that moment the
**Package Status** becomes "**Shipped**" and the **Estimated Delivery Date** is
to be set to a **random** of **20**-**40** days from then.

-   **All Pending Packages** are presented on the **Pending Packages Page**.

-   A **User** can view his **Pending Packages** on his **Index Page** in the
    **Pending** rectangular block.

-   A **User** can **view details** about each one of his **Pending Packages**
    from his **Index Page**, by clicking on the [**Details**] button.

##### Shipped Packages

A **Shipped Package**, can be **Delivered** by an **Administrator**, by clicking
on the [**Deliver**] button from the **Shipped Packages Page**. At that moment
the **Package Status** becomes "**Delivered**".

-   **All Shipped Packages** are presented on the **Shipped Packages Page**.

-   A **User** can view his **Shipped Packages** on his **Index Page** in the
    **Shipped** rectangular block.

-   A **User** can **view details** about each one of his **Shipped Packages**
    from his **Index Page**, by clicking on the [**Details**] button.

##### Delivered Packages

A **Delivered Package**, can be **Acquired** by the **Package**’s **Recipient**,
by clicking on the [**Acquire**] button from his **Index Page**. At that moment
the **Package Status** becomes "**Acquired**" and a **Receipt** is **generated**
to the **User** for that **Package**.

-   **All Delivered Packages** are presented on the **Delivered Packages Page**.

-   A **User** can view his **Delivered Packages** on his **Index Page** in the
    **Delivered** rectangular block.

-   A **User** can **Acquire** each one of his **Delivered Packages** from his
    **Index Page**, by clicking on the [**Acquire**] button.

**NOTE**: The **INDEX PAGE** visualizes **ONLY** the **CURRENTLY LOGGED IN USER
/ ADMIN’s PACKAGES**.

**NOTE**: **Acquired Packages** are viewable only by **Administrators** on the
**Delivered Packages Page**.

**NOTE**: **Administrators** can **view details** about **ALL Delivered** /
**Acquired Packages** from the  
**Delivered Packages Page**, by clicking on the [**Details**] button.

### Receipts

**Receipts** are just data entities. They are **created** when a **Package** is
**Acquired** by its **Recipient User**.  
A **Receipt** should be **created** with a **Package** and a **Recipient User**.

Upon creation, a **Receipt**’s **Fee** should be **set** to the **Package**’s
**Weight multiplied** (\*) by **2.67**.

Upon creation, a **Receipt**’s **IssuedOn** should be set to the **current
moment**.

4.Security Requirements
-----------------------

The **Security Requirements** are mainly access requirements. Configurations
about which users can access specific functionalities and pages.

-   **Guest** (not logged in) users can access **Index** page and functionality.

-   **Guest** (not logged in) users can access **Login** page and functionality.

-   **Guest** (not logged in) users can access **Register** page and
    functionality.

-   **Users** (logged in) can access **User LoggedIn Index** page and
    functionality.

-   **Users** (logged in) can access **User Package Details** page and
    functionality.

-   **Users** (logged in) can access **User Receipts** page and functionality.

-   **Users** (logged in) can access **User Receipt Details** page and
    functionality.

-   **Users** (logged in) can access **User Package Acquire** functionality.

-   **Users** (logged in) can access **Logout** functionality.

-   **Admins** (logged in) can access **every functionality** a **normal**
    logged in **User** can.

-   **Admins** (logged in) can access **Admin LoggedIn Index** page and
    functionality.

-   **Admins** (logged in) can access the **Admin Package Create** page and
    functionality.

-   **Admins** (logged in) can access the **Admin Pending Packages** page and
    functionality.

-   **Admins** (logged in) can access the **Admin Shipped Packages** page and
    functionality.

-   **Admins** (logged in) can access the **Admin Delivered Packages** page and
    functionality.

-   **Admins** (logged in) can access the **Admin Package Ship** functionality.

-   **Admins** (logged in) can access the **Admin Package Deliver**
    functionality.
<br/>

### Solution: <a title="PANDA" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/21%20WORKSHOP%20JAVA%20EE%20JSF%20%2B%20JPA/PANDA/panda">PANDA</a>

---