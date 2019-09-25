25 Regular Exam
===============

EXODIA
======

**EXODIA** (**E**nterprise **X**erox **O**pen **D**elivery **I**nformation
**A**pplication) is an application which manages a queue of documents to be
printed. Normally this process is managed by the printers (after all it’s the
21st century). However, some companies do not think like that and they use
printers from BC. One such company is the **ORACLE** corporation (**O**bscurely
**R**uthless **A**mateur **C**razy **L**unatic **E**mployees), which has hired
you to implement the **EXODIA** application platform.

1.Database Requirements
-----------------------

The **Database** of **EXODIA** needs to support **2 entities**:

### User 

-   Has an **Id** – a **UUID** String

-   Has a **Username**

-   Has a **Password**

-   Has an **Email**

### Document

-   Has an **Id** – a **UUID** String

-   Has a **Title** – a String

-   Has a **Content** – a String

Implement the entities with the **correct datatypes** and implement
**repositories** for them.  
The **Document**’s **Content** should support very long strings.

2.Page Requirements
-------------------

### Index Page (logged-out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65580863-240c3380-df83-11e9-875a-aa944830575a.png" alt="alt text" width="900" height=""></kbd>

### Login Page (logged-out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65580881-28d0e780-df83-11e9-81c8-d796f70767b9.png" alt="alt text" width="900" height=""></kbd>

### Register Page (logged-out user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65580886-2b334180-df83-11e9-831b-72486510d8eb.png" alt="alt text" width="900" height=""></kbd>

### Home Page (logged-in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65580894-2e2e3200-df83-11e9-99d6-1ff77182d107.png" alt="alt text" width="900" height=""></kbd>

**NOTE**: As you can see the **elements** are **aligned** to the **left**,
**regardless of their count**. The **maximum count** is **5 per row**, however
they are **always aligned** to the **left**.

**NOTE**: The **Documents**’ **Titles** are **visualized** and **trimmed** to
the **12-th symbol**, then **concatenated** with a "**…**" (**3 dots**).

### Schedule Page (logged-in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65580901-31292280-df83-11e9-96bf-8a6e80a5dac3.png" alt="alt text" width="900" height=""></kbd>

### Details Page (logged-in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65580902-338b7c80-df83-11e9-8a5b-53755ee4585f.png" alt="alt text" width="900" height=""></kbd>

### Print Page (logged-in user)

<kbd><img src="https://user-images.githubusercontent.com/32310938/65580905-35554000-df83-11e9-985d-d5c6b517e20d.png" alt="alt text" width="900" height=""></kbd>

The templates have been given to you in the application skeleton, so make sure
you implement the pages correctly.

**NOTE**: The templates should look **EXACTLY** as shown above.

**NOTE**: The templates do **NOT require additional CSS** for you to write. Only
**bootstrap** and the **given css** are enough.

3.Functionality
---------------

The functionality of EXODIA is very simple.

### Users

**Guests** can **Register**, **Login** and view the **Index Page**.

**Users** can **Schedule Documents** to be printed. **Users** can also see
**Scheduled Documents** on the **Home Page**, where they can also **Print** or
view **Details** about each one of them.

### Documents

**Documents** can be **Scheduled** for printing by **Users**. All **Scheduled**
documents are visualized on the **Home Page**, each one in its own separate
rectangular element.

**Documents** may contain large amounts of data so only their **Titles** are
visualized on the **Home Page**. Their **Titles** are visualized up to the
**12-th symbol**, followed by **3 dots** ("**…**").

**Documents** are visualized on the **Home Page** with 2 buttons – [**Print**]
and [**Details**].

-   The [**Print**] button leads to the **Print Page** – a simple
    confirmation-like page.

-   The [**Details**] button leads to the **Details Page** – a simple details
    visualization page.

**Printing** a **Document** is like **deleting** it – it should be **removed**
from the **database** of the **EXODIA** application.

### Redirections

-   Upon successful **Registration** of a **User**, you should be redirected to
    the **Login Page**.

-   Upon successful **Login** of a **User**, you should be redirected to the
    **Home Page**.

-   Upon successful **Scheduling** of a **Document**, you should be redirected
    to the **Document**’s **Details Page**.

-   Upon successful **Printing** of a **Document**, you should be redirected to
    the **Home Page**.

-   Upon successful **Logout** of a **User**, you should be redirected to the
    **Index Page**.

### General

The **application** should **store** its **data** into a **MySQL** database,
using **Hibernate** native.

4.Security
----------

The **Security** section mainly describes access requirements. Configurations
about which users can access specific functionalities and pages.

-   **Guest** (not logged in) users can access **Index** page.

-   **Guest** (not logged in) users can access **Login** page.

-   **Guest** (not logged in) users can access **Register** page.

-   **Users** (logged in) cannot access **Guest** pages.

-   **Users** (logged in) can access **Home** page.

-   **Users** (logged in) can access **Schedule** page and functionality.

-   **Users** (logged in) can access **Print** page and functionality.

-   **Users** (logged in) can access **Details** page.

-   **Users** (logged in) can access **Logout** functionality.

5.Code Quality
--------------

Make sure you provide the best architecture possible. Structure your code into
different modules, divide and conquer, follow the principles of high-quality
code. You will be scored for the **Code Quality** and **Architecture** of your
project.

6.Bonus
-------

The **ORACLE** corporation has given you a bonus task if you think that the
whole **EXODIA** application is easy to implement.

Extend the **Printing** functionality by **sending** a **formatted PDF** of the
**Document** to the **User**. All other functionality stays the same.

The formatting is simple:

-   If you see a line starting with (from 1 to 6) "**\#**", you should treat
    that line as a **\<h1\>** - **\<h6\>** element, and it should have a
    **\<hr\>** (horizontal line after it).

-   If you see a line starting with a "**\***" (**star symbol**), you should
    treat that line as a **\<li\>** element inside a **\<ul\>** element.

-   If you see text wrapped in "**\*\***" (double stars) you should make that
    text **bold**.

The **Title** of the **Document** should be rendered as a centered **\<h1\>**
element with a **\<hr\>** element below it.

The **Content** of the **Document** should be **formatted** (as specified above)
and rendered below the **Title**.

7.Scoring
---------

### Database – 10 points.

### Pages – 15 points.

### Functionality – 30 points.

### Security – 15 points.

### Code Quality – 30 points.

### Bonus – 10 points.
<br/>

### Solution: <a title="Exodia" href="https://github.com/TsvetanNikolov123/JAVA---Java-Web-Development-Basics/tree/master/25%20Exam/Exodia">Exodia</a>

---